package com.aarpee.startfun.dto;

public class PatientRecordDto {
  private Double patientRecordFee;
  private String patientRecordDoctorName;
  private String patientRecordBloodPressure;
  private String patientRecordWeight;
  private String patientRecordHeight;
  private String patientRecordHeartBeat;
  private Long patientId;

  public Long getPatientId() {
    return patientId;
  }

  public void setPatientId(Long patientId) {
    this.patientId = patientId;
  }

  public Double getPatientRecordFee() {
    return patientRecordFee;
  }

  public void setPatientRecordFee(Double patientRecordFee) {
    this.patientRecordFee = patientRecordFee;
  }

  public String getPatientRecordDoctorName() {
    return patientRecordDoctorName;
  }

  public void setPatientRecordDoctorName(String patientRecordDoctorName) {
    this.patientRecordDoctorName = patientRecordDoctorName;
  }

  public String getPatientRecordBloodPressure() {
    return patientRecordBloodPressure;
  }

  public void setPatientRecordBloodPressure(String patientRecordBloodPressure) {
    this.patientRecordBloodPressure = patientRecordBloodPressure;
  }

  public String getPatientRecordWeight() {
    return patientRecordWeight;
  }

  public void setPatientRecordWeight(String patientRecordWeight) {
    this.patientRecordWeight = patientRecordWeight;
  }

  public String getPatientRecordHeight() {
    return patientRecordHeight;
  }

  public void setPatientRecordHeight(String patientRecordHeight) {
    this.patientRecordHeight = patientRecordHeight;
  }

  public String getPatientRecordHeartBeat() {
    return patientRecordHeartBeat;
  }

  public void setPatientRecordHeartBeat(String patientRecordHeartBeat) {
    this.patientRecordHeartBeat = patientRecordHeartBeat;
  }
}
