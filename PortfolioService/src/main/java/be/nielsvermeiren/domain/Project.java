package be.nielsvermeiren.domain;

public class Project {
    private String name;
    private String[] technologies;

    public Project() {
    }

    public Project(String name, String[] technologies) {
        this.name = name;
        this.technologies = technologies;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String[] technologies) {
        this.technologies = technologies;
    }
}
