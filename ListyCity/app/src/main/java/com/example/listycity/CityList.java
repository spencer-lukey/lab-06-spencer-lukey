package com.example.listycity;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This checks if a given city is in the CityList
     * @param city
     * This is a candidate city to add
     * @return
     * Returns a boolean (T/F) depending on if the city is in the list
     */
    public boolean hasCity(City city) {
        for (City c : cities) {
            if (c == city) {
                return true;
            }
        }
        // Made through whole list, didn't find city
        return false;
    }

    /**
     * This deletes a specified city if it's in the list, throws an exception otherwise
     * @param city
     * This is the city object to delete
     */
    public void delete(City city) throws Exception {
        for (City c : cities) {
            if (c == city) {
               cities.remove(c);
               return;
            }
        }
        throw new Exception("City not in list");
    }

    /**
     * This returns an integer count of the cities in 'cities'
     * @return
     * Return an integer count of length of 'cities'
     */
    public int countCities() {
        return this.getCities().size();
    }

    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }


}
