package Strings;
import java.util.*;
class main
{
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        //sb = sb.toLowerCase();
        
        for(int i =0; i< s.length(); i++)
        {   
            char c = s.charAt(i);
            if(c>='a' && c<='z' || c>='0' && c<='9')
            {
                sb.append(c);
            }
        }
        s = sb.toString();
        int strt = 0; 
        int end = s.length()-1;
        while(strt< end)
        {
            if(s.charAt(strt)!= s.charAt(end))
            {
                System.out.println(0);
                return;
            }
            strt++;
            end--;
        }
        System.out.println(1);
        
}
}