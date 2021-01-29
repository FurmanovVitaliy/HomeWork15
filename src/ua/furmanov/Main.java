package ua.furmanov;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> words = new HashMap<String, Integer>();

        List<String> arr = new ArrayList<>();
        arr.add("soe");
        arr.add("soe");
        arr.add("soe");
        arr.add("sdfgdgg");
        arr.add("sdfgdgg");
        arr.add("sdfgdgg");
        arr.add("fdfsf");
        arr.add("fdfsf");

        for (int i = 0; i <arr.size() ; i++) {
            String tempWord = arr.get(i);
            if (!words.containsKey(tempWord)) {
                words.put(tempWord, 1);
            } else {
                words.put(tempWord, words.get(tempWord) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            System.out.println("Word = " + entry.getKey() + ", Repeats = " + entry.getValue());
        }

    }
}
