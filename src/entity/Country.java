package entity;

import java.util.Arrays;

//Task3
public class Country {
    String name;
    String continent;
    long population;
    int phonePrefix;
    String capitalName;
    String[] cityNames;

    public Country(String name, String continent, long population, int phonePrefix, String capitalName, String[] cityNames) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.phonePrefix = phonePrefix;
        this.capitalName = capitalName;
        this.cityNames = cityNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public int getPhonePrefix() {
        return phonePrefix;
    }

    public void setPhonePrefix(int phonePrefix) {
        this.phonePrefix = phonePrefix;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public String[] getCityNames() {
        return cityNames;
    }

    public void setCityNames(String[] cityNames) {
        this.cityNames = cityNames;
    }

    @Override
    public String toString() {
        return "Country "
                + "name: " + name
                + ", continent: " + continent
                + ", population: " + population
                + ", phonePrefix: " + phonePrefix
                + ", capitalName: " + capitalName
                + ", cityNames: " + Arrays.toString(cityNames);
    }
}
