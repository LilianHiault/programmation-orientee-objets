package country;

import city;
import java.util.Set;
import java.util.HashSet;
import java.util.AbstractCollection;
import java.util.iterator;
import java.util.Enumeration;

import static java.util.requireNonNull;

public class Country {
    private final String name;
    private Capital capital;
    private Set<City> cities = new HashSet<>();

    public Country(String name, Capital capital) {
        this.name = requireNonNull(name);
        this.capital = setCapital(capital);
    }

    public String name() {
        return this.name;
    }

    public String getCapital() {
        return this.capital;
    }

    public boolean setCapital(City newCaptital) {
        if(this.capital == newCaptital) {
            return false;
        }
        this.capital = requireNonNull(newCaptital);
        return true;
    }

    private Set<City> getCities() {
        return this.cities;
    }

    public String toString() {
        return this.name;
    }

    public boolean addCity(City city) {
    }

    public boolean addCities(Enumeration<City> cities) {
        boolean result = false;
        while cities.hasMoreElements() {
            result = addCity(cities.nextElement());
        }
        return result;
    }
}
