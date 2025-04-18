package com.example.demo.shs_student;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "seniorhigh_table")
public class Student {

    // Basic Information
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String studentNumber;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String middleInitial;
    private String gender;
    private String nationality;
    private LocalDate dateOfBirth;
    private String placeOfBirth;
    private String email;
    private String mobileNumber;
    private String civilStatus;

    @Column(name = "yearlvl")
    private String yearLVL;
    @Column(name = "courseprog")
    private String courseProg;


    // Address Information
    private String homeAddress;
    private String city;
    private String province;
    private String country;
    private String zipCode;
    private String telephoneNumber;

    // Parent Information
    private String fatherName;
    private String fatherTelephone;
    private String motherName;
    private String motherTelephone;

    // Emergency Contact Information
    private String emergencyContactName;
    private String emergencyContactRelation;
    private String emergencyContactAddress;
    private String emergencyContactCity;
    private String emergencyContactProvince;
    private String emergencyContactCountry;
    private String emergencyContactZipCode;
    private String emergencyContactTelephone;
    private String emergencyContactEmail;

    @Transient
    private int age;

    // Constructors
    public Student() {}

    public Student(String studentNumber, String firstName, String lastName, String middleInitial, String gender,
                   String nationality, LocalDate dateOfBirth, String placeOfBirth, String email, String mobileNumber,
                   String civilStatus, String yearLVL, String courseProg, String homeAddress, String city, String province, String country,
                   String zipCode, String telephoneNumber, String fatherName, String fatherTelephone,
                   String motherName, String motherTelephone, String emergencyContactName,
                   String emergencyContactRelation, String emergencyContactAddress, String emergencyContactCity,
                   String emergencyContactProvince, String emergencyContactCountry, String emergencyContactZipCode,
                   String emergencyContactTelephone, String emergencyContactEmail) {
        this.studentNumber = studentNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.gender = gender;
        this.nationality = nationality;
        this.dateOfBirth = dateOfBirth;
        this.placeOfBirth = placeOfBirth;
        this.email = email;
        this.mobileNumber = mobileNumber;
        this.civilStatus = civilStatus;
        this.yearLVL = yearLVL;
        this.courseProg = courseProg;
        this.homeAddress = homeAddress;
        this.city = city;
        this.province = province;
        this.country = country;
        this.zipCode = zipCode;
        this.telephoneNumber = telephoneNumber;
        this.fatherName = fatherName;
        this.fatherTelephone = fatherTelephone;
        this.motherName = motherName;
        this.motherTelephone = motherTelephone;
        this.emergencyContactName = emergencyContactName;
        this.emergencyContactRelation = emergencyContactRelation;
        this.emergencyContactAddress = emergencyContactAddress;
        this.emergencyContactCity = emergencyContactCity;
        this.emergencyContactProvince = emergencyContactProvince;
        this.emergencyContactCountry = emergencyContactCountry;
        this.emergencyContactZipCode = emergencyContactZipCode;
        this.emergencyContactTelephone = emergencyContactTelephone;
        this.emergencyContactEmail = emergencyContactEmail;
    }

    // Getters

    public Long getId() {
        return id;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public String getGender() {
        return gender;
    }

    public String getNationality() {
        return nationality;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getEmail() {
        return email;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public String getCivilStatus() {
        return civilStatus;
    }

    public String getYearLVL() { return yearLVL; }

    public String getCourseProg() { return courseProg; }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getCity() {
        return city;
    }

    public String getProvince() {
        return province;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getFatherTelephone() {
        return fatherTelephone;
    }

    public String getMotherName() {
        return motherName;
    }

    public String getMotherTelephone() {
        return motherTelephone;
    }

    public String getEmergencyContactRelation() {
        return emergencyContactRelation;
    }

    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public String getEmergencyContactCity() {
        return emergencyContactCity;
    }

    public String getEmergencyContactProvince() {
        return emergencyContactProvince;
    }

    public String getEmergencyContactTelephone() {
        return emergencyContactTelephone;
    }

    public int getAge() {
        return age;
    }

    public String getEmergencyContactEmail() {
        return emergencyContactEmail;
    }

    public String getEmergencyContactCountry() {
        return emergencyContactCountry;
    }

    public String getEmergencyContactZipCode() {
        return emergencyContactZipCode;
    }

    //SETTER

    public void setId(Long id) {
        this.id = id;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCivilStatus(String civilStatus) {
        this.civilStatus = civilStatus;
    }

    public void setYearLVL(String yearLVL) { this.yearLVL = yearLVL; }

    public void setCourseProg(String courseProg) { this.courseProg = courseProg; }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public void setFatherTelephone(String fatherTelephone) {
        this.fatherTelephone = fatherTelephone;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public void setMotherTelephone(String motherTelephone) {
        this.motherTelephone = motherTelephone;
    }

    public void setEmergencyContactName(String emergencyContactName) {
        this.emergencyContactName = emergencyContactName;
    }

    public void setEmergencyContactRelation(String emergencyContactRelation) {
        this.emergencyContactRelation = emergencyContactRelation;
    }

    public void setEmergencyContactAddress(String emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress;
    }

    public void setEmergencyContactCity(String emergencyContactCity) {
        this.emergencyContactCity = emergencyContactCity;
    }

    public void setEmergencyContactProvince(String emergencyContactProvince) {
        this.emergencyContactProvince = emergencyContactProvince;
    }

    public void setEmergencyContactCountry(String emergencyContactCountry) {
        this.emergencyContactCountry = emergencyContactCountry;
    }

    public void setEmergencyContactZipCode(String emergencyContactZipCode) {
        this.emergencyContactZipCode = emergencyContactZipCode;
    }

    public void setEmergencyContactTelephone(String emergencyContactTelephone) {
        this.emergencyContactTelephone = emergencyContactTelephone;
    }

    public void setEmergencyContactEmail(String emergencyContactEmail) {
        this.emergencyContactEmail = emergencyContactEmail;
    }

    public void setAge(int age) {
        this.age = age;
    }

}