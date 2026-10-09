package semester3;
import java.util.Scanner;
public class QueueLinkedList {
	

	    class Node {
	        String order;
	        Node next;

	        Node(String order) {
	            this.order = order;
	            this.next = null;
	        }
	    }

	    Node front = null;
	    Node rear = null;

	   
	    void addOrder(String order) {

	        Node newNode = new Node(order);

	        if (rear == null) {

	            front = newNode;
	            rear = newNode;

	        } else {

	            rear.next = newNode;
	            rear = newNode;
	        }

	        System.out.println("Order added successfully.");
	    }

	   
	    void prepareOrder() {

	        if (front == null) {
	            System.out.println("No pending orders.");
	            return;
	        }

	        System.out.println("Preparing order: " + front.order);

	        front = front.next;

	        if (front == null) {
	            rear = null;
	        }
	    }

	    void nextOrder() {

	        if (front == null) {
	            System.out.println("No pending orders.");
	        } else {
	            System.out.println("Next Order: " + front.order);
	        }
	    }

	    
	    void displayOrders() {

	        if (front == null) {
	            System.out.println("No pending orders.");
	            return;
	        }

	        Node temp = front;

	        System.out.println("\n===== PENDING ORDERS =====");

	        while (temp != null) {

	            System.out.println(temp.order);

	            temp = temp.next;
	        }
	    }

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        QueueLinkedList restaurant = new QueueLinkedList();

	        int choice;

	        do {

	            System.out.println("\n===== RESTAURANT ORDER SYSTEM =====");
	            System.out.println("1. Add Order");
	            System.out.println("2. Prepare Next Order");
	            System.out.println("3. View Next Order");
	            System.out.println("4. Display All Orders");
	            System.out.println("5. Exit");

	            System.out.print("Enter your choice: ");
	            choice = input.nextInt();

	            input.nextLine();

	            switch (choice) {

	                case 1:

	                    System.out.print("Enter food order: ");
	                    String order = input.nextLine();

	                    restaurant.addOrder(order);

	                    break;

	                case 2:

	                    restaurant.prepareOrder();

	                    break;

	                case 3:

	                    restaurant.nextOrder();

	                    break;

	                case 4:

	                    restaurant.displayOrders();

	                    break;

	                case 5:

	                    System.out.println("Restaurant system closed.");

	                    break;

	                default:

	                    System.out.println("Invalid choice.");
	            }

	        } while (choice != 5);

	        input.close();
	    }
}
