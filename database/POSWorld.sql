-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema posworld
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `posworld` ;

-- -----------------------------------------------------
-- Schema posworld
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `posworld` DEFAULT CHARACTER SET utf8 ;
USE `posworld` ;

-- -----------------------------------------------------
-- Table `posworld`.`ProvinceMaster`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`ProvinceMaster` ;

CREATE TABLE IF NOT EXISTS `posworld`.`ProvinceMaster` (
  `PM_Province_ID` INT NOT NULL,
  `PM_Province_Name` VARCHAR(50) NULL,
  PRIMARY KEY (`PM_Province_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `posworld`.`RoleMaster`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`RoleMaster` ;

CREATE TABLE IF NOT EXISTS `posworld`.`RoleMaster` (
  `RM_Role_ID` INT NOT NULL,
  `RM_Role_Name` VARCHAR(45) NULL,
  PRIMARY KEY (`RM_Role_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `posworld`.`UserMaster`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`UserMaster` ;

CREATE TABLE IF NOT EXISTS `posworld`.`UserMaster` (
  `UM_ID` INT GENERATED ALWAYS AS () VIRTUAL,
  `UM_EPF_NO` INT NULL,
  `UM_FULL_NAME` VARCHAR(250) NULL,
  `UM_NIC_NO` VARCHAR(15) NULL,
  `UM_PP_NO` VARCHAR(15) NULL,
  `UM_EMAIL` VARCHAR(50) NULL,
  `UM_MOBILE_NO` VARCHAR(10) NULL,
  `UM_RESIDENT_NO` VARCHAR(10) NULL,
  `UM_ADDRESS` VARCHAR(250) NULL,
  `UM_PROVINCE_ID` INT NULL,
  `UM_DISTRICT_ID` INT NULL,
  `UM_CITY_ID` INT NULL,
  `UM_GENDER` VARCHAR(10) NULL,
  `UM_RELIGION` VARCHAR(20) NULL,
  `UM_RACE` VARCHAR(20) NULL,
  `UM_NATIONALITY` VARCHAR(20) NULL,
  `UM_IMAGE` VARCHAR(20) NULL,
  `UM_REMARKS` VARCHAR(250) NULL,
  `UM_LOCATION` VARCHAR(20) NULL,
  `UM_DIVISION` VARCHAR(20) NULL,
  `UM_DESIGNATION` VARCHAR(50) NULL,
  `UM_EMPLOYEE_STATUS` VARCHAR(10) NULL,
  `UM_USER_ROLE_ID` INT NULL,
  `UM_STATUS` VARCHAR(20) NULL,
  `UM_USERNAME` VARCHAR(50) NOT NULL,
  `UM_PASSWORD` VARCHAR(50) NULL,
  `UM_SECURITY_QUESTION_1` VARCHAR(200) NULL,
  `UM_SECURITY_ANSWER_1` VARCHAR(250) NULL,
  `UM_SECURITY_QUESTION_2` VARCHAR(200) NULL,
  `UM_SECURITY_ANSWER_2` VARCHAR(250) NULL,
  `UserMaster_UM_USERNAME` VARCHAR(50) NOT NULL,
  `UM_UPDATE_DATE_TIME` DATETIME NOT NULL,
  `ProvinceMaster_PM_Province_ID` INT NOT NULL,
  `RoleMaster_RM_Role_ID` INT NOT NULL,
  PRIMARY KEY (`UM_ID`),
  CONSTRAINT `fk_UserMaster_UserMaster1`
    FOREIGN KEY (`UserMaster_UM_USERNAME`)
    REFERENCES `posworld`.`UserMaster` (`UM_USERNAME`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_UserMaster_ProvinceMaster1`
    FOREIGN KEY (`ProvinceMaster_PM_Province_ID`)
    REFERENCES `posworld`.`ProvinceMaster` (`PM_Province_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_UserMaster_RoleMaster1`
    FOREIGN KEY (`RoleMaster_RM_Role_ID`)
    REFERENCES `posworld`.`RoleMaster` (`RM_Role_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_UserMaster_UserMaster1_idx` ON `posworld`.`UserMaster` (`UserMaster_UM_USERNAME` ASC) VISIBLE;

CREATE INDEX `fk_UserMaster_ProvinceMaster1_idx` ON `posworld`.`UserMaster` (`ProvinceMaster_PM_Province_ID` ASC) VISIBLE;

CREATE INDEX `fk_UserMaster_RoleMaster1_idx` ON `posworld`.`UserMaster` (`RoleMaster_RM_Role_ID` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `posworld`.`ProductMaster`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`ProductMaster` ;

CREATE TABLE IF NOT EXISTS `posworld`.`ProductMaster` (
  `PM_ID` INT NOT NULL,
  `PM_CODE` VARCHAR(10) NULL,
  `PM_BATCH_NO` VARCHAR(10) NULL,
  `PM_NAME` VARCHAR(150) NULL,
  `PM_DISCRIPTION` VARCHAR(250) NULL,
  `PM_PURCHASE_PRICE` DOUBLE NULL,
  `PM_MANUFACTURE_DATE` DATE NULL,
  `PM_SALES_PRICE` DOUBLE NULL,
  `PM_PACKED_FATE` DATE NULL,
  `PM_SUPPLIER_ID` INT NULL,
  `PM_EXPIRY_DATE` DATE NULL,
  `PM_STATUS` VARCHAR(20) NULL,
  `PM_REMARKS` VARCHAR(250) NULL,
  `UserMaster_UM_USERNAME` VARCHAR(50) NOT NULL,
  `UM_UPDATE_DATE_TIME` DATETIME NOT NULL,
  PRIMARY KEY (`PM_ID`),
  CONSTRAINT `fk_ProductMaster_UserMaster1`
    FOREIGN KEY (`UserMaster_UM_USERNAME`)
    REFERENCES `posworld`.`UserMaster` (`UM_USERNAME`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_ProductMaster_UserMaster1_idx` ON `posworld`.`ProductMaster` (`UserMaster_UM_USERNAME` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `posworld`.`AccountMaster`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`AccountMaster` ;

CREATE TABLE IF NOT EXISTS `posworld`.`AccountMaster` (
  `AM_ID` INT NOT NULL,
  `AM_CODE` VARCHAR(10) NULL,
  `AM_NAME` VARCHAR(150) NULL,
  `AM_CATEGORY` VARCHAR(100) NULL,
  `AM_PARENT` VARCHAR(100) NULL,
  `AM_GROUP` VARCHAR(10) NULL,
  `AM_TYPE` VARCHAR(100) NULL,
  `AM_SIGN` VARCHAR(10) NULL,
  `AM_OPENING BALANCE` DOUBLE NULL,
  `AM_ACC_NO` VARCHAR(50) NULL,
  `AM_ACC_TYPE` VARCHAR(50) NULL,
  `AM_BANK` VARCHAR(50) NULL,
  `AM_BRANCH` VARCHAR(50) NULL,
  `AM_CONTACT` VARCHAR(50) NULL,
  `AM_PHONE_NO_1` VARCHAR(50) NULL,
  `AM_PHONE_NO_2` VARCHAR(50) NULL,
  `AM_EMAIL` VARCHAR(50) NULL,
  `AM_VAT_NO` VARCHAR(50) NULL,
  `AM_ADDRESS` VARCHAR(250) NULL,
  `AM_REMARKS` VARCHAR(250) NULL,
  PRIMARY KEY (`AM_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `posworld`.`DocumentsMaster`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`DocumentsMaster` ;

CREATE TABLE IF NOT EXISTS `posworld`.`DocumentsMaster` (
  `DM_ID` INT NOT NULL,
  `DM_PURCHASE_ORDER_NO` INT NULL,
  `DM_PURCHASE_ORDER_DATE` DATE NULL,
  `DM_EXPECTED_DELIVERY_DATE` DATE NULL,
  `DM_SUPPLIER_NAME` VARCHAR(150) NULL,
  `DM_PURCHASE_ORDER_NUMBER` INT NULL,
  `DM_PURCHASE_RETURN_NUMBER` INT NULL,
  `DM_PURCHASE_RETURN_DATE` DATE NULL,
  `DM_GOODS_ISSUE_NOTE_NO` INT NULL,
  `DM_GOODS_ISSUE_NOTE_DATE` DATE NULL,
  `DM_GOODS_RETURN_NOTE_NO` INT NULL,
  `DM_GOODS_RETURN_NOTE_DATE` DATE NULL,
  `DM_PRIVILAGE_CARD` VARCHAR(50) NULL,
  `DM_CUSTOMER_NAME` VARCHAR(150) NULL,
  `DM_INVOICE_NUMBER` INT NULL,
  `DM_INVOICE_DATE` DATE NULL,
  `DM_SALES_RETURN_NUMBER` INT NULL,
  `DM_SALES_RETURN_DATE` DATE NULL,
  `DM_BANK_NAME` VARCHAR(50) NULL,
  `DM_CARD_NAME` VARCHAR(50) NULL,
  `DM_CARD_TYPE` VARCHAR(50) NULL,
  `DM_CARD_NUMBER` VARCHAR(50) NULL,
  `DM_GROSS_TOTAL` DOUBLE NULL,
  `DM_TOTAL_ITEM_DISCOUNT` DOUBLE NULL,
  `DM_SPECIAL DISCOUNT` DOUBLE NULL,
  `DM_TOTAL_DISCOUNT` DOUBLE NULL,
  `DM_NET_TOTAL` DOUBLE NULL,
  `DM_PAYMENT_TYPE` DOUBLE NULL,
  `DM_CASH_RECEIVED` DOUBLE NULL,
  `DM_CASH_BALANCE` DOUBLE NULL,
  `DM_USERNAME` VARCHAR(50) NOT NULL,
  `UserMaster_UM_USERNAME` VARCHAR(50) NOT NULL,
  `DM_UPDATE_DATE_TIME` DATETIME NOT NULL,
  PRIMARY KEY (`DM_ID`),
  CONSTRAINT `fk_DocumentsMaster_UserMaster1`
    FOREIGN KEY (`UserMaster_UM_USERNAME`)
    REFERENCES `posworld`.`UserMaster` (`UM_USERNAME`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_DocumentsMaster_UserMaster1_idx` ON `posworld`.`DocumentsMaster` (`UserMaster_UM_USERNAME` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `posworld`.`DocumentsDetails`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`DocumentsDetails` ;

CREATE TABLE IF NOT EXISTS `posworld`.`DocumentsDetails` (
  `DD_ID` INT NOT NULL,
  `DD_ITEM_CODE` VARCHAR(15) NULL,
  `DD_BATCH_NO` INT NULL,
  `DD_ITEM_NAME` VARCHAR(100) NULL,
  `DD_ITEM_DESCRIPTION` VARCHAR(150) NULL,
  `DD_UNIT_PRICE` DOUBLE NULL,
  `DD_QUANTITY` DOUBLE NULL,
  `DD_PURCHASE_PRICE` DOUBLE NULL,
  `DD_MANUFACTURE_DATE` DATE NULL,
  `DD_PACKED_DATE` DATE NULL,
  `DD_EXPIRY_DATE` DATE NULL,
  `DD_DISCOUNT` DOUBLE NULL,
  `DD_SALES_PRICE` DOUBLE NULL,
  `DD_RETURN_PURPOSE` DOUBLE NULL,
  `DD_SALES_RETURN_PRICE` DOUBLE NULL,
  `DD_REMARKS` VARCHAR(250) NULL,
  `DocumentsMaster_DM_ID` INT NOT NULL,
  PRIMARY KEY (`DD_ID`),
  CONSTRAINT `fk_DocumentsDetails_DocumentsMaster`
    FOREIGN KEY (`DocumentsMaster_DM_ID`)
    REFERENCES `posworld`.`DocumentsMaster` (`DM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_DocumentsDetails_DocumentsMaster_idx` ON `posworld`.`DocumentsDetails` (`DocumentsMaster_DM_ID` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `posworld`.`DocumenTypetMaster`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`DocumenTypetMaster` ;

CREATE TABLE IF NOT EXISTS `posworld`.`DocumenTypetMaster` (
  `DTM_ID` INT NOT NULL,
  `DTM_NAME` VARCHAR(50) NULL,
  PRIMARY KEY (`DTM_ID`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `posworld`.`ProductTransactionStores`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`ProductTransactionStores` ;

CREATE TABLE IF NOT EXISTS `posworld`.`ProductTransactionStores` (
  `PTS_ID` INT NOT NULL,
  `DocumentsMaster_DM_ID` INT NOT NULL,
  `ProductMaster_PM_ID` INT NOT NULL,
  `DocumenTypetMaster_DTM_ID` INT NOT NULL,
  `PTS_STOCK_ADD` DOUBLE NULL,
  `PTS_STOCK_DEDUCT` DOUBLE NULL,
  `UserMaster_UM_USERNAME` VARCHAR(50) NOT NULL,
  `PTS_UPDATE_DATE_TIME` DATETIME NOT NULL,
  PRIMARY KEY (`PTS_ID`),
  CONSTRAINT `fk_ProductTransactionStores_ProductMaster1`
    FOREIGN KEY (`ProductMaster_PM_ID`)
    REFERENCES `posworld`.`ProductMaster` (`PM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProductTransactionStores_DocumenTypetMaster1`
    FOREIGN KEY (`DocumenTypetMaster_DTM_ID`)
    REFERENCES `posworld`.`DocumenTypetMaster` (`DTM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProductTransactionStores_UserMaster1`
    FOREIGN KEY (`UserMaster_UM_USERNAME`)
    REFERENCES `posworld`.`UserMaster` (`UM_USERNAME`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProductTransactionStores_DocumentsMaster1`
    FOREIGN KEY (`DocumentsMaster_DM_ID`)
    REFERENCES `posworld`.`DocumentsMaster` (`DM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_ProductTransactionStores_ProductMaster1_idx` ON `posworld`.`ProductTransactionStores` (`ProductMaster_PM_ID` ASC) VISIBLE;

CREATE INDEX `fk_ProductTransactionStores_DocumenTypetMaster1_idx` ON `posworld`.`ProductTransactionStores` (`DocumenTypetMaster_DTM_ID` ASC) VISIBLE;

CREATE INDEX `fk_ProductTransactionStores_UserMaster1_idx` ON `posworld`.`ProductTransactionStores` (`UserMaster_UM_USERNAME` ASC) VISIBLE;

CREATE INDEX `fk_ProductTransactionStores_DocumentsMaster1_idx` ON `posworld`.`ProductTransactionStores` (`DocumentsMaster_DM_ID` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `posworld`.`ProductTransactionShowroom`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`ProductTransactionShowroom` ;

CREATE TABLE IF NOT EXISTS `posworld`.`ProductTransactionShowroom` (
  `PTSR_ID` INT NOT NULL,
  `ProductMaster_PM_ID` INT NOT NULL,
  `DocumentsMaster_DM_ID` INT NOT NULL,
  `DocumenTypetMaster_DTM_ID` INT NOT NULL,
  `PTSR_STOCK_ADD` DOUBLE NULL,
  `PTSR_STOCK_DEDUCT` DOUBLE NULL,
  `UserMaster_UM_USERNAME` VARCHAR(50) NOT NULL,
  `PTSR_UPDATE_DATE_TIME` DATETIME NOT NULL,
  PRIMARY KEY (`PTSR_ID`),
  CONSTRAINT `fk_ProductTransactionShowroom_ProductMaster1`
    FOREIGN KEY (`ProductMaster_PM_ID`)
    REFERENCES `posworld`.`ProductMaster` (`PM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProductTransactionShowroom_DocumenTypetMaster1`
    FOREIGN KEY (`DocumenTypetMaster_DTM_ID`)
    REFERENCES `posworld`.`DocumenTypetMaster` (`DTM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProductTransactionShowroom_UserMaster1`
    FOREIGN KEY (`UserMaster_UM_USERNAME`)
    REFERENCES `posworld`.`UserMaster` (`UM_USERNAME`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ProductTransactionShowroom_DocumentsMaster1`
    FOREIGN KEY (`DocumentsMaster_DM_ID`)
    REFERENCES `posworld`.`DocumentsMaster` (`DM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_ProductTransactionShowroom_ProductMaster1_idx` ON `posworld`.`ProductTransactionShowroom` (`ProductMaster_PM_ID` ASC) VISIBLE;

CREATE INDEX `fk_ProductTransactionShowroom_DocumenTypetMaster1_idx` ON `posworld`.`ProductTransactionShowroom` (`DocumenTypetMaster_DTM_ID` ASC) VISIBLE;

CREATE INDEX `fk_ProductTransactionShowroom_UserMaster1_idx` ON `posworld`.`ProductTransactionShowroom` (`UserMaster_UM_USERNAME` ASC) VISIBLE;

CREATE INDEX `fk_ProductTransactionShowroom_DocumentsMaster1_idx` ON `posworld`.`ProductTransactionShowroom` (`DocumentsMaster_DM_ID` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `posworld`.`AccountsTransaction`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`AccountsTransaction` ;

CREATE TABLE IF NOT EXISTS `posworld`.`AccountsTransaction` (
  `AT_ID` INT NOT NULL,
  `AT_CREDIT` DOUBLE NULL,
  `AT_DEBIT` DOUBLE NULL,
  `AccountMaster_AM_ID` INT NOT NULL,
  `DocumentsMaster_DM_ID` INT NOT NULL,
  `DocumenTypetMaster_DTM_ID` INT NOT NULL,
  `UserMaster_UM_USERNAME` VARCHAR(50) NOT NULL,
  `AT_UPDATE_DATE_TIME` DATETIME NOT NULL,
  PRIMARY KEY (`AT_ID`),
  CONSTRAINT `fk_AccountsTransaction_AccountMaster1`
    FOREIGN KEY (`AccountMaster_AM_ID`)
    REFERENCES `posworld`.`AccountMaster` (`AM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_AccountsTransaction_DocumentsMaster1`
    FOREIGN KEY (`DocumentsMaster_DM_ID`)
    REFERENCES `posworld`.`DocumentsMaster` (`DM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_AccountsTransaction_DocumenTypetMaster1`
    FOREIGN KEY (`DocumenTypetMaster_DTM_ID`)
    REFERENCES `posworld`.`DocumenTypetMaster` (`DTM_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_AccountsTransaction_UserMaster1`
    FOREIGN KEY (`UserMaster_UM_USERNAME`)
    REFERENCES `posworld`.`UserMaster` (`UM_USERNAME`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_AccountsTransaction_AccountMaster1_idx` ON `posworld`.`AccountsTransaction` (`AccountMaster_AM_ID` ASC) VISIBLE;

CREATE INDEX `fk_AccountsTransaction_DocumentsMaster1_idx` ON `posworld`.`AccountsTransaction` (`DocumentsMaster_DM_ID` ASC) VISIBLE;

CREATE INDEX `fk_AccountsTransaction_DocumenTypetMaster1_idx` ON `posworld`.`AccountsTransaction` (`DocumenTypetMaster_DTM_ID` ASC) VISIBLE;

CREATE INDEX `fk_AccountsTransaction_UserMaster1_idx` ON `posworld`.`AccountsTransaction` (`UserMaster_UM_USERNAME` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `posworld`.`DistrictMaster`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`DistrictMaster` ;

CREATE TABLE IF NOT EXISTS `posworld`.`DistrictMaster` (
  `DM_District_ID` INT NOT NULL,
  `DM_District_Name` VARCHAR(50) NULL,
  `DM_Province_ID` INT NULL,
  `ProvinceMaster_PM_Province_ID` INT NOT NULL,
  PRIMARY KEY (`DM_District_ID`),
  CONSTRAINT `fk_DistrictMaster_ProvinceMaster1`
    FOREIGN KEY (`ProvinceMaster_PM_Province_ID`)
    REFERENCES `posworld`.`ProvinceMaster` (`PM_Province_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_DistrictMaster_ProvinceMaster1_idx` ON `posworld`.`DistrictMaster` (`ProvinceMaster_PM_Province_ID` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `posworld`.`CityMaster`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`CityMaster` ;

CREATE TABLE IF NOT EXISTS `posworld`.`CityMaster` (
  `CM_City_ID` INT NOT NULL,
  `CM_City_Name` VARCHAR(50) NULL,
  `CM_District_ID` INT NULL,
  `DistrictMaster_DM_District_ID` INT NOT NULL,
  PRIMARY KEY (`CM_City_ID`),
  CONSTRAINT `fk_CityMaster_DistrictMaster1`
    FOREIGN KEY (`DistrictMaster_DM_District_ID`)
    REFERENCES `posworld`.`DistrictMaster` (`DM_District_ID`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_CityMaster_DistrictMaster1_idx` ON `posworld`.`CityMaster` (`DistrictMaster_DM_District_ID` ASC) VISIBLE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;


-- -----------------------------------------------------
-- Table `posworld`.`product_master`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `posworld`.`product_master` ;

CREATE TABLE `posworld`.`product_master` (
  `pm_product_id` INT NOT NULL,
  `pm_product_code` VARCHAR(10) NULL,
  `pm_product_batch_no` INT NULL,
  `pm_product_name` VARCHAR(150) NULL,
  `pm_product_description` VARCHAR(250) NULL,
  `pm_product_supplier_id` INT NULL,
  `pm_product_status` VARCHAR(20) NULL,
  `pm_product_running_stock` DECIMAL(9,3) NULL,
  `pm_product_reorder_level` DECIMAL(9,3) NULL,
  `pm_product_expiry_date` DATETIME NULL,
  `pm_product_purchace_price` DECIMAL(9,2) NULL,
  `pm_product_sale_price` DECIMAL(9,2) NULL,
  PRIMARY KEY (`pm_product_id`));


