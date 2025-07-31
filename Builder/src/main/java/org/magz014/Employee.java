package org.magz014;

import org.magz014.domain.Address;
import org.magz014.domain.Contact;
import org.magz014.domain.Phone;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone> phoneList = new ArrayList<>();
    private List<Contact> contacts = new ArrayList<>();

    public static class EmployeeBuilder implements IBuilder{

        private int age;
        private String name;
        private String gender;
        private Address address;
        private List<Phone> phoneList = new ArrayList<>();
        private List<Contact> contacts = new ArrayList<>();

        public EmployeeBuilder() {
        }

        public EmployeeBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public EmployeeBuilder setName(String name){
            this.name = name;
            return this;
        }

        public EmployeeBuilder setGender(String gender){
            this.gender = gender;
            return this;
        }

        public EmployeeBuilder setAddress(Address address){
            this.address = address;
            return this;
        }

        public EmployeeBuilder setAddress(String address, String city, String country, String cp){
            this.address = new Address(address,city,country,cp);
            return this;
        }

        public EmployeeBuilder setPhone(Phone phone){
            this.phoneList.add(phone);
            return this;
        }

        public EmployeeBuilder setPhone(String number, String ext, String phoneType ){
            this.phoneList.add(new Phone(number, ext,phoneType));
            return this;
        }

        public EmployeeBuilder setContact(Contact contact){
            this.contacts.add(contact);
            return this;
        }

        public EmployeeBuilder setContact(String name, Phone phone, Address address){
            this.contacts.add(new Contact( name, phone, address));
            return this;
        }

            @Override
        public Employee build() {
            return new Employee(age, name, gender, address, phoneList, contacts);
        }
    }

    public Employee() {
    }

    public Employee(int age, String name, String gender, Address address, List<Phone> phoneList, List<Contact> contacts) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phoneList = phoneList;
        this.contacts = contacts;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\n age=" + age +
                "\n, name='" + name + '\'' +
                "\n, gender='" + gender + '\'' +
                "\n, address=" + address +
                "\n, phoneList=" + phoneList +
                "\n, contacts=" + contacts +
                '}';
    }
}
