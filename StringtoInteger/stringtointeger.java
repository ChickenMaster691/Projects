import java.util.Scanner;

public class stringtointeger{
    public static void main(String[] args){

        Scanner inputString = new Scanner(System.in);

        System.out.println("Welcome to string to integer translator. Input your string value: ");

        String stringVal = inputString.nextLine();

        String filteredVal = stringVal.trim();

        filteredVal.trim();

        String regex = "[^0-9/*+-]";

        filteredVal = filteredVal.replaceAll(regex, "");

        //filteredVal.replaceAll("[^0-9]|[^-|+]","");

        System.out.println(filteredVal);

        if (filteredVal == null || filteredVal.equals("")){
            filteredVal = "0";
        }

        int integerConversion = Integer.parseInt(filteredVal); //* isNegative;

        //System.out.println(integerConversion + 2);

        //System.out.println("Proving this function is working: " + integerConversion*24);
    }
}