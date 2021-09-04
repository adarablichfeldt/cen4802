//Written by Adara Blichfeldt

//Imports
import java.util.Scanner;

public class mod2_Recursive {
      
    public static void main (String args[])
    {
    	
    Scanner s = new Scanner(System.in);
    
    System.out.println("Please submit the position of the Fibonacci sequence you would like to see: ");
	int num = s.nextInt();
	int position = num;
    System.out.println("The " + position + " position of the Fibonacci sequence is " + Fibonacci(num));
    }
    
    static int Fibonacci(int num)
    {
    	
    if (num <= 1)
       return num;
    return Fibonacci(num-1) + Fibonacci(num-2);
    
    }
		
}
