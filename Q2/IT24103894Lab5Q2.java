import java.util.Scanner; 
    public class IT24103894Lab5Q2 {
		public static void main(String [] args)  {
		
		Scanner scanner = new Scanner(System.in);
		
		int pricetype;
		
		System.out.print("Enter the number of new members introduced: ");
		pricetype = scanner.nextInt();
		
		switch(pricetype)
		{
			case 0 : 
			    System.out.print("No Price");
				break;
			case 1 : 
			    System.out.print("The price is: Pen");
				break;
            case 2 : 
			    System.out.print("The price is: Umbrella");
				break;    			
		    case 3 : 
			    System.out.print("The price is: Bag");
				break;
		    case 4 : 
			    System.out.print("The price is: Traveling Chair");
				break;
	    
			default  : 
			if  (pricetype >= 5) {
				System.out.print("The price is: Headphone ");
			}
			else {
                System.out.print("Input must be a number 0 or greater");
				
			}
		   }
	         scanner.close();			
		} 
	}	