package org.creswave;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.creswave.models.FacilityDetails;
import org.creswave.models.RegisterMOH420;
import org.creswave.models.FcdrrMoh744b;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    System.out.println("Loading .......");
 stockMovementReport();
    RegisterMOH420();
  }

  public static void printReport(
      String reportFile, Map<String, Object> parameters, JRBeanCollectionDataSource itemsJRBean) {
    try {
      InputStream input = Files.newInputStream(new File(reportFile).toPath());
      JasperDesign jasperDesign = JRXmlLoader.load(input);
      JasperReport jasperReport = JasperCompileManager.compileReport(jasperDesign);

      JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, itemsJRBean);
      JasperViewer.viewReport(jasperPrint);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static Map<String, Object> FacilityDetails() {
    Map<String, Object> FacilityDetails = new HashMap<>();
    FacilityDetails.put("COUNTY", "Your County");
    FacilityDetails.put("SUB_COUNTY", "Your Sub County");
    FacilityDetails.put("HEALTH_FACILITY", "Your Health Facility");
    FacilityDetails.put("KMHFL_CODE", "12345");
    FacilityDetails.put("FACILITY_TYPE", "Type A");
    FacilityDetails.put("SERVICE_AREA", "Service Area A");
    FacilityDetails.put("START_DATE", "2024-06-05");
    FacilityDetails.put("logo","IMAGES/logo.png");
    return FacilityDetails;
  }

  static void stockMovementReport() {
    List<FcdrrMoh744b> listOfData = FcdrrMoh744b.populateStockMovement();
    String reportFile = "Reports/MOH 744b.jrxml";
    JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listOfData);
    Map<String, Object> parameters = new HashMap<>();
    parameters.put("FromDate", "01-06-2024");
    parameters.put("ToDate", "30-06-2024");
    parameters.put("DOMAIN", "INCLUSIVE THERAPEUTIC PLAY");
    parameters.putAll(FacilityDetails());
    printReport(reportFile, parameters, itemsJRBean);
  }

  static void RegisterMOH420() {
    List<RegisterMOH420> listOfData = RegisterMOH420.populateRecords();
    String reportFile = "Reports/Register MOH 420.jrxml";
    JRBeanCollectionDataSource itemsJRBean = new JRBeanCollectionDataSource(listOfData);
    Map<String, Object> parameters = new HashMap<>();
    parameters.put("FromDate", "01-06-2024");
    parameters.put("ToDate", "30-06-2024");
    parameters.put("DOMAIN", "INCLUSIVE THERAPEUTIC PLAY");
    parameters.put("CollectionBeanParam", itemsJRBean);
    parameters.putAll(FacilityDetails());

    // parameters.put("FacilityName","$F{passthemame}");
    parameters.put(
        "FacilityDetails",
        "Facility Name:____________________KMHFL NO: ___________Ward:___________Sub-county:____________County: _____________Month: _______ Year:_________");
    printReport(reportFile, parameters, itemsJRBean);
  }
}
