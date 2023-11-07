package entity;

//Task1
public class Person {
    String fullName;
    String birthday;
    String phone;

    String city;
    String country;
    String homeAddress;

    public Person(String fullName, String birthday, String phone, String city, String country, String homeAddress) {
        this.fullName = fullName;
        this.birthday = birthday;
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    @Override
    public String toString() {
        return "Person " + "fullName: " + fullName
                + ", birthday: " + birthday
                + ", phone: " + phone
                + ", city: " + city
                + ", country: " + country
                + ", homeAddress: " + homeAddress;
    }
}
