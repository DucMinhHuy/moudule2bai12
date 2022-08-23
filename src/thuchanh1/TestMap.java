package thuchanh1;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Map<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Smith",30);
        hashMap.put("Anderson",31);
        hashMap.put("lewis",29);
        hashMap.put("cook",29);
        System.out.println("display hashMap");
        System.out.println(hashMap+"\n");
        Map<String,Integer>treeMap=new TreeMap<>(hashMap);
        System.out.println("display of key");
        System.out.println(treeMap);
        Map<String,Integer> linkedHashMap=new LinkedHashMap<>(16,0.75f,true);
        linkedHashMap.put("Smith",30);
        linkedHashMap.put("Anderson",31);
        linkedHashMap.put("lewis",29);
        linkedHashMap.put("cook",29);
        System.out.println("The age for"+"Smith is"+"\n"+linkedHashMap.get("Smith"));

    }
}
