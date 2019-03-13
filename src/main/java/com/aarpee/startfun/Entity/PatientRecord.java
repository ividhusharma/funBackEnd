package com.aarpee.startfun.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class PatientRecord {
  @ManyToOne Patient patient;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, unique = true, updatable = false)
  private Long patientRecordId;

  @NotNull private Double patientRecordFee;
  private String patientRecordDoctorName;
  private Date patientRecordDate;
  private String patientRecordBloodPressure;
  private String patientRecordWeight;
  private String patientRecordHeight;
  private String patientRecordHeartBeat;

  public Patient getPatient() {
    return patient;
  }

  public void setPatient(Patient patient) {
    this.patient = patient;
  }

  public Long getPatientRecordId() {
    return patientRecordId;
  }

  public void setPatientRecordId(Long patientRecordId) {
    this.patientRecordId = patientRecordId;
  }

  public Double getPatientRecordFee() {
    return patientRecordFee;
  }

  public void setPatientRecordFee(Double patientRecordFee) {
    this.patientRecordFee = patientRecordFee;
  }

  public Date getPatientRecordDate() {
    return patientRecordDate;
  }

  public void setPatientRecordDate(Date patientRecordDate) {
    this.patientRecordDate = patientRecordDate;
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
}
