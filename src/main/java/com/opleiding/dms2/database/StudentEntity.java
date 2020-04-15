package com.opleiding.dms2.database;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity    //This annotation denotes the class as a persistent Java class.
@Table(name = "STUDENT")
//@Table annotation is a class level annotation and it defines the table name with which this entity class is mapped.
public class StudentEntity {

    @Id  //@Id annotation is a field level annotation and it defines that the field is primary key.
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @NotBlank
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "branch")
    private String branch;

    @Column(name = "last_name")
    private String lastName;

    @NotBlank
    @Column(name = "email_id", nullable = false, length = 100)
    private String emailId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public String toString() {
        return "StudentEntity [id=" + id + ", firstName=" + firstName + ", branch=\" + branch +\", lastName=" + lastName
                + ", emailId=" + emailId + "]";
    }

}
