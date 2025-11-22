/*
Feedback: 
Great namings and code organization :)
*/

public class TimeCalc {
    public static void main(String[] args) {
        String timeNow = (args[0]); //the input time in the format 00:00
        int minToAdd = Integer.parseInt(args[1]); //the min to add to the time
        String hours = timeNow.substring(0, 2); //takes only the two hours digits
        int hoursOnly = Integer.parseInt(hours); //convert the hours from string to int 
        String mins = timeNow.substring(3, 5); //takes only the two min digits
        int minOnly = Integer.parseInt(mins); //convert the min from string to int 

        int hoursToAdd = ((minOnly + minToAdd) / 60 ); //the total hours to add 
        int minNew = ((minOnly + minToAdd) % 60); //the total min to add
        int newHours = (hoursOnly + hoursToAdd) % 24 ; //the new hour

        String newNewMin = String.valueOf(minNew) ;
        String newNewHours = String.valueOf(newHours) ;

        if (minNew < 10) {
            newNewMin = ("0" + minNew) ;
        }
        if (newHours < 10) {
            newNewHours = ("0" + newHours);
        }

        System.out.println(newNewHours + ":" + newNewMin); 
    }
}

