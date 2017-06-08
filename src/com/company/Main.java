package com.company;

public class Main {

    public static void main(String[] args) {
        String testString = "BBennett";
        testString=removeVowels(testString);
        System.out.println(testString);
        System.out.println(testString);
        testString = removeDoubleAdjacentLetters(testString);
        testString = replaceConsonants(testString);
        System.out.println(testString);
        testString = trimPad(testString);
        System.out.println(testString);
}

    /*  public static Code matcher(String word1, String word2){
          Code code;
          return code;
      }
      */
    public static String removeDoubleAdjacentLetters(String word) {
        String testString = word;
        testString= testString.replaceAll("(.)\\1+", "$1");
        return testString;
    }

    public static String removeVowels(String word) {
        String firstLetter = word.substring(0, 1);
        String testString = word;
        testString = testString.substring(1).replaceAll("[a|e|i|o|u|y|h|w]", "");
        return firstLetter + testString;
    }

    public static String replaceConsonants(String word){
        String firstLetter = word.substring(0, 1);
        String testString = word.substring(1);
        testString = testString.replaceAll("[b|f|p|v|B|F|P|V]", "1");
        testString= testString.replaceAll("[c|g|j|k|q|s|x|z|C|G|J|K|Q|S|X|Z]", "2");
        testString= testString.replaceAll("[d|t|D|T]", "3");
        testString= testString.replaceAll("[l|L]", "4");
        testString= testString.replaceAll("[m|n|M|N]", "5");
        testString = testString.replaceAll("[r|R]", "6");
        return firstLetter + testString;
    }
    public static String trimPad(String word){
        String testString = word;
        if(testString.length()>4){
            testString = testString.substring(0,4);
        } else if (testString.length()<4){
            int difference = 3-testString.length();
            String repeated = new String(new char[difference]).replace("","0");
            testString = testString + repeated;
        }
        return testString;
    }

}

