package patterns.creational.builder.v1.impl;


import patterns.creational.builder.v1.interfaces.IUser;
import patterns.creational.builder.v1.interfaces.IUserBuilder;

public class User implements IUser {
    private String name;
    private int age;

    private String country;
    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "name: %s;\nage: %s;\ncountry: %s\nphone: %s\n".formatted(name, age, country, phone);
    }

    /** Get builder instance */
    public static UserBuilder getBuilder() {
        return new UserBuilder();
    }
}
