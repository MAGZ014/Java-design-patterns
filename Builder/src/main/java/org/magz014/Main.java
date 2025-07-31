package org.magz014;

import org.magz014.domain.Address;
import org.magz014.domain.Contact;
import org.magz014.domain.Phone;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee.EmployeeBuilder()
                .setAge(21)
                .setName("Pedro")
                .setGender("MALE")

                .setAddress(new Address("123213", "Peru","Perusalen","CALLE 51"))

                .setPhone( new Phone("200202", "+23","fijo"))
                .setPhone("123","+52","Celular")

                .setContact(new Contact("Daniel",
                        new Phone("234234","+52","Celular"),
                        new Address( "asdas", "CDMX-1",",Mexico","234")))

                .build();

        System.out.println(employee);
    }
}