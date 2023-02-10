import java.util.Scanner;

public class englishtolatin{
    public static void main(String[] args){
    Scanner inputNumb = new Scanner(System.in);
    
    System.out.println("Welcome to the english to latin numerical translator. (Maximum value is 1000) Insert your first number: ");
    
    int englishNumb = inputNumb.nextInt();
    
    String totalLatin = "";

    switch (englishNumb/100){
        case 0: System.out.println("This value is not greater than 100."); break;
        case 1: totalLatin = "C"; break;
        case 2: totalLatin = "CC"; break;
        case 3: totalLatin = "CCC"; break;
        case 4: totalLatin = "CD"; break;
        case 5: totalLatin = "D"; break;
        case 6: totalLatin = "DC"; break;
        case 7: totalLatin = "DCC"; break;
        case 8: totalLatin = "DCCC"; break;
        case 9: totalLatin = "CM"; break;
        case 10: totalLatin = "M"; break;
        }
    switch (englishNumb/10){
        case 0: System.out.println("This value is not greater than 10."); break;
        case 1: totalLatin = totalLatin + "X"; break;
        case 2: totalLatin = totalLatin + "XX"; break;
        case 3: totalLatin = totalLatin + "XXX"; break;
        case 4: totalLatin = totalLatin + "XL"; break;
        case 5: totalLatin = totalLatin + "L"; break;
        case 6: totalLatin = totalLatin + "LX"; break;
        case 7: totalLatin = totalLatin + "LXX"; break;
        case 8: totalLatin = totalLatin + "LXXX"; break;
        case 9: totalLatin = totalLatin + "XC"; break;
        //case 10: totalLatin = totalLatin + "C";
        }
        switch (englishNumb % 10){
            case 0: System.out.println("This value is not greater than 0."); break;
            case 1: totalLatin = totalLatin + "I"; break;
            case 2: totalLatin = totalLatin + "II"; break;
            case 3: totalLatin = totalLatin + "III"; break;
            case 4: totalLatin = totalLatin + "IV"; break;
            case 5: totalLatin = totalLatin + "V"; break;
            case 6: totalLatin = totalLatin + "VI"; break;
            case 7: totalLatin = totalLatin + "VII"; break;
            case 8: totalLatin = totalLatin + "VIII"; break;
            case 9: totalLatin = totalLatin + "IX"; break;
            //case 10: totalLatin = totalLatin + "C";
        }
        System.out.println("Your latin translation is: " + totalLatin);
    }
}