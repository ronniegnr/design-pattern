public class Address {

    private String houseNumber;
    private String roadNumber;
    private String area;
    private String zipCode;
    private String city;
    private String country;

    private Address(AddressBuilder addressBuilder) {
        this.houseNumber = addressBuilder.houseNumber;
        this.roadNumber = addressBuilder.roadNumber;
        this.area = addressBuilder.area;
        this.zipCode = addressBuilder.zipCode;
        this.city = addressBuilder.city;
        this.country = addressBuilder.country;
    }

    @Override
    public String toString() {
        return "Address{" +
                "houseNumber='" + houseNumber +
                "', roadNumber='" + roadNumber +
                "', area=" + area +
                "', zipCode=" + zipCode +
                "', city='" + city +
                "', country='" + country +
                "'}";
    }

    public static class AddressBuilder {
        private String houseNumber;
        private String roadNumber;
        private String area;
        private String city;
        private String zipCode;
        private String country;

        public AddressBuilder(String houseNumber, String area, String city) {
            this.houseNumber = houseNumber;
            this.area = area;
            this.city = city;
        }

        public AddressBuilder roadNumber(String roadNumber) {
            this.roadNumber = roadNumber;
            return this;
        }

        public AddressBuilder zipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public AddressBuilder country(String country) {
            this.country = country;
            return this;
        }

        public Address build() {
            return new Address(this);
        }
    }

}