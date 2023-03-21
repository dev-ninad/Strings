package Strings;


class Strings
{
	public static void main(String[] args) 
	{
	    String s = "aabbbcc";
		char[] c = s.toCharArray();
	    int size = c.length;
	    int counter =0;
	    int max = 0;
	    int max_char = c[0];
	    for(int i =0; i<=size-1; i++)
	{
	    counter =0;
		for(int j=0; j<=size-1;j++)
			{
			    if(j<i && c[i]==c[j])
			    {
			        break;
			    }
				if(c[i] == c[j])
				{
					counter++;
				}
				if(counter>max)
				{
				    max = counter;
				}
			}
		System.out.println("occuring character: "+c[i]+" for this times "+counter); 
	}
	        
	        System.out.println("occuring character max " + max); 
    }
}