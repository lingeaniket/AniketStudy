package Hashing;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 12);
        map.put(3, 15);
        map.put(3, map.getOrDefault(3, 0)+1);
        System.out.println(map.getOrDefault(2, 13));
        System.out.println(map);
        System.out.println(map.get(3));
    }
}
