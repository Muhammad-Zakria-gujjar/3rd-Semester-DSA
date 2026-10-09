package semester3;
import java.util.Scanner;

public class StackOperation{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter maximum size of stack");
         int maxSize=sc.nextInt();
         int stack[]=new int[maxSize];
         int choice;
         int top=-1;
         
         do {
        	 System.out.println("\n----- STACK MENU -----");
             System.out.println("1. Push");
             System.out.println("2. Pop");
             System.out.println("3. Display");
             System.out.println("4. Size");
             System.out.println("5. isEmpty");
             System.out.println("6. isFull");
             System.out.println("7. Exit");
             
             System.out.print("Enter your choice: ");
             choice = sc.nextInt();
         
             switch(choice){
             case 1:
                 if(top==maxSize-1){
                     System.out.println("Stack is Full!");
                 } 
                 else {
                     System.out.print("Enter value: ");
                     int value = sc.nextInt();
                     top++;
                     stack[top]=value;
                     System.out.println("Value pushed successfully.");
                 }
             break;
             
             case 2:
            	 if(top==-1){
            		 System.out.println("stack is empty");
            	 }
            	 else {
            		 System.out.println("popped value is"+stack[top]);
            		 top--;
            	 }
            	 break;
            	 
             case 3:
            	 if(top==-1) {
            		 System.out.println("stack is empty");
            	 }
            	 else {
            		 for(int i=top; i>=0; i--){
                      System.out.println(stack[i]);
                     }
            	 }
            	 break;
            	 
             case 4:
               System.out.println("Current size: "+(top+1));
               break;
            	 
             case 5:
                 if(top==-1){
                   System.out.println("Stack is Empty.");
                 } 
                 else{
                   System.out.println("Stack is NOT Empty.");
                 }
               break;
               
             case 6:
                 if(top==maxSize-1){
                   System.out.println("Stack is Full.");
                 } 
                 else{
                    System.out.println("Stack is NOT Full.");
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

