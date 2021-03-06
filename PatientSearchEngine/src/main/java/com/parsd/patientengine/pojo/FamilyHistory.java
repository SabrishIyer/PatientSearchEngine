package com.parsd.patientengine.pojo;
// Generated Apr 20, 2016 9:22:47 PM by Hibernate Tools 4.3.1



/**
 * FamilyHistory generated by hbm2java
 */
public class FamilyHistory  implements java.io.Serializable {


     private String patientUpi;
     private Patient patient;
     private String memberName;
     private String memberPatientRelationship;
     private int age;
     private char alive;
     private String medicalConditions;
     private String deathCause;
     private int deathAge;

    public FamilyHistory() {
    }

	
    public FamilyHistory(Patient patient, String memberName, String memberPatientRelationship, int age, char alive, String medicalConditions) {
        this.patient = patient;
        this.memberName = memberName;
        this.memberPatientRelationship = memberPatientRelationship;
        this.age = age;
        this.alive = alive;
        this.medicalConditions = medicalConditions;
    }
    public FamilyHistory(Patient patient, String memberName, String memberPatientRelationship, int age, char alive, String medicalConditions, String deathCause, Integer deathAge) {
       this.patient = patient;
       this.memberName = memberName;
       this.memberPatientRelationship = memberPatientRelationship;
       this.age = age;
       this.alive = alive;
       this.medicalConditions = medicalConditions;
       this.deathCause = deathCause;
       this.deathAge = deathAge;
    }
   
    public String getPatientUpi() {
        return this.patientUpi;
    }
    
    public void setPatientUpi(String patientUpi) {
        this.patientUpi = patientUpi;
    }
    public Patient getPatient() {
        return this.patient;
    }
    
    public void setPatient(Patient patient) {
        this.patient = patient;
    }
    public String getMemberName() {
        return this.memberName;
    }
    
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public String getMemberPatientRelationship() {
        return this.memberPatientRelationship;
    }
    
    public void setMemberPatientRelationship(String memberPatientRelationship) {
        this.memberPatientRelationship = memberPatientRelationship;
    }
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    public char getAlive() {
        return this.alive;
    }
    
    public void setAlive(char alive) {
        this.alive = alive;
    }
    public String getMedicalConditions() {
        return this.medicalConditions;
    }
    
    public void setMedicalConditions(String medicalConditions) {
        this.medicalConditions = medicalConditions;
    }
    public String getDeathCause() {
        return this.deathCause;
    }
    
    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause;
    }
    public int getDeathAge() {
        return this.deathAge;
    }
    
    public void setDeathAge(Integer deathAge) {
        this.deathAge = deathAge;
    }




}


