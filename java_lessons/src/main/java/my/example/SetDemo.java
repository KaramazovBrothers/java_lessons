package my.example;

import java.util.*;

public class SetDemo {

    public static  void mapMetod() {
        HashMap<String, Integer> film = new HashMap<String, Integer>();
        film.put("The Shawshank Redemption", 9);
        film.put("The Green Mil", 9);
        film.put("Schindler's List", 8);
        film.put("The Matrix", 7);

        for (Map.Entry<String, Integer> item : film.entrySet()) {
            String name = item.getKey();
            Integer rait = item.getValue();
            System.out.println(name + " " + rait);
        }
    }

    public static void keyMetod() {
        HashMap<String, Integer> film = new HashMap<String, Integer>();
        film.put("The Shawshank Redemption", 9);
        film.put("The Green Mil", 9);
        film.put("Schindler's List", 8);
        film.put("The Matrix", 7);

        for (String name : film.keySet()) {
            Integer rait = film.get(name);
            System.out.println(name + " " + rait);
        }
    }

    public static void voidMetod() {
        HashMap<String, Integer> film = new HashMap<String, Integer>();
        film.put("The Shawshank Redemption", 9);
        film.put("The Green Mil", 9);
        film.put("Schindler's List", 8);
        film.put("The Matrix", 7);
        for (Integer i : film.values()) {
            System.out.println(i);
        }
    }

    public static void list(){
        List<String> number = new ArrayList<>();
        number.add("1");
        number.add("2");
        number.add("3");
        number.add("4");
        number.add("4");
        number.add("5");
        Set<String> ybiraemPovtor = new LinkedHashSet<String>(number);
        System.out.println(ybiraemPovtor);
    }
}
