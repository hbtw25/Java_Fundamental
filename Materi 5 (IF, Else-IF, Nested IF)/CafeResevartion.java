import java.util.Scanner;
public class CafeResevartion{
public static void main(String[] args) {
//Deklarasi variable yang dibutuhkan
String name, gender, day, result;
int age;
double appearance, money;
Scanner input = new Scanner (System.in);
//inisialisasi variable
result = "";
//Text output untuk Inputan User
System.out.println("Welcome to Reservation Cafe 79.\n");
System.out.println("Please insert your Name: ");
name = input.nextLine ();
System.out.println ("How old are You?");
age=input.nextInt ();
System.out.println("What is your Gender (Male/Female) : ");
gender = input.next();
System.out.println("How attractive are you? (1 to 10)");
appearance = input.nextDouble();
System.out.println ("How much money do you have ?");
money = input.nextDouble();
System.out.println("what day do you want to make a reservation?");
day = input.next();

//membuat kondisi untuk setiap hari
if(day.equalsIgnoreCase("Monday")){
    //Contoh kondisi untuk Monday Seperti di Soal
        /*
        Condition for Monday
        -Young Night:
        Age from 20 to 30
        - All Gender
        Money start From $500
*/
//buat if untuk pengecekan
if (age >= 20 &&   age <= 30 && money >= 500) {
    result = "Reservation Successfully, You can Order on Monday. Young Night.";
    } else {
    result = "Sorry, you can't Order on Monday!!. Because it is for Young { Night.";
    }
}else if (day.equalsIgnoreCase ("Tuesday")){
    /*Condition for Tuesday
Oldest Night:
Age From 31 to 50
All Gender
- Money Start from $250
*/
//Membuat if untuk Kondisi Tuesday
if (age >= 31 && age <= 50 && money >= 250) {
    result = "Reservation Successfully, You can Order on Tuesday. Oldest Night.";
    } else{
    result = "Sorry, you can't Order on Tuesday!!. Because it is for Oldest Night.";
}}
else if(day.equalsIgnoreCase ("Wednesday")) {
    /*
    Condition for Wednesday
    Ladies Night:
    Age From 20 to 35
    Female Only
    Must Attractive.
    - Money Start from $300
    */
    // If kondisi untuk Wednesday
    if (gender.equalsIgnoreCase ("Female") && age >= 20 && age <= 35 && appearance >= 8 &&
    money > 300) {
    result = "Reservation Successfully, You can Order on Wednesday. Ladies Night.";
    }else{
    result = "Sorry, you can't Order on Wednesday!!. Because it is for Ladies Night.";
}}
else if (day.equalsIgnoreCase("Thursday")) {
    /*
    Condition for Thursday
    Party Night For Single:
    Age from 21 to 30
    All Gender
    Female must be attractive and money start from $300
    Male must have money start $1000
    */
    // If conditions for Thursday
    if (gender.equalsIgnoreCase("Female") && age >= 21 && age <= 30 && money >= 300 &&
            appearance >= 8) {
        result = "Reservation Successfully, You can Order on Thursday. Party Night For Single.";
    } else if (gender.equalsIgnoreCase("Male") && age >= 21 && age <= 30 && money >= 1000) {
        result = "Reservation Successfully, You can Order on Thursday. Party Night For Single.";
    } else {
        result = "Sorry, you can't Order on Thursday!!. Because it is Party Night For Single.";
    }
}else if(day.equalsIgnoreCase ("Friday")) {
/* Condition for Friday
    Female Night:
    Female Age from 31 to 45
    Male Age from 21 to 25
    Male must attractive
    Female must have money at least $1000 */
    //if kondisi Friday
    if (gender.equalsIgnoreCase ("Female") && age >= 31 && age <= 45 && money >= 1000) {
    result = "Reservation Successfully, You can Order on Friday. Women Night.";
    }else if (gender.equalsIgnoreCase ("Male") && age >= 21 && age <= 25 && appearance >= 8)
    result = "Reservation Successfully, You can Order on Friday. Women Night.";
    }else {
    result = "Sorry, you can't Order on Friday!!. Because it is for Women Night.";
    }
    if(day.equalsIgnoreCase ("Saturday") || day.equalsIgnoreCase("Sunday")){
        /*weekend Fredom :
         age 18 to 60
         money start From $100
        */
        //if kondisi weekend
        if( age >= 18 && age <= 60 && money >=100){
                result = "Reservation Successfully, You can Order on weekend days. weekend Fredom.";
  }else{
     result = "Sorry, you can't Order on Thursday!!. Because it is for weekend Fredom.";
  }
    } 
    System.out.println();
    System.out.println("Hi "+ name + ", thanks you for using our aplication");
    System.out.println("following result for your reservation:");
    System.out.println(result);}
}








