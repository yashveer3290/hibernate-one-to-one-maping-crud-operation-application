package com.sunglowsys.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "Customer_Master")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "First_Name")
    private String firstName;

    @Column(name = "Last_Name")
    private String lastName;

    @Column(name = "Email")
    private String email;

    @Column(name = "Mobile")
    private String mobile;

    @Column(name = "Standard")
    private String standard;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    public Customer() {}

    public Customer(String firstName, String lastName, String email, String mobile, String standard, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.mobile = mobile;
        this.standard = standard;
        this.address = address;
    }

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

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(id, customer.id) && Objects.equals(firstName, customer.firstName) && Objects.equals(lastName, customer.lastName) && Objects.equals(email, customer.email) && Objects.equals(mobile, customer.mobile) && Objects.equals(standard, customer.standard) && Objects.equals(address, customer.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, mobile, standard, address);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", standard='" + standard + '\'' +
                ", address=" + address +
                '}';
    }
}
