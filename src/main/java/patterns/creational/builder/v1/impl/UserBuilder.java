package patterns.creational.builder.v1.impl;

import patterns.creational.builder.v1.interfaces.IUserBuilder;


/** Concrete Builder which implements Builder Interface */
public class UserBuilder implements IUserBuilder {
    private User user = new User();

    @Override
    public UserBuilder setName(String name) {
        user.setName(name);
        return this;
    }

    @Override
    public UserBuilder setAge(int age) {
        user.setAge(age);
        return this;
    }

    @Override
    public UserBuilder setCountry(String country) {
        user.setCountry(country);
        return this;
    }

    @Override
    public UserBuilder setPhone(String phone) {
        user.setPhone(phone);
        return this;
    }

    @Override
    public User build() {
        return user;
    }

    @Override
    public void reset() {
        user = new User();
    }
}
