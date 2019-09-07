// Kevin Chen, 23365285

import java.util.Calendar; //Used for Today's Year
import java.util.Scanner; //Used for Input

public class Test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //For Inputs
        HeartRates User1 = new HeartRates(); //Creates a User1
        System.out.println("Insert Person's First Name"); //First Name?
        String FirstName = input.nextLine(); //Inputs First Name
        System.out.println("Insert Person's Last Name"); //Last Name?
        String LastName= input.nextLine(); //Inputs Last Name
        User1.SetName(FirstName, LastName); //Creates Profile of User1
        System.out.println("Insert Person's Month of Birth"); //Month of Birthday?
        int Month = input.nextInt(); //Gets Value of Month
        while (Month < 1 || Month > 12){
            System.out.printf("Invalid: %d is not between 1-12%n Try Again %n", Month);
            Month = input.nextInt();
        } //Checks to See if Month is Legit
        System.out.println("Insert Person's Day of Birth"); //Day of Birthday?
        int Day = input.nextInt(); //Gets Value of Day
        while (Day < 1 || Day > 31){
            System.out.printf("Invalid: %d is not between 1-31%n Try Again %n", Day);
            Day = input.nextInt();
        } //Checks to see if Day is Legit
        System.out.println("Insert Person's Year of Birth"); //Year of Birthday?
        int Year = input.nextInt(); //Gets Value of Year
        Calendar cal = Calendar.getInstance(); //Uses the Calender Function
        int ThisYear = cal.get(cal.YEAR); //Gets the Current Year
        while (Year > ThisYear){
            System.out.printf("Invalid: %d is not below %d%n Try Again %n", Year,ThisYear);
            Year = input.nextInt();
        } //Checks to see if Year is Legit
        User1.DOB(Month, Day, Year); //Adds Date of Birth to Profile
        int Age = User1.ReturnAge(); //Gets Value of Age
        System.out.printf("Name: %s %s%n",User1.ReturnFirstName(),User1.ReturnLastName()); //Prints Name
        System.out.printf("Date of Birth: %d/%d/%d%n",User1.ReturnMonth(),User1.ReturnDay(),User1.ReturnYear()); //Prints Date of Birth
        System.out.printf("Age: %d%n",User1.ReturnAge()); //Prints Age
        System.out.printf("Maximum Heart Rate in Beats per Minute: %d%n",User1.ReturnMaxHeart(Age)); //Prints Max Heart Rate
        System.out.printf("Heart Rate Range: %.2f to %.2f%n",User1.ReturnLowerRange(Age),User1.ReturnHigherRange(Age)); //Print Heart Rate Range
    }
}
