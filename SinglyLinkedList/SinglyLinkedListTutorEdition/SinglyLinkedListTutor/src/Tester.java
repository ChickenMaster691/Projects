import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); 
		Pattern numbPattern = Pattern.compile("\\d");
		Matcher numbFinder = null;
		
		ArrayList<Node> lists = new ArrayList<Node>();
		
		// input.hasNext() peeks into the input buffer/inputStream and checks to see if "Exit" is in there
		while(!input.hasNext("Exit")) {
			
			// If hasNext() does not find "Exit" then we consume what ever is in the buffer for 
			// Processing 
			String number = input.nextLine(); 

			// numbFinder has the pattern matcher which is looking for numbers "//d" in the string "number"
			numbFinder = numbPattern.matcher(number); 
			
			// call numbFinder to find() the next number token in the "number" variable if 
			// one exists then call group() to grab the number and print it out
			// black boxing 
			
			// Recursively create linked lists 
			lists.add(makeList(numbFinder));
		
		}	
		
		// print out contents of list
		for(int i = 0; i < lists.size(); i++) {
			
			System.out.print(" List " + i + " ->");
			Node tmp = lists.get(i); 
			while( tmp != null) {
				System.out.print(tmp.numb);
				tmp = tmp.next;
			}
			System.out.println();
			
		}
	}
	
	// recursive method
	static Node makeList(Matcher numbFinder) {
		
		// if there are numbers in the list then we call our selves again
		if (numbFinder.find()) {
			return new Node(Integer.parseInt(numbFinder.group()), makeList(numbFinder));
		} 
		// no numbers then its the end of the list and we return null
		return null; 	
	}
}

// Regex
// Data structures hash table, trees, linked list, stack, queue 
// Time complexity of a program?????? 
// Basic Sorting Algos





