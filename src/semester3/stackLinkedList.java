package semester3;
import java.util.Scanner;

public class stackLinkedList{
	 class Node{
	        int amount;
	        Node next;

	        Node(int amount){
	            this.amount = amount;
	            this.next = null;
	        }
	    }

	    Node top = null;
	    void addTransaction(int amount){
	        Node newNode = new Node(amount);
	        newNode.next = top;
	        top = newNode;
	        System.out.println("Transaction of Rs. " + amount + " added.");
	    }

	    void undoTransaction(){
	        if(top == null){
	            System.out.println("No transaction available to undo.");
	            return;
	        }
	        System.out.println("Transaction of Rs. " + top.amount + " undone.");
	        top = top.next;
	    }

	    void lastTransaction(){
	        if (top == null){
	            System.out.println("No transactions available.");
	        } else {
	            System.out.println("Last Transaction: Rs. " + top.amount);
	        }
	    }

	    
	    void displayTransactions(){
	        if (top == null) {
	            System.out.println("No transactions available.");
	            return;
	        }
	        Node temp = top;
	        System.out.println("\n===== TRANSACTIONS =====");
	        while (temp != null){
	            System.out.println("Rs. " + temp.amount);
	            temp = temp.next;
	        }
	    }

	    public static void main(String[] args){
	        Scanner input = new Scanner(System.in);
	        stackLinkedList bank = new stackLinkedList();
	        int choice;

	        do {

	            System.out.println("\n===== BANKING SYSTEM =====");
	            System.out.println("1. Add Transaction");
	            System.out.println("2. Undo Last Transaction");
	            System.out.println("3. View Last Transaction");
	            System.out.println("4. Display Transactions");
	            System.out.println("5. Exit");

	            System.out.print("Enter your choice: ");
	            choice = input.nextInt();

	            switch (choice){
	                case 1:
	                    System.out.print("Enter transaction amount: ");
	                    int amount = input.nextInt();

	                    bank.addTransaction(amount);
	                    break;

	                case 2:
	                    bank.undoTransaction();
	                    break;

	                case 3:
	                    bank.lastTransaction();
	                    break;

	                case 4:
	                    bank.displayTransactions();
	                    break;

	                case 5:
	                    System.out.println("Thank you for using Banking System.");
	                    break;

	                default:
	                    System.out.println("Invalid choice.");
	            }

	        } while (choice != 5);
	        input.close();
	    }
}
