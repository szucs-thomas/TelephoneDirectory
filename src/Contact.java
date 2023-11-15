public class Contact {
    protected String lastName;
    protected String firstName;
    protected String postCode;
    protected String city;
    protected String streetName;
    protected String houseNamber;
    protected String email;
    protected String phoneNamber;

    public Contact() {
    }

    public Contact(String lastName, String firstName, String postCode, String city, String streetName, String houseNamber, String email, String phoneNamber) {
        this.setLastName(lastName);
        this.setFirstName(firstName);
        this.setPostCode(postCode);
        this.setCity(city);
        this.setStreetName(streetName);
        this.setHouseNamber(houseNamber);
        this.setEmail(email);
        this.setPhoneNamber(phoneNamber);
    }

    @Override
    public String toString() {
        return "Contact: "+firstName+" "+lastName+" , "+postCode+" , "+city+" , "+streetName+" , "+houseNamber+" , "+email+" , "+phoneNamber;
    }

    protected String getLastName() {
        return lastName;
    }

    protected void setLastName(String lastName) {
        this.lastName = lastName;
    }

    protected String getFirstName() {
        return firstName;
    }

    protected void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    protected String getPostCode() {
        return postCode;
    }

    protected void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    protected String getCity() {
        return city;
    }

    protected void setCity(String city) {
        this.city = city;
    }

    protected String getStreetName() {
        return streetName;
    }

    protected void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    protected String getHouseNamber() {
        return houseNamber;
    }

    protected void setHouseNamber(String houseNamber) {
        this.houseNamber = houseNamber;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getPhoneNamber() {
        return phoneNamber;
    }

    protected void setPhoneNamber(String phoneNamber) {
        this.phoneNamber = phoneNamber;
    }
}
