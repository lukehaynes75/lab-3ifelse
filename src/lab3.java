import java.util.Scanner;

public class lab3 {

	public static void main(String[] args) {
		String name; 
		char stopNgo = 'y';		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		name = scan.nextLine();
		System.out.println(name +" please enter an integer between 1 and 100");
		int numb = scan.nextInt();
		
		while(stopNgo == 'y'){
			
			if(numb > 100 || numb < 1) {
				System.out.println(name + " I said between 1 and 100");
			}
				else if(numb > 60 && numb % 2 == 0) {
				System.out.println(name + " thats even and your entry was " + numb);
			}
				else if(numb >= 26 && numb <= 60 && (numb % 2 == 0)) {
				System.out.println(name + " that was even");
			}	
				else if(numb >= 2 && numb < 25 && (numb % 2 == 0)) {
					System.out.println(name + " your number is even and is great than 2 yet less then 25");
				}else if(numb > 60) 
	
					System.out.println(numb + " Odd and over 60");
				else
					System.out.println("Odd");
					System.out.println(name + " would you like to continue? y for yes n for no. If yes please enter next integer");
					stopNgo = scan.next().charAt(0);
					numb = scan.nextInt();
					
					
		}
	}

}
