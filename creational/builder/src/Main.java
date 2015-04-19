public class Main {

    public static void main(String[] args) {
        Address address = new Address.AddressBuilder("housenumber", "area", "city").zipCode("1207").country("Bangladesh").build();
        User user = new User.UserBuilder("firstName", "lastName").age(25).address(address).build();
        System.out.println(user.toString());
    }

}