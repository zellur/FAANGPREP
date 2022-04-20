package com.zrsys.graph.dijkstra;

import java.util.*;

public class DijkstraAlgo {

    static City atlanta = new City("Atlanta");
    static City boston = new City("Boston");
    static City chicago = new City("Chicago");
    static City denver = new City("Denver");
    static City el_paso = new City("El Paso");

    public static void main(String[] args) {
        DijkstraAlgo dijkstraAlgo = new DijkstraAlgo();
        dijkstraAlgo.setUpRoutes();

        Map<City, Integer> routes = dijkstraAlgo.dijkstra(atlanta, List.of(boston, chicago, denver, el_paso));
        routes.keySet().forEach(x -> System.out.println(x.getName() + " : " + routes.get(x)));
    }

    public void setUpRoutes() {
        atlanta.addRoutes(boston, 100);
        atlanta.addRoutes(denver, 160);
        boston.addRoutes(chicago, 120);
        boston.addRoutes(denver, 180);
        chicago.addRoutes(el_paso, 80);
        denver.addRoutes(chicago, 40);
        denver.addRoutes(el_paso, 140);
    }
    
    public Map<City, Integer> dijkstra(City startingNode, List<City> otherNodes) {

        Map<City, Integer> routesFromNode = new HashMap<>();
        routesFromNode.put(startingNode, 0);
        
        otherNodes.forEach(x -> routesFromNode.put(x, Integer.MAX_VALUE));
        
        Set<City> visited = new HashSet<>();
        City curNode = startingNode;
        
        while (curNode != null) {
            visited.add(curNode);
            
            for (Map.Entry<City, Integer> entry : curNode.getRoutes().entrySet()) {
                if (routesFromNode.get(entry.getKey()) > (entry.getValue() + routesFromNode.get(curNode))) {
                    routesFromNode.put(entry.getKey(), (entry.getValue() + routesFromNode.get(curNode)));
                }
            }
            curNode = null;

            Integer cheapestRouteFromCurrentCity = Integer.MAX_VALUE;

            for (Map.Entry<City, Integer> entry : routesFromNode.entrySet()) {
               if (entry.getValue() < cheapestRouteFromCurrentCity && !visited.contains(entry.getKey())) {
                   cheapestRouteFromCurrentCity = entry.getValue();
                   curNode = entry.getKey();
               }
            }
        }

        return routesFromNode;
    }

}
