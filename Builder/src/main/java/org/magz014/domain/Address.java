package org.magz014.domain;

public class Address {

    private String address;
    private String city;
    private String country;
    private String cp;

    public Address() {
    }

    public Address(String cp, String country, String city, String address) {
        this.cp = cp;
        this.country = country;
        this.city = city;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", cp='" + cp + '\'' +
                '}';
    }
}
