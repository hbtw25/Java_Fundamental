import static java.lang.System.*; 
public class OverlayComflexflag {
    public static void main(String[]args){
        printTopHalf();

        print48Colons();
        print48Ohs();
        print48Colons();
        print48Ohs();
        print48Colons();
        print48Ohs();
    }
    public static void print48Colons(){
        out.println("|:::::::::::::::::::::::::::::::::::::::::::::::|");
    }
    public static void print48Ohs(){
        out.println("|00000000000000000000000000000000000000000000000|");
    }
    public static void print29Colons(){
        out.println("|::::::::::::::::::::::::|");
    }
    public static void printPledge(){
        out.println("I pledge allegiance to the flag.");
    }
    public static void print29Ohs(){
        out.println("|000000000000000000000000|");
    }
    public static void print6Stars(){
        out.println("|******");
    }
   public static void print5Stars(){
        out.println("|*****");
    }
    public static void printSixStartLine(){
        print6Stars();
        print29Ohs();
    }
    public static void printFiveStartLine(){
        print5Stars();
        print29Ohs();
    }
    public static void printTopHalf(){
        out.println("|________________________________________________|");
        // the line above has 1 space then  48 undersscores between the quotes
        printSixStartLine();
        printFiveStartLine();
        printSixStartLine();
        printFiveStartLine();
        printSixStartLine();
        printFiveStartLine();
        printSixStartLine();
    }
}
