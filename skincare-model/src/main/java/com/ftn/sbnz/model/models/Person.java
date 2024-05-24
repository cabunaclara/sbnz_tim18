package com.ftn.sbnz.model.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "persons")
public class Person extends User{

    @Id
    @GeneratedValue
    @Column(name="id")
    private Long id;

    @Column(name = "firstName", nullable = false)
    private String firstName;

    @Column(name = "lastName", nullable = false)
    private String lastName;

    @Column(name = "dateOfBirth", nullable = false)
    @DateTimeFormat(pattern = "dd-MM-yyyy")
    //@Temporal(TemporalType.DATE)
    private Date dateOfBirth;

    @Column(name = "gender")
    private Gender gender;

    @ManyToOne
    private SkinType skinType;

    @ManyToOne
    private SkinCondition skinCondition;

    @ManyToOne
    private Address address;

    @ManyToOne
    private Lifestyle lifestyle;

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public SkinType getSkinType() {
        return skinType;
    }

    public void setSkinType(SkinType skinType) {
        this.skinType = skinType;
    }

    public SkinCondition getSkinCondition() {
        return skinCondition;
    }

    public void setSkinCondition(SkinCondition skinCondition) {
        this.skinCondition = skinCondition;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Lifestyle getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(Lifestyle lifestyle) {
        this.lifestyle = lifestyle;
    }

    public Person() {

    }

    public Person(String username, String password, boolean active, Role role) {
        super(username, password, active, role);
    }


    public Person(String username, String password, boolean active, Role role, String firstName, String lastName, Date dateOfBirth, Gender gender, SkinType skinType, SkinCondition skinCondition, Address address,Lifestyle lifestyle){
        super(username, password, active, role);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.skinType = skinType;
        this.skinCondition = skinCondition;
        this.address = address;
    }
}
