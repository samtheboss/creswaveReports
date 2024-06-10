package org.creswave.models;

import java.util.ArrayList;
import java.util.List;

public class TherapyRegisterMOH418 {
    private String SERIAL_NO;
    private String DATE;
    private String NAME;
    private int AGE;
    private String NATURE_OF_VISIT;
    private String SEX;
    private String PATIENT_NUMBER;
    private String COUNTY;
    private String PHYSICAL_ADDRESS;
    private String OCCUPATION;
    private String TEL_CONTACT;
    private String NEXT_OF_KIN_TELEPHONE_CONTACT;
    private String SLT_BROAD_CATEGORIES;
    private String MEDICAL_DIAGNOSIS;
    private String SLT_DIAGNOSIS;
    private String DISABILITY_ASSESSMENT;
    private String ASSISTIVE_TECHNOLOGY_SERVICES;
    private String SPECIFIC_ASSISTIVE_PRODUCT;
    private String TREATMENT_INTERVENTIONS;
    private int TOTAL_TREATMENT_INTERVENTIONS;
    private String PAYMENT_MODE;
    private double AMOUNT_KSH;
    private String RECEIPT_INVOICE_NUMBER;
    private String REFERRALS_IN;
    private String REFERRAL_OUT;
    private String REMARKS_OUTCOMES;
    private String TCA;
    private String OFFICER_ATTENDING;

    public TherapyRegisterMOH418(String SERIAL_NO, String DATE, String NAME, int AGE, String NATURE_OF_VISIT, String SEX, String PATIENT_NUMBER, String COUNTY, String PHYSICAL_ADDRESS, String OCCUPATION, String TEL_CONTACT, String NEXT_OF_KIN_TELEPHONE_CONTACT, String SLT_BROAD_CATEGORIES, String MEDICAL_DIAGNOSIS, String SLT_DIAGNOSIS, String DISABILITY_ASSESSMENT, String ASSISTIVE_TECHNOLOGY_SERVICES, String SPECIFIC_ASSISTIVE_PRODUCT, String TREATMENT_INTERVENTIONS, int TOTAL_TREATMENT_INTERVENTIONS, String PAYMENT_MODE, double AMOUNT_KSH, String RECEIPT_INVOICE_NUMBER, String REFERRALS_IN, String REFERRAL_OUT, String REMARKS_OUTCOMES, String TCA, String OFFICER_ATTENDING) {
        this.SERIAL_NO = SERIAL_NO;
        this.DATE = DATE;
        this.NAME = NAME;
        this.AGE = AGE;
        this.NATURE_OF_VISIT = NATURE_OF_VISIT;
        this.SEX = SEX;
        this.PATIENT_NUMBER = PATIENT_NUMBER;
        this.COUNTY = COUNTY;
        this.PHYSICAL_ADDRESS = PHYSICAL_ADDRESS;
        this.OCCUPATION = OCCUPATION;
        this.TEL_CONTACT = TEL_CONTACT;
        this.NEXT_OF_KIN_TELEPHONE_CONTACT = NEXT_OF_KIN_TELEPHONE_CONTACT;
        this.SLT_BROAD_CATEGORIES = SLT_BROAD_CATEGORIES;
        this.MEDICAL_DIAGNOSIS = MEDICAL_DIAGNOSIS;
        this.SLT_DIAGNOSIS = SLT_DIAGNOSIS;
        this.DISABILITY_ASSESSMENT = DISABILITY_ASSESSMENT;
        this.ASSISTIVE_TECHNOLOGY_SERVICES = ASSISTIVE_TECHNOLOGY_SERVICES;
        this.SPECIFIC_ASSISTIVE_PRODUCT = SPECIFIC_ASSISTIVE_PRODUCT;
        this.TREATMENT_INTERVENTIONS = TREATMENT_INTERVENTIONS;
        this.TOTAL_TREATMENT_INTERVENTIONS = TOTAL_TREATMENT_INTERVENTIONS;
        this.PAYMENT_MODE = PAYMENT_MODE;
        this.AMOUNT_KSH = AMOUNT_KSH;
        this.RECEIPT_INVOICE_NUMBER = RECEIPT_INVOICE_NUMBER;
        this.REFERRALS_IN = REFERRALS_IN;
        this.REFERRAL_OUT = REFERRAL_OUT;
        this.REMARKS_OUTCOMES = REMARKS_OUTCOMES;
        this.TCA = TCA;
        this.OFFICER_ATTENDING = OFFICER_ATTENDING;
    }

