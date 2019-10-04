/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojo;

/**
 *
 * @author MYPC
 */
public class DocumentMaster {

    private Integer iDMID;
    private String sDMType;
    private Integer iDMNumber;
    private String sDMDate;
    private String sDMName;
    private String sDMUpdateUser;
    private String sDMUpdateDateTime;

    public Integer getiDMID() {
        return iDMID;
    }

    public void setiDMID(Integer iDMID) {
        this.iDMID = iDMID;
    }

    public String getsDMType() {
        return sDMType;
    }

    public void setsDMType(String sDMType) {
        this.sDMType = sDMType;
    }

    public Integer getiDMNumber() {
        return iDMNumber;
    }

    public void setiDMNumber(Integer iDMNumber) {
        this.iDMNumber = iDMNumber;
    }

    public String getsDMDate() {
        return sDMDate;
    }

    public void setsDMDate(String sDMDate) {
        this.sDMDate = sDMDate;
    }

    public String getsDMName() {
        return sDMName;
    }

    public void setsDMName(String sDMName) {
        this.sDMName = sDMName;
    }

    public String getsDMUpdateUser() {
        return sDMUpdateUser;
    }

    public void setsDMUpdateUser(String sDMUpdateUser) {
        this.sDMUpdateUser = sDMUpdateUser;
    }

    public String getsDMUpdateDateTime() {
        return sDMUpdateDateTime;
    }

    public void setsDMUpdateDateTime(String sDMUpdateDateTime) {
        this.sDMUpdateDateTime = sDMUpdateDateTime;
    }
}
