public class Main {

    public static void main(String[] args) {
        Address address = new Address.AddressBuilder("housenumber", "area", "city").zipCode("1207").country("Bangladesh").build();
        User user = new User.UserBuilder("firstName", "lastName").age(25).address(address).build();
        System.out.println(user.toString());

        /*
        System.out.println("");

        Address address1 = new Address.AddressBuilder("housenumber", "area", "city").zipCode("1207").country("Bangladesh").build();
        Address address2 = new Address.AddressBuilder("housenumber", "area", "city").zipCode("1208").country("Bangladesh").build();

        System.out.println(address1);
        System.out.println(address2);
        */
    }

}