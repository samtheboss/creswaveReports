package org.creswave.models;

import java.util.ArrayList;
import java.util.List;

public class FcdrrMoh744b {
  String DEPARTMENT;
  String ITEM_NAME;
  String ITEM_CODE;
  String UOM;
  double OPENING_BALANCE;
  double TOTAL_RECEIVED;
  double TOTAL_DISPENSED;
  double BREAKAGES_DAMAGES;
  double POSITIVE_ADJUSTMENT;
  double NEGATIVE_ADJUSTMENT;
  double CLOSING_STOCK;
  double SIX_MONTH_TO_EXPIRE;
  String EXPIRY_DATE;
  double REORDER_QTY;
  String ITEM_GROUP;

  public FcdrrMoh744b() {}

  public FcdrrMoh744b(
      String DEPARTMENT,
      String ITEM_NAME,
      String ITEM_CODE,
      String UOM,
      double OPENING_BALANCE,
      double TOTAL_RECEIVED,
      double TOTAL_DISPENSED,
      double BREAKAGES_DAMAGES,
      double POSITIVE_ADJUSTMENT,
      double NEGATIVE_ADJUSTMENT,
      double CLOSING_STOCK,
      double SIX_MONTH_TO_EXPIRE,
      String EXPIRY_DATE,
      double REORDER_QTY,
      String ITEM_GROUP) {
    this.DEPARTMENT = DEPARTMENT;
    this.ITEM_NAME = ITEM_NAME;
    this.ITEM_CODE = ITEM_CODE;
    this.UOM = UOM;
    this.OPENING_BALANCE = OPENING_BALANCE;
    this.TOTAL_RECEIVED = TOTAL_RECEIVED;
    this.TOTAL_DISPENSED = TOTAL_DISPENSED;
    this.BREAKAGES_DAMAGES = BREAKAGES_DAMAGES;
    this.POSITIVE_ADJUSTMENT = POSITIVE_ADJUSTMENT;
    this.NEGATIVE_ADJUSTMENT = NEGATIVE_ADJUSTMENT;
    this.CLOSING_STOCK = CLOSING_STOCK;
    this.SIX_MONTH_TO_EXPIRE = SIX_MONTH_TO_EXPIRE;
    this.EXPIRY_DATE = EXPIRY_DATE;
    this.REORDER_QTY = REORDER_QTY;
    this.ITEM_GROUP = ITEM_GROUP;
  }

  public String getDEPARTMENT() {
    return DEPARTMENT;
  }

  public void setDEPARTMENT(String DEPARTMENT) {
    this.DEPARTMENT = DEPARTMENT;
  }

  public String getITEM_NAME() {
    return ITEM_NAME;
  }

  public void setITEM_NAME(String ITEM_NAME) {
    this.ITEM_NAME = ITEM_NAME;
  }

  public String getITEM_CODE() {
    return ITEM_CODE;
  }

  public void setITEM_CODE(String ITEM_CODE) {
    this.ITEM_CODE = ITEM_CODE;
  }

  public String getUOM() {
    return UOM;
  }

  public void setUOM(String UOM) {
    this.UOM = UOM;
  }

  public double getOPENING_BALANCE() {
    return OPENING_BALANCE;
  }

  public void setOPENING_BALANCE(double OPENING_BALANCE) {
    this.OPENING_BALANCE = OPENING_BALANCE;
  }

  public double getTOTAL_RECEIVED() {
    return TOTAL_RECEIVED;
  }

  public void setTOTAL_RECEIVED(double TOTAL_RECEIVED) {
    this.TOTAL_RECEIVED = TOTAL_RECEIVED;
  }

  public double getTOTAL_DISPENSED() {
    return TOTAL_DISPENSED;
  }

  public void setTOTAL_DISPENSED(double TOTAL_DISPENSED) {
    this.TOTAL_DISPENSED = TOTAL_DISPENSED;
  }

  public double getBREAKAGES_DAMAGES() {
    return BREAKAGES_DAMAGES;
  }

  public void setBREAKAGES_DAMAGES(double BREAKAGES_DAMAGES) {
    this.BREAKAGES_DAMAGES = BREAKAGES_DAMAGES;
  }

  public double getPOSITIVE_ADJUSTMENT() {
    return POSITIVE_ADJUSTMENT;
  }

  public void setPOSITIVE_ADJUSTMENT(double POSITIVE_ADJUSTMENT) {
    this.POSITIVE_ADJUSTMENT = POSITIVE_ADJUSTMENT;
  }

  public double getNEGATIVE_ADJUSTMENT() {
    return NEGATIVE_ADJUSTMENT;
  }

  public void setNEGATIVE_ADJUSTMENT(double NEGATIVE_ADJUSTMENT) {
    this.NEGATIVE_ADJUSTMENT = NEGATIVE_ADJUSTMENT;
  }

  public double getCLOSING_STOCK() {
    return CLOSING_STOCK;
  }

  public void setCLOSING_STOCK(double CLOSING_STOCK) {
    this.CLOSING_STOCK = CLOSING_STOCK;
  }

  public double getSIX_MONTH_TO_EXPIRE() {
    return SIX_MONTH_TO_EXPIRE;
  }

  public void setSIX_MONTH_TO_EXPIRE(double SIX_MONTH_TO_EXPIRE) {
    this.SIX_MONTH_TO_EXPIRE = SIX_MONTH_TO_EXPIRE;
  }

  public String getEXPIRY_DATE() {
    return EXPIRY_DATE;
  }

  public void setEXPIRY_DATE(String EXPIRY_DATE) {
    this.EXPIRY_DATE = EXPIRY_DATE;
  }

  public double getREORDER_QTY() {
    return REORDER_QTY;
  }

  public void setREORDER_QTY(double REORDER_QTY) {
    this.REORDER_QTY = REORDER_QTY;
  }

  public String getITEM_GROUP() {
    return ITEM_GROUP;
  }

  public void setITEM_GROUP(String ITEM_GROUP) {
    this.ITEM_GROUP = ITEM_GROUP;
  }

  public static List<FcdrrMoh744b> populateStockMovement() {
    List<FcdrrMoh744b> stockMovement = new ArrayList<>();
    String itemGroup = "";
    for (int i = 1; i <= 30; i++) {
      if (i <= 10) {
        itemGroup = "OPTICAL LAB";
      } else if (i < 20) {
        itemGroup = "FRAMES";
      } else {
        itemGroup = "LENSES";
      }
      FcdrrMoh744b item =
          new FcdrrMoh744b(
              "Department" + i,
              "ItemName" + i,
              "ItemCode" + i,
              "UOM" + i,
              100.0 + i,
              50.0 + i,
              30.0 + i,
              5.0 + i,
              3.0 + i,
              2.0 + i,
              120.0 + i,
              10.0 + i,
              "2024-12-" + String.format("%02d", i % 30 + 1),
              20.0 + i,
              itemGroup);
      stockMovement.add(item);
    }
    return stockMovement;
  }
}
