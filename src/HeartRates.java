// Kevin Chen, 23365285

import java.util.Calendar; //Used for Today's Date

public class HeartRates {
    private String FirstName; //Stores First Name
    private String LastName; //Stores Last Name
    private int Month; //Stores Month of Birthday
    private int Day; //Stores Day of Birthday
    private int Year; //Stores Year of Birthday

    public void SetName(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
    } //Sets the First Name and Last Name
    public void DOB(int Month, int Day, int Year){
        this.Month = Month;
        this.Day = Day;
        this.Year = Year;
    } //Sets the Date of Birth
    public String ReturnFirstName(){
        return FirstName;
    } //Returns First Name
    public String ReturnLastName(){
        return LastName;
    } //Returns Last Name
    public int ReturnMonth(){
        return Month;
    } //Returns Month of Birthday
    public int ReturnDay(){
        return Day;
    } //Returns Day of Birthday
    public int ReturnYear(){
        return Year;
    } //Returns Year of Birthday
    public int ReturnAge(){
        Calendar cal = Calendar.getInstance(); //Gets the Calender Function
        int CurrentYear = cal.get(cal.YEAR); //Gets Current Year
        int CurrentMonth = cal.get(cal.MONTH)+1; //Gets Current Month
        int CurrentDay = cal.get(cal.DATE); //Gets Current Day
        int Passed = CurrentYear - Year; //Calculations if Birthday Passed
        int NotPassed = CurrentYear - Year - 1; //Calculations if Birthday Did Not Pass
        if (Month > CurrentMonth){
            return NotPassed;
        } //Checks Month
        else if (Month < CurrentMonth){
            return Passed;
        } //Checks Month
        else {
            if (Day > CurrentDay){
                return NotPassed;
            } //Checks Day
            else {
                return Passed;
            } //Checks Day
        } //If Month is the same, Check Day
    } //Calculations for the Age
    public int ReturnMaxHeart(int Age){
        return 220 - Age;
    } //Max Heart Rate in Beats Per Minute
    public double ReturnLowerRange(int Age){
        double MaxHeart = 220 - Age;
        double LowerRange = MaxHeart * 0.50;
        return LowerRange;
    } //Lower Range of the Max Heart Rate
    public double ReturnHigherRange(int Age){
        double MaxHeart = 220 - Age;
        double HigherRange = MaxHeart * 0.85;
        return HigherRange;
    } //Higher Range of the Max Heart Rate
}
