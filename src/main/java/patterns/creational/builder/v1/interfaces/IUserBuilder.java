package patterns.creational.builder.v1.interfaces;


public interface IUserBuilder {
    IUserBuilder setName(String name);

    IUserBuilder setAge(int age);

    IUserBuilder setCountry(String country);

    IUserBuilder setPhone(String phone);

    IUser build();

    void reset();
}
