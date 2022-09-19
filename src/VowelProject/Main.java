package VowelProject;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        // vowel project
        String charWord = "E";
        ArrayList<String> thickVowels= new ArrayList<String>();
        thickVowels.add("a");
        thickVowels.add("ı");
        thickVowels.add("o");
        thickVowels.add("u");

        if (thickVowels.contains(charWord.toLowerCase())){
            System.out.println("Thick Vowels");
        } else {
            System.out.println("Thin Vowels");
        }

    }
}
