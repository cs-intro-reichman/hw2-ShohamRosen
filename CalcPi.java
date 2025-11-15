/*
use camel case - non_negative_sum -> nonNegativeSum
good practice to write comments
not sure i understanded the logic in the for loop..
*/

// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    //String non_negative_num = (args[0]) ; 

		String non_negative_num = (args[0]) ; 
		int number = Integer.parseInt(non_negative_num) ; 

	//לקבל מספר מהמששתמש ולתרגם אוצו למספר 
	//זה מספר העמיים שאני אוסיף או אחסיר מ1 (1 חלקי מספר אי זוגי) 
	// לולאה שרצה מספר פעמיי עד המספר שהמשתמש רשם ומוסיפה או מחסירה את הערך 

		String all_i = "";
		int n = 0 ;
		double my_pai = 1 ;
		int  the_i_index =0;
		for (double i = 3; i < (number*2 + 1); i = i + 2) {
			all_i += String.valueOf(i) ; //string from all the i
		//System.out.println(all_i);

	//	char the_i_index = all_i.charAt(n); 

			if ((the_i_index % 2) == 0){
				my_pai -= (1.0/i);
			//System.out.println(my_pai);

		}

			else{
				my_pai += (1/i);
			//System.out.println(my_pai);
		}

			the_i_index += 1 ;

	}

		double my_new_pai = 4.0 * (my_pai) ;
	
	
		double pai_java = Math.PI ; 
		System.out.println("pi according to Java: " + pai_java) ; //prints the pai value according to java 
		System.out.println("pi, approximated:     " + my_new_pai);

	}
}

