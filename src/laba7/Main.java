package laba7;

import java.util.ArrayList;

public class Main {
    public static ArrayList<String> NewText = new ArrayList<>();

    public static ArrayList<String> regexPlanet(){
        String [] text = {"b12345b", "aa1234c", "AC4714EX", "bas1-2-3-4-5bas", "blasdA12-12Asbdf", "ABSdfda12-47-56basdA"};
        String regex = "([a-zA-Z]{1,}\\d{1,4}[a-zA-Z]{1,})|([a-zA-Z]{1,}\\d{1}-\\d{1}-\\d{1}-\\d{1}[a-zA-Z]{1,})|([a-zA-Z]{1,}\\d{1}-\\d{1}-\\d{1}[a-zA-Z]{1,})|([a-zA-Z]\\d{1}-\\d{1}[a-zA-Z]{1,})|([a-zA-Z]{1,}\\d{2}-\\d{1}-\\d{1}[a-zA-Z]{1,})|([a-zA-Z]{1,}\\d{1}-\\d{2}-\\d{1}[a-zA-Z]{1,})|([a-zA-Z]{1,}\\d{1}-\\d{1}-\\d{2}[a-zA-Z]{1,})|([a-zA-Z]{1,}\\d{1}-\\d{2}[a-zA-Z]{1,})|([a-zA-Z]{1,}\\d{2}-\\d{1}[a-zA-Z]{1,})|([a-zA-Z]{1,}\\d{2}-\\d{2}[a-zA-Z]{1,})";
        for (String temp : text){
            if (!temp.matches(regex)){
                NewText.add(temp);
            }
        }
        System.out.println(NewText);
        return NewText;
    }
    public static void main(String[] args){
        regexPlanet();
    }
}

