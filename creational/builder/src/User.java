public class User {

    private String firstName;
    private String lastName;
    private int age;
    private Address address;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName +
                "', lastName='" + lastName +
                "', age=" + age +
                "', address='" + (address!=null ? address.toString() : null) +
                "'}";
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private int age;
        private Address address;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder address(Address address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

}