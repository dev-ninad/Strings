package Strings;

import java.util.Scanner;

class Strings
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str= str.toLowerCase();

        StringBuilder sb = new StringBuilder();
        String[] arr = str.split("_");
        for(int i=0; i<arr.length; i++)
        {
            String s = arr[i];
            char c = Character.toUpperCase(s.charAt(0));
            sb.append(c);
            sb.append(s.substring(1)); 
        }
        System.out.println(sb.toString());
    }
}
