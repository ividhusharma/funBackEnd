package com.aarpee.startfun.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Patient {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, unique = true, updatable = false)
  private Long patientId;

  @NotNull private String patientFirstName;

  private String patientLastName;

  @NotNull private Integer patientAge;

  private String patientEmail;

  @NotNull private String patientAddress;

  private Long patientMobileNumber;

  private Date patientRegistrationDate;

  public Patient() {}

  public Patient(Long patientId)
  {
    super();
    this.setPatientId(patientId);
  }

  public Long getPatientId() {
    return patientId;
  }

  public void setPatientId(Long patientId) {
    this.patientId = patientId;
  }

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

  public Date getPatientRegistrationDate() {
    return patientRegistrationDate;
  }

  public void setPatientRegistrationDate(Date patientRegistrationDate) {
    this.patientRegistrationDate = patientRegistrationDate;
  }
}
