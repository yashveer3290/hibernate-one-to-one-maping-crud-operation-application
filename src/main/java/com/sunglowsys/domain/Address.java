package com.sunglowsys.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
@Entity
@Table(name = "Address_Master")
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long id;

    @Column(name = "Address_Line1")
    private String addressLine1;

    @Column(name = "Address_Line2")
    private String addressLine2;

    @Column(name = "Land_Mark")
    private String landMark;

    @Column(name = "City")
    private String city;

    @Column(name = "State")
    private String state;

    @Column(name = "Pin_Code")
    private String pinCode;

    public Address() {}

    public Address(String addressLine1, String addressLine2, String landMark, String city, String state, String pinCode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.landMark = landMark;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getLandMark() {
        return landMark;
    }

    public void setLandMark(String landMark) {
        this.landMark = landMark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(id, address.id) && Objects.equals(addressLine1, address.addressLine1) && Objects.equals(addressLine2, address.addressLine2) && Objects.equals(landMark, address.landMark) && Objects.equals(city, address.city) && Objects.equals(state, address.state) && Objects.equals(pinCode, address.pinCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, addressLine1, addressLine2, landMark, city, state, pinCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", landMark='" + landMark + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }
}
