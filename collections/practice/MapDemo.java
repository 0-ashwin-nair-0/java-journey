package com.collections.practice;

import java.util.HashMap;
import java.util.Map;

//Map does not come in collections
public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> mapdemo = new HashMap<>();
        mapdemo.put("Ashwin", 51);
        mapdemo.put("Umesh",99);
        mapdemo.put("Umesh",79);
        System.out.println(mapdemo.get("Umesh"));

        System.out.println(mapdemo.keySet());
        for(String key: mapdemo.keySet()){
            System.out.println(key + ": "+mapdemo.get(key));
        }
    }
}
