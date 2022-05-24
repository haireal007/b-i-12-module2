package th.Hmap.ListHM.TreeM;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Hải", 28);
        hashMap.put("Hiếu", 23);
        hashMap.put("Toàn", 25);
        hashMap.put("Minh", 20);
        hashMap.put("Dương", 24);
        System.out.println("Hiển thị các mục trong HashMap");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Hải", 28);
        treeMap.put("Hiếu", 23);
        treeMap.put("Toàn", 25);
        treeMap.put("Minh", 20);
        treeMap.put("Dương", 24);
        System.out.println("Hiển thị các mục nhập theo thứ tự tăng dần của Key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("Hải",28);
        linkedHashMap.put("Hiếu",23);
        linkedHashMap.put("Toàn",25);
        linkedHashMap.put("Minh",20);
        linkedHashMap.put("Dương",24);
        System.out.println("tuổi của Hải là :"+ linkedHashMap.get("Hải"));
        System.out.println(hashMap);
    }
}
