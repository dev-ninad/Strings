package Strings;

import java.util.Arrays;

public class Main {
    public static boolean main(String[] args) 
    {
        String s = {"anagram"};
        String t = {"naaramg"};
        char [] charS = s.toCharArray();
        char [] charT = t.toCharArray();

        Arrays.sort(charS);
        Arrays.sort(charT);

        if(Arrays.equals(charS, charT)) return true;
        else return false;

    }
    
}
