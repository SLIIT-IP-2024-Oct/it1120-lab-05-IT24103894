import java.util.Scanner;
    public class IT24103894Lab5Q3 {
		private static final double chargePerday = 48000.0;
		private static final int discount_3to4 = 10;
		private static final int discount_5or_more = 20;
		
		public static void main (String []args) {
	        Scanner scanner = new Scanner(System.in);
			
			int startDate,endDate,daysReserved;
			double amount;
			
			System.out.print("Enter Start Date (1-31): ");
			startDate = scanner.nextInt();
			
			System.out.print("Enter End Date (1-31): ");
			endDate = scanner.nextInt();
			
			if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31 ) {
			System.out.println("Error: Days must be between 1 and 31");
			return;
            }
			
			if ( endDate <= startDate) {
            System.out.println("Error: start date must be less than End date");
            return;
            }
			
			daysReserved = endDate - startDate;
			
			amount = daysReserved*chargePerday;
			
			if (daysReserved >= 3 && daysReserved <= 4) {
			    amount = amount - (amount*discount_3to4/100);
            } else if (daysReserved >= 5) {
				amount = amount - (amount*discount_5or_more/100);
			}
             
            System.out.println();
            System.out.println("\nRoom charge per day: Rs. "+ chargePerday + "/=");
            System.out.println("Number of Days Reserved: "+ daysReserved);
            System.out.println("Total Amount to be paid: Rs. "+	amount);		
          	
            scanner.close();			
		}
	}	