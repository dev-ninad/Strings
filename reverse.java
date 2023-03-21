package Strings;

class Main
{
    public static void main(String[] args) 
    {
        String s = "Hi I am Ninad Kapadnis";
          //String [] str = s.split(" ");
            int  n = s.length();
            String rev = ""; 

            for(int i= n-1; i>=0; i--)
            {
                rev += s.charAt(i); 
            }
        System.out.println(rev);
    }
} 





//reverse string?
