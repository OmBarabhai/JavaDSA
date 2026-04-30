package Basics_Java.Collections.HashMap;

import java.util.HashMap;
import java.util.Map;

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
    }
}
