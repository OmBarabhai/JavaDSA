package Basics_Java.Collections.HashMap;

import java.util.*;

public class HashMapBasics {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("in", "India");
        map.put("us", "United-State");
        map.put("aus", "Australia");
        map.putIfAbsent("in", "Indonasia");

        System.out.println(map);
        Map<String, String> table = new HashMap<>();
        table.put("br", "brazil");
        System.out.println("Before"+table);
        table.putAll(map);
        System.out.println(table);
        System.out.println(table.size());
//        table.clear();
        System.out.println(table.get("br"));
        System.out.println(table.getOrDefault("us","None"));
        System.out.println(table.getOrDefault("usa","None"));
        System.out.println(table.containsKey("in"));
        System.out.println(table.containsKey("im"));
        System.out.println(table.containsValue("United-State"));
        System.out.println(table.containsValue("United State"));
        System.out.println(table);
        table.replace("in","Indonesia");
        map.putIfAbsent("in", "Indonasia");

        System.out.println(table);

        Set<String> keySet = table.keySet();
        System.out.println(keySet);
        Collection<String> valueCollection = table.values();
        System.out.println(valueCollection);
        Set<Map.Entry<String,String>> entrySet = table.entrySet();
        System.out.println(entrySet);

        Map<String,String> map1 =new TreeMap<>();
        map1.putAll(map);
        for(Map.Entry<String,String> entry : map1.entrySet()){
            System.out.println("Key: "+ entry.getKey()+ ", Value: "+entry.getValue());
        }
    }
}
