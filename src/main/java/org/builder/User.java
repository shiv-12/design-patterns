package org.builder;

public class User {
    private final String name;
    private final String phone;
    private final int age;

    private User(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.age = builder.age;
    }

    public static class Builder {
        private final String name;
        private final String phone;
        private int age;

        public Builder(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                '}';
    }
}
