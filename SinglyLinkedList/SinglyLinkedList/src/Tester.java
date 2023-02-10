// NOTE: Instead of storing on two nodes, why not just add them together and store them into the Node?

import java.util.ArrayList;
import java.util.Scanner;
import java.util.LinkedList; // Might use this if I can't figure out how to use the constructor version.

public class Tester {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); 
		Node l1 = null;
		Node l2 = null;
		Node Prev = null;
		Node Curr = null;

		System.out.println("l1: ");

		int inputVal = input.nextInt();

		while (inputVal != -1){
			// For example, if one were to be the first input, that would be the first Node. Then it'll reference it's "pointer" to Previous, which is Null. Since it's backwards, it needs to be modified to be backwards.
			Curr = new Node(inputVal); // Create a new Node.
			Curr.next = Prev; // Set the previous Node to the current node to move along with the linked list process.
			Prev = Curr; // Previous will become the current node.
			inputVal = input.nextInt(); // Collect a new input.
		}
		// Reset all values to start again.
			// Setting l1 to curr will make l1 the head of the linked list.
			l1 = Curr;
			System.out.println("l2: ");
			Curr = null;
			Prev = null;
			inputVal = 0;
		
			inputVal = input.nextInt();

		while (inputVal != -1){
			Curr = new Node(inputVal);
			Curr.next = Prev;
			Prev = Curr;
			inputVal = input.nextInt();
		}
		l2 = Curr;
		Node l3 = new Node();
		l3 = addTwoNumbers(l1, l2);

		System.out.print("[");
		while (l3 != null){
			System.out.print(l3.numb + ", ");
			l3 = l3.next;
			}
			System.out.print("]");
		}

    // Add Two Numbers (Java improved)
    public static Node addTwoNumbers(Node l1, Node l2) {
        Node dummyHead = new Node(0);
        Node curr = dummyHead;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.numb : 0;
            int y = (l2 != null) ? l2.numb : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;
            if (l1 != null){
                l1 = l1.next;
			}
            if (l2 != null){
                l2 = l2.next;
			}
        }
		// Returns the entire list of nodes created by curr except for the first one, that was defined as 0.
		return dummyHead.next;
    }
}