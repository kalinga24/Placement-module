package com.spring.demo.backendplacementcell.entities;

// JobPost.java
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String website;
    private String companyProfile;
    private String eligibleCourses;
    private String batchYear;
    private String jobRole;
    private String jobLocation;
    private String annualCTC;
    private String rolesResponsibilities;
    private String skillsQualifications;
    private String selectionProcess;
    private String registrationProcess;
    private String lastDateToRegister;
    private String benefitsIncentives;
    private String roleDetails;
    private String expectedSkillsTools;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getCompanyProfile() {
        return companyProfile;
    }

    public void setCompanyProfile(String companyProfile) {
        this.companyProfile = companyProfile;
    }

    public String getEligibleCourses() {
        return eligibleCourses;
    }

    public void setEligibleCourses(String eligibleCourses) {
        this.eligibleCourses = eligibleCourses;
    }

    public String getBatchYear() {
        return batchYear;
    }

    public void setBatchYear(String batchYear) {
        this.batchYear = batchYear;
    }

    public String getJobRole() {
        return jobRole;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getAnnualCTC() {
        return annualCTC;
    }

    public void setAnnualCTC(String annualCTC) {
        this.annualCTC = annualCTC;
    }

    public String getRolesResponsibilities() {
        return rolesResponsibilities;
    }

    public void setRolesResponsibilities(String rolesResponsibilities) {
        this.rolesResponsibilities = rolesResponsibilities;
    }

    public String getSkillsQualifications() {
        return skillsQualifications;
    }

    public void setSkillsQualifications(String skillsQualifications) {
        this.skillsQualifications = skillsQualifications;
    }

    public String getSelectionProcess() {
        return selectionProcess;
    }

    public void setSelectionProcess(String selectionProcess) {
        this.selectionProcess = selectionProcess;
    }

    public String getRegistrationProcess() {
        return registrationProcess;
    }

    public void setRegistrationProcess(String registrationProcess) {
        this.registrationProcess = registrationProcess;
    }

    public String getLastDateToRegister() {
        return lastDateToRegister;
    }

    public void setLastDateToRegister(String lastDateToRegister) {
        this.lastDateToRegister = lastDateToRegister;
    }

    public String getBenefitsIncentives() {
        return benefitsIncentives;
    }

    public void setBenefitsIncentives(String benefitsIncentives) {
        this.benefitsIncentives = benefitsIncentives;
    }

    public String getRoleDetails() {
        return roleDetails;
    }

    public void setRoleDetails(String roleDetails) {
        this.roleDetails = roleDetails;
    }

    public String getExpectedSkillsTools() {
        return expectedSkillsTools;
    }

    public void setExpectedSkillsTools(String expectedSkillsTools) {
        this.expectedSkillsTools = expectedSkillsTools;
    }
}