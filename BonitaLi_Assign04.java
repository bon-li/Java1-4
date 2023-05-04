/* 
BonitaLi_Assign04.java is written by B. Li on Nov 24, 2021
It is a simple code that asks user for a positive integer and asks user to select and option using methods. Program loops until user exits. 
 */
import java.util.Scanner;
public class BonitaLi_Assign04 {
	public static void main (String[] args) {
		Scanner inData = new Scanner(System.in);
		int num=1, choice=1;
				System.out.println("Enter an integer");
				num = inData.nextInt();			
				while (num <= 0) {
					System.out.println("Invalid integer. Please enter a positive integer");
					num = inData.nextInt();
				}//while loop end
				while (choice != 0) {
					System.out.printf("\n"); //choice selection
					System.out.println("Select one of the following options:");
					System.out.println("Enter 1 to print all prime numbers less than " + num);
					System.out.println("Enter 2 to print all prime factors of " + num);
					System.out.println("Enter 3 to determine if " + num + " is a perfect square");
					System.out.println("Enter 4 to reenter the integer");
					System.out.println("\nEnter 0 to exit");
					choice = inData.nextInt();				
					if (choice < 0 || choice > 4) { //checking invalid choice selection
						System.out.println("Invalid selection.");
					}//if block ends	
					switch (choice) {
						case 0: //terminate program
							System.out.println("Thank you.");
							break;
						case 1: //option 1 prime numbers of integer
							primeNum(num);
							break;
						case 2: //option 2 prime factors of integer
							primeFactor(num);
							break;
						case 3: //option 3 determine whether number is perfect square
							perfectSq(num);
							break;
						case 4: //option 4 entering new integer
							System.out.println("Enter an integer");
							num = inData.nextInt();
							while (num <= 0) {
								System.out.println("Invalid integer. Please enter a positive integer");
								num = inData.nextInt();
							}//while loop end
						default:
							break;
					}//switch ends
				}//while loop ends
	}//main method end
	public static void primeNum(int pNum) { //method for finding prime numbers
		boolean isPrime=true;
		System.out.println("All the prime numbers less than " + pNum + " are:");
		for (int ctr1=2; ctr1 < pNum; ctr1++){
			for (int ctr2=2; ctr2 < ctr1; ctr2++) {
				if (ctr1 % ctr2 == 0) {
					isPrime = false;
				}//if block ends
			}//inner for loop ends
			if (isPrime == true) {
				//System.out.print(ctr1);
				System.out.printf(ctr1 + " ");
			}//if block ends
			isPrime = true;
		}//outer for loop ends
		System.out.println(" ");
	}//primeNum method end	
	public static void primeFactor(int primeFact) { //method for finding prime factors
		boolean isPrime=true;
		System.out.println("Prime factors of " + primeFact + " are:");
		for(int ctr5=2; ctr5 < primeFact; ctr5++) {
			 if (primeFact % ctr5 == 0){
	                for (int ctr6 = 2; ctr6 < ctr5; ctr6++) { 
	                    if (ctr5 % ctr6 == 0) { 
	                        isPrime = false;
	                    }//if block ends            
	                }//for loop ends
	                if (isPrime == true) { 
	                    System.out.printf(ctr5 + " "); 
	                }//if block ends
	                isPrime = true;
	            }//if block ends
		}//for loop ends
		System.out.println(" ");
	}//primeFactor method ends	
	public static void perfectSq (int perfSq) { //method for determining perfect square or not
		double sqrt = Math.sqrt(perfSq);
		if ((sqrt - Math.floor(sqrt)) == 0) {
			System.out.println(perfSq + " is a perfect square");
		}//if block ends
		else {
			System.out.println(perfSq + " is not a perfect square");
		}//else block ends
	}//perfectSq method ends
}//class end
