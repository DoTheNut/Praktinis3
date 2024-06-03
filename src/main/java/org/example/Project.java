package org.example;

public class Project {
    private String projectName;
    private int projectCode;

    // Constructors
    public Project() {}

    public Project(String projectName, int projectCode) {
        this.projectName = projectName;
        this.projectCode = projectCode;
    }

    // Getters and Setters
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public int getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(int projectCode) {
        this.projectCode = projectCode;
    }
}
