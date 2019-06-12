package main.logic.listString;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> words = new ArrayList<>();

    public void addStringToList(String... strings){
        for (String string : strings) {
            words.add(string);
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.addStringToList("E", "D", "R");
        System.out.println(words);
    }

}
