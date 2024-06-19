package patterns.creational.builder.v2;


public class User {
    private String name;
    private int age;

    private String country;
    private String phone;

    /** Getters and Setters */
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
    public static Builder getBuilder() {
        return new Builder();
    }

    /** Builder for User */
    public static class Builder {
        private User user = new User();

        public Builder setName(String name) {
            user.setName(name);
            return this;
        }

        public Builder setAge(int age) {
            user.setAge(age);
            return this;
        }

        public Builder setCountry(String country) {
            user.setCountry(country);
            return this;
        }

        public Builder setPhone(String phone) {
            user.setPhone(phone);
            return this;
        }

        public User build() {
            return user;
        }

        public void reset() {
            user = new User();
        }
    }

}
