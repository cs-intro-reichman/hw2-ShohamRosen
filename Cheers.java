//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String the_word_new = (args[0]); //the string inut 
            String the_word = the_word_new.toUpperCase() ; 
            String num = (args[1]); //the number input
            int the_number = Integer.parseInt(args[1]); //convert the number from string to int 

            int length_word = the_word.length() ; //the length of the word


                for (int i = 0 ; i < length_word; i++) {

                        char the_letter = the_word.charAt(i) ; //the letter in the indwx i
                        String the_letter_to_check = "REFHILMNOASX" ; 

                        if ((the_letter_to_check.indexOf(the_letter)) != -1) {
                                 System.out.println("Give me an " + the_letter + ": " + the_letter + "!"); //prints the letter
                        }else{
                                 System.out.println("Give me a  " + the_letter + ": " + the_letter + "!"); //prints the letter 
                        }
                }

                        
                System.out.println("What does that spell?");
                for (int n = 0; n < the_number; n++) {
                        System.out.println(the_word + "!!!");

                }


        }

}

     
