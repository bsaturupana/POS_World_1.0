package util;

import com.sun.glass.events.KeyEvent;
import static java.lang.Double.parseDouble;
import java.text.DecimalFormat;
import java.util.regex.Pattern;
//convertDecimal

public class CommonFunctions {
    public String sCurrentButtonAction = "";
    double sFormattedFigure;
    DecimalFormat currencyFormat = new DecimalFormat("#,###0.00");
    DecimalFormat quantityFormat = new DecimalFormat("#,###0.000");
    
    public static boolean validateAlphanumericNumeric(String inputData) {
//        String validSymbols = "^[a-zA-Z0-9.]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$";
        String validSymbols = "[a-zA-Z0-9]+";
        boolean outputResult = false;
        
        if (inputData.matches(validSymbols)) {
            outputResult = true; 
        } else {
            outputResult = false;
        }
        
        return outputResult;
    }
    
    public static boolean validateAlphanumeric(String inputData) {
        boolean outputResult = false;
        
        if (inputData.matches("[a-zA-Z]+")) {
            outputResult = true; 
        } else {
            outputResult = false;
        }
        
        return outputResult;
    }
    
    public static boolean validateNumeric(String inputData) {
        boolean outputResult = false;
        
        if (inputData.matches("[0-9]+")) {
            outputResult = true; 
        } else {
            outputResult = false;
        }
        
        return outputResult;
    }

    public static boolean validateEmail(String inputEmail) {
        String validSymbols = "^[a-zA-Z0-9.]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$";
        boolean validResponse = false;
        
        if (!Pattern.matches(validSymbols, inputEmail)) {
            validResponse = false;
        } else {
            validResponse = true;
        }
        
        return validResponse;
    }

    public String convertCurrency(double getValue) {
        return currencyFormat.format(getValue);
    }

    public String convertQuantity(double getValue) {
        return quantityFormat.format(getValue);
    }

    public String checkIsEmptyString(String getValue) {
        return quantityFormat.format(getValue);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);

            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public static boolean restrictCharacters(java.awt.event.KeyEvent evt, String sText) {
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_DECIMAL) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            if (sText.contains(".")) {
                evt.consume();
                return false;
            }
            return false;
        } else {
            return true;
        }
    }

    public static boolean allowInteger(java.awt.event.KeyEvent evt, String sText) {
        char c = evt.getKeyChar();

        if (!(Character.isDigit(c)) || (c == KeyEvent.VK_BACKSPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
            return false;
        } else {
            return true;
        }
    }

    public double checkIsEmpty(String sFigure, String sFormatType) {
        if (sFigure.isEmpty()) {
            if (sFormatType.equals("Currency")) {
                sFormattedFigure = parseDouble(convertCurrency(Double.valueOf("0.00")));;
            } else if (sFormatType.equals("Quantity")) {
                sFormattedFigure = parseDouble(convertQuantity(Double.valueOf("0.000")));;
            }
        } else {
            if (sFormatType.equals("Currency")) {
                sFormattedFigure = parseDouble(convertCurrency(Double.valueOf(sFigure)));
            } else if (sFormatType.equals("Quantity")) {
                sFormattedFigure = parseDouble(convertQuantity(Double.valueOf(sFigure)));
            }
        }

        return sFormattedFigure;
    }
}
