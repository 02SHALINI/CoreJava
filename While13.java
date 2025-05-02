class While13
{
    public static void main(String[] args)
    {    
	    int n = 3;
		int fact = 1;
		while(n>0)
		{   
			fact =fact *n;
			n--;
			
		}
		System.out.println("Factorial: " + fact);
	}	
}