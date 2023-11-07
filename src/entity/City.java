package entity;

//Task2
public class City {
    String name;
    String region;
    String country;
    long population;
    int postcode;
    int phonePrefix;

    public City(String name, String region, String country, long population, int postcode, int phonePrefix) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postcode = postcode;
        this.phonePrefix = phonePrefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public int getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(int phonePrefix) {
        this.phonePrefix = phonePrefix;
    }

    @Override
    public String toString() {
        return "City "
                + "name: " + name
                + ", region: " + region
                + ", country: " + country
                + ", population: " + population
                + ", postcode: " + postcode
                + ", phonePrefix: " + phonePrefix;
    }
}