    public String getSERIAL_NO() {
        return SERIAL_NO;
    }

    public void setSERIAL_NO(String SERIAL_NO) {
        this.SERIAL_NO = SERIAL_NO;
    }

    public String getDATE() {
        return DATE;
    }

    public void setDATE(String DATE) {
        this.DATE = DATE;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public int getAGE() {
        return AGE;
    }

    public void setAGE(int AGE) {
        this.AGE = AGE;
    }

    public String getNATURE_OF_VISIT() {
        return NATURE_OF_VISIT;
    }

    public void setNATURE_OF_VISIT(String NATURE_OF_VISIT) {
        this.NATURE_OF_VISIT = NATURE_OF_VISIT;
    }

    public String getSEX() {
        return SEX;
    }

    public void setSEX(String SEX) {
        this.SEX = SEX;
    }

    public String getPATIENT_NUMBER() {
        return PATIENT_NUMBER;
    }

    public void setPATIENT_NUMBER(String PATIENT_NUMBER) {
        this.PATIENT_NUMBER = PATIENT_NUMBER;
    }

    public String getCOUNTY() {
        return COUNTY;
    }

    public void setCOUNTY(String COUNTY) {
        this.COUNTY = COUNTY;
    }

    public String getPHYSICAL_ADDRESS() {
        return PHYSICAL_ADDRESS;
    }

    public void setPHYSICAL_ADDRESS(String PHYSICAL_ADDRESS) {
        this.PHYSICAL_ADDRESS = PHYSICAL_ADDRESS;
    }

    public String getOCCUPATION() {
        return OCCUPATION;
    }

    public void setOCCUPATION(String OCCUPATION) {
        this.OCCUPATION = OCCUPATION;
    }

    public String getTEL_CONTACT() {
        return TEL_CONTACT;
    }

    public void setTEL_CONTACT(String TEL_CONTACT) {
        this.TEL_CONTACT = TEL_CONTACT;
    }

    public String getNEXT_OF_KIN_TELEPHONE_CONTACT() {
        return NEXT_OF_KIN_TELEPHONE_CONTACT;
    }

    public void setNEXT_OF_KIN_TELEPHONE_CONTACT(String NEXT_OF_KIN_TELEPHONE_CONTACT) {
        this.NEXT_OF_KIN_TELEPHONE_CONTACT = NEXT_OF_KIN_TELEPHONE_CONTACT;
    }

    public String getSLT_BROAD_CATEGORIES() {
        return SLT_BROAD_CATEGORIES;
    }

    public void setSLT_BROAD_CATEGORIES(String SLT_BROAD_CATEGORIES) {
        this.SLT_BROAD_CATEGORIES = SLT_BROAD_CATEGORIES;
    }

    public String getMEDICAL_DIAGNOSIS() {
        return MEDICAL_DIAGNOSIS;
    }

    public void setMEDICAL_DIAGNOSIS(String MEDICAL_DIAGNOSIS) {
        this.MEDICAL_DIAGNOSIS = MEDICAL_DIAGNOSIS;
    }

    public String getSLT_DIAGNOSIS() {
        return SLT_DIAGNOSIS;
    }

    public void setSLT_DIAGNOSIS(String SLT_DIAGNOSIS) {
        this.SLT_DIAGNOSIS = SLT_DIAGNOSIS;
    }

    public String getDISABILITY_ASSESSMENT() {
        return DISABILITY_ASSESSMENT;
    }

    public void setDISABILITY_ASSESSMENT(String DISABILITY_ASSESSMENT) {
        this.DISABILITY_ASSESSMENT = DISABILITY_ASSESSMENT;
    }

    public String getASSISTIVE_TECHNOLOGY_SERVICES() {
        return ASSISTIVE_TECHNOLOGY_SERVICES;
    }

    public void setASSISTIVE_TECHNOLOGY_SERVICES(String ASSISTIVE_TECHNOLOGY_SERVICES) {
        this.ASSISTIVE_TECHNOLOGY_SERVICES = ASSISTIVE_TECHNOLOGY_SERVICES;
    }

    public String getSPECIFIC_ASSISTIVE_PRODUCT() {
        return SPECIFIC_ASSISTIVE_PRODUCT;
    }

    public void setSPECIFIC_ASSISTIVE_PRODUCT(String SPECIFIC_ASSISTIVE_PRODUCT) {
        this.SPECIFIC_ASSISTIVE_PRODUCT = SPECIFIC_ASSISTIVE_PRODUCT;
    }

    public String getTREATMENT_INTERVENTIONS() {
        return TREATMENT_INTERVENTIONS;
    }

    public void setTREATMENT_INTERVENTIONS(String TREATMENT_INTERVENTIONS) {
        this.TREATMENT_INTERVENTIONS = TREATMENT_INTERVENTIONS;
    }

    public int getTOTAL_TREATMENT_INTERVENTIONS() {
        return TOTAL_TREATMENT_INTERVENTIONS;
    }

    public void setTOTAL_TREATMENT_INTERVENTIONS(int TOTAL_TREATMENT_INTERVENTIONS) {
        this.TOTAL_TREATMENT_INTERVENTIONS = TOTAL_TREATMENT_INTERVENTIONS;
    }

    public String getPAYMENT_MODE() {
        return PAYMENT_MODE;
    }

    public void setPAYMENT_MODE(String PAYMENT_MODE) {
        this.PAYMENT_MODE = PAYMENT_MODE;
    }

    public double getAMOUNT_KSH() {
        return AMOUNT_KSH;
    }

    public void setAMOUNT_KSH(double AMOUNT_KSH) {
        this.AMOUNT_KSH = AMOUNT_KSH;
    }

    public String getRECEIPT_INVOICE_NUMBER() {
        return RECEIPT_INVOICE_NUMBER;
    }

    public void setRECEIPT_INVOICE_NUMBER(String RECEIPT_INVOICE_NUMBER) {
        this.RECEIPT_INVOICE_NUMBER = RECEIPT_INVOICE_NUMBER;
    }

    public String getREFERRALS_IN() {
        return REFERRALS_IN;
    }

    public void setREFERRALS_IN(String REFERRALS_IN) {
        this.REFERRALS_IN = REFERRALS_IN;
    }

    public String getREFERRAL_OUT() {
        return REFERRAL_OUT;
    }

    public void setREFERRAL_OUT(String REFERRAL_OUT) {
        this.REFERRAL_OUT = REFERRAL_OUT;
    }

    public String getREMARKS_OUTCOMES() {
        return REMARKS_OUTCOMES;
    }

    public void setREMARKS_OUTCOMES(String REMARKS_OUTCOMES) {
        this.REMARKS_OUTCOMES = REMARKS_OUTCOMES;
    }

    public String getTCA() {
        return TCA;
    }

    public void setTCA(String TCA) {
        this.TCA = TCA;
    }

    public String getOFFICER_ATTENDING() {
        return OFFICER_ATTENDING;
    }

    public void setOFFICER_ATTENDING(String OFFICER_ATTENDING) {
        this.OFFICER_ATTENDING = OFFICER_ATTENDING;
    }

    public static List<TherapyRegisterMOH418> populateData()

    {

    List<TherapyRegisterMOH418> dataList = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
      dataList.add(
          new TherapyRegisterMOH418(
              String.valueOf(i),
              "2024-06-0" + (i % 10 + 1),
              "John Doe " + i,
              25 + i,
              "Checkup",
              i % 2 == 0 ? "Male" : "Female",
              "P12345" + i,
              "County " + i,
              "123 Main St " + i,
              "Occupation " + i,
              "123-456-789" + i,
              "098-765-432" + i,
              "Category " + i,
              "Diagnosis " + i,
              "SLT Diagnosis " + i,
              "Assessment " + i,
              "Service " + i,
              "Product " + i,
              "Intervention " + i,
              i,
              "Cash",
              1000.0 + i,
              "INV123" + i,
              "Referral In " + i,
              "Referral Out " + i,
              "Outcome " + i,
              "2024-07-01",
              "Officer " + i));
        }
    return dataList;}
}
