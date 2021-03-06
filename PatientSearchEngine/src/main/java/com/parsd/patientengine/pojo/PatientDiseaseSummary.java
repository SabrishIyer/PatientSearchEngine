package com.parsd.patientengine.pojo;
// Generated Apr 20, 2016 9:22:47 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * PatientDiseaseSummary generated by hbm2java
 */
public class PatientDiseaseSummary  implements java.io.Serializable {


     private PatientDiseaseSummaryId id;
     private DiseaseLk diseaseLk;
     private Patient patient;
     private char diseaseStatus;
     private Date observationDate;
     private String symptoms;

    public PatientDiseaseSummary() {
    }

    public PatientDiseaseSummary(PatientDiseaseSummaryId id, DiseaseLk diseaseLk, Patient patient, char diseaseStatus, Date observationDate, String symptoms) {
       this.id = id;
       this.diseaseLk = diseaseLk;
       this.patient = patient;
       this.diseaseStatus = diseaseStatus;
       this.observationDate = observationDate;
       this.symptoms = symptoms;
    }
   
    public PatientDiseaseSummaryId getId() {
        return this.id;
    }
    
    public void setId(PatientDiseaseSummaryId id) {
        this.id = id;
    }
    public DiseaseLk getDiseaseLk() {
        return this.diseaseLk;
    }
    
    public void setDiseaseLk(DiseaseLk diseaseLk) {
        this.diseaseLk = diseaseLk;
    }
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public char getDiseaseStatus() {
        return this.diseaseStatus;
    }
    
    public void setDiseaseStatus(char diseaseStatus) {
        this.diseaseStatus = diseaseStatus;
    }
    public Date getObservationDate() {
        return this.observationDate;
    }
    
    public void setObservationDate(Date observationDate) {
        this.observationDate = observationDate;
    }
    public String getSymptoms() {
        return this.symptoms;
    }
    
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }




}


