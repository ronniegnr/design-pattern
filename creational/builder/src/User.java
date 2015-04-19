public class User {

    private static String firstName;
    private static String lastName;
    private static int age;
    private static Address address;

    private User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.address = userBuilder.address;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static int getAge() {
        return age;
    }

    public static Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName +
                "', lastName='" + lastName +
                "', age=" + age +
                ", address='" + address.toString() +
                "'}";
    }

    public static class UserBuilder {
        private static String firstName;
        private static String lastName;
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