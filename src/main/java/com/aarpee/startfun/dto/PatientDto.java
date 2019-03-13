package com.aarpee.startfun.dto;

public class PatientDto {
  private String patientFirstName;
  private String patientLastName;
  private Integer patientAge;
  private String patientEmail;
  private String patientAddress;
  private Long patientMobileNumber;

  public String getPatientFirstName() {
    return patientFirstName;
  }

  public void setPatientFirstName(String patientFirstName) {
    this.patientFirstName = patientFirstName;
  }

  public String getPatientLastName() {
    return patientLastName;
  }

  public void setPatientLastName(String patientLastName) {
    this.patientLastName = patientLastName;
  }

  public Integer getPatientAge() {
    return patientAge;
  }

  public void setPatientAge(Integer patientAge) {
    this.patientAge = patientAge;
  }

  public String getPatientEmail() {
    return patientEmail;
  }

  public void setPatientEmail(String patientEmail) {
    this.patientEmail = patientEmail;
  }

  public String getPatientAddress() {
    return patientAddress;
  }

  public void setPatientAddress(String patientAddress) {
    this.patientAddress = patientAddress;
  }

  public Long getPatientMobileNumber() {
    return patientMobileNumber;
  }

  public void setPatientMobileNumber(Long patientMobileNumber) {
    this.patientMobileNumber = patientMobileNumber;
  }
}
