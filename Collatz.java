/*
Feedback: 
Great thinking!
We are writing camelCase (not python)therefore names should be instead of: num_from -> numFrom
*/

// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {

		//int number = 7 ; 
		//String mode = "c" ; 
		String num_from =  args[0] ;
		int number = Integer.parseInt(num_from); //the number
		String mode = args[1] ; //the v/c mode 

	
		for (int num_in_numbers = 1; num_in_numbers <= number; num_in_numbers++) { // for loop that run from 1 to number 

			int the_current_num = num_in_numbers ; // variable which contain the same value as num_in_numbers

			int counter = 1 ; //the number of steps to recieve 1

			String the_list_of_num = "" ; //the variable that the number will enter in 

			do { 
				if (the_current_num % 2 == 0) {//if the number is even, divide it by 2
				counter += 1 ; //add 1 to the counter
				the_list_of_num +=  the_current_num + " " ; //put the number inside the string 
				the_current_num = the_current_num / 2;
				//the_list_of_num += the_current_num + " " ; 
				
			} 
			else if (the_current_num % 2 != 0) {
				counter += 1 ; //add 1 to the counter
				the_list_of_num +=  the_current_num + " " ; //put the number inside the string 
				the_current_num = (the_current_num * 3) + 1 ; 
				//the_list_of_num += the_current_num + " " ; 

			}

			//System.out.println(the_current_num);
			//System.out.println(the_list_of_num);
	
			} while (the_current_num != 1);
		

			if (the_current_num == 1) {
				the_list_of_num += the_current_num + " " ; //if the num = 1 add it to the list 

			} 


	if (mode.equals("v")) {
		System.out.println(the_list_of_num + ""  + "(" + counter + ")" );

	}
				
	}

	
			
	
	System.out.println("Every one of the first " + number + " hailstone sequences reached 1.");

	}
}


		






