package section27_collection_framework.model;

import java.util.UUID;

public class Student {
    private UUID id;
    private String firstName;
    private String lastName;
    private String instituteName;

    public Student() {
    }

    public Student(UUID id, String firstName, String lastName, String instituteName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.instituteName = instituteName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", instituteName='" + instituteName + '\'' +
                '}';
    }
}
