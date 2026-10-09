package semester3;
import java.util.Scanner;

public class QueueOperation{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter maximum size of queue: ");
        int maxSize=sc.nextInt();
        int[]queue=new int[maxSize];
        int front=-1;
        int rear=-1;
        int choice;
        
        do{
            System.out.println("\n----- QUEUE MENU -----");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Size");
            System.out.println("5. isEmpty");
            System.out.println("6. isFull");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
        
        switch(choice){
        case 1:
            if(rear==maxSize-1){
                System.out.println("Queue is Full!");
            }
            else{
                System.out.print("Enter token number: ");
                int value=sc.nextInt();

                if(front==-1){
                    front=0;
                }
                rear++;
                queue[rear]=value;
                System.out.println("Value added to queue.");
            }
        break;
        
        case 2:
            if(front==-1 || front>rear){
                System.out.println("Queue is Empty!");
            }
            else{
                System.out.println("Dequeued value: "+queue[front]);
                front++;

                if (front>rear){
                    front=-1;
                    rear=-1;
                }
                 }
            break;
        
        case 3:
            if(front==-1){
                System.out.println("Queue is Empty!");
            }
            else{
                System.out.println("Queue values:");
                for (int i=front; i<=rear;i++){
                    System.out.println(queue[i]);
            }
            }
            break;
            
        case 4:
          if(front==-1){
          System.out.println("Current size: 0");
          }
           else{
              System.out.println("Current size: "+(rear-front+1));
            }
            break;
            
        case 5:
            if(front==-1){
                System.out.println("Queue is Empty.");
            }
            else{
             System.out.println("Queue is NOT Empty.");
            }
            break;
  
        case 6:
            if(rear==maxSize-1){
                System.out.println("Queue is Full.");
            }
            else{
             System.out.println("Queue is NOT Full.");
            }
            break;
            
            
        case 7:
            System.out.println("Program Ended.");
            break;
            
        default:
            System.out.println("Invalid Choice!");
        }
	}
        while(choice!=7);
}
}