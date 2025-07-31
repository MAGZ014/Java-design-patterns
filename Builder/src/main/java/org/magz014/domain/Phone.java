package org.magz014.domain;

public class Phone {

    private String number;
    private String ext;
    private String phoneType;

    public Phone() {
    }

    public Phone(String number, String ext, String phoneType) {
        this.number = number;
        this.ext = ext;
        this.phoneType = phoneType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", ext='" + ext + '\'' +
                ", phoneType='" + phoneType + '\'' +
                '}';
    }
}
