package com.zrsys.graph.dijkstra;

import java.util.HashMap;
import java.util.Map;

public class City {
    private String name;
    private Map<City, Integer> routes = new HashMap<>();

    public City(String name) {
        this.name = name;
    }

    public Map<City, Integer> addRoutes(City city, Integer price) {
        routes.put(city, price);
        return routes;
    }

    public Map<City, Integer> getRoutes() {
        return routes;
    }

    public void setRoutes(Map<City, Integer> routes) {
        this.routes = routes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", routes=" + routes +
                '}';
    }
}
