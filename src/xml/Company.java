package xml;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Company {

    @JsonProperty("companyID")
    private Integer companyID;

    private String name;

    @JsonProperty("establishedYear")
    private int establishedYear;

    private String industry;

    private String department;

    private String employee;

    // Getters and setters
    public Integer getCompanyID() {
        return companyID;
    }

    public void setCompanyID(Integer companyID) {
        this.companyID = companyID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstablishedYear() {
        return establishedYear;
    }

    public void setEstablishedYear(int establishedYear) {
        this.establishedYear = establishedYear;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyID=" + companyID +
                ", name='" + name + '\'' +
                ", establishedYear=" + establishedYear +
                ", industry='" + industry + '\'' +
                ", department='" + department + '\'' +
                ", employee='" + employee + '\'' +
                '}';
    }
}
