package semester3;
import java.util.Scanner;

public class ArrayLibary{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter maximum size of shelf");
		int MaxSize=sc.nextInt();
		
		int[]books=new int[MaxSize];
		int size=0;
		int choice;
		
		  do{
			System.out.println("1 Add value");
			System.out.println("2 insert value");
			System.out.println("3 Fill Array");
			System.out.println("4 Delete Last Element");
			System.out.println("5 Delete by Index");
			System.out.println("6 Display");
			System.out.println("7 Search Value");
			System.out.println("8 Get value at Index");
			System.out.println("9 Replace value");
			System.out.println("10 show size");
			System.out.println("11 Exit");
			
			System.out.println("Enter your choice");
			 choice=sc.nextInt();
			
			switch(choice){
			case 1:
			if(size==MaxSize) {
				System.out.println("array is full");
			}
			else {
				System.out.println("Enter book Id");
				int value=sc.nextInt();
				 books[size]=value;
				size++;	
			}
			break;
			
			case 2:
			if(size==MaxSize){
				System.out.println("Array is Full");
			}
			else {
				System.out.println("enter index");
				 int index=sc.nextInt();
                 if (index<0 || index>size){
                     System.out.println("Invalid index!");
                 } 
                 else {
                     System.out.print("Enter book ID: ");
                     int value=sc.nextInt();
                     for(int i=size;i>index;i--){
                         books[i]=books[i-1];
                     }
                     books[index]=value;
                     size++;
			}
			}
			break;
			
			  case 3:
                  System.out.println("Enter values."); -1 to stop.");
                  while(size<MaxSize){
                      System.out.print("Enter book ID: ");
                      int value=sc.nextInt();
                      
                      if(value==-1){
                          break;
                      }
                      books[size]=value;
                      size++;
                  }
                  if(size==MaxSize){
                      System.out.println("Array is now full.");
                  } 
                  else {
                      System.out.println("Input stopped.");
                  }
                  break;
			  case 4:
                  if(size==0){
                      System.out.println("Array is empty!");
                  } 
                  else{
                      size--;
                      System.out.println("Last element deleted.");
                  }
                  break;
                  
			  case 5:
                  if(size==0){
                      System.out.println("Array is empty!");
                  } 
                  else{
                      System.out.print("Enter index to delete: ");
                      int index=sc.nextInt();

                      if(index<0 || index>=size){
                          System.out.println("Invalid index!");
                      } 
                      else{
                          for (int i=index; i<size-1; i++){
                              books[i]=books[i+1];
                          }
                          size--;
                          System.out.println("Element deleted successfully.");
                      }
                  }
                  break;
			
			  case 6:
                  if(size==0){
                      System.out.println("Array is empty!");
                  } 
                  else{
                      System.out.println("Book IDs:");
                      for (int i=0; i<size; i++){
                          System.out.println("Index "+i+"="+books[i]);
                      }
                  }
                  break;
                  
			  case 7:
                  System.out.print("Enter book ID to search: ");
                  int search = sc.nextInt();
                  int foundIndex = -1;

                  for(int i=0; i<size; i++){
                      if(books[i]==search){
                          foundIndex=i;
                          break;
                      }
                  }

                  if(foundIndex!=-1){
                      System.out.println("Value exists at index: "+foundIndex);
                  } 
                  else{
                      System.out.println("Value does not exist.");
                  }
                  break;
                  
			  case 8:
                  System.out.print("Enter index: ");
                  int getIndex=sc.nextInt();

                  if(getIndex<0 || getIndex>=size){
                      System.out.println("Invalid index!");
                  } 
                  else{
                      System.out.println("Value at index "+getIndex+"= "+books[getIndex]);
                  }
                  break;
                  
			  case 9:
                  System.out.print("Enter index: ");
                  int updateIndex=sc.nextInt();

                  if(updateIndex <0 || updateIndex >=size){
                      System.out.println("Invalid index!");
                  } 
                  else {
                      System.out.print("Enter new book ID: ");
                      int newValue=sc.nextInt();
                      books[updateIndex]=newValue;
                      System.out.println("Value updated successfully.");
                  }
                  break;
			  case 10:
                  System.out.println("Current number of elements: "+size);
                  break;
			  case 11:
                  System.out.println("exit successfully!");
                  break;
                  
                  default:
                	  System.out.println("invalid choice");
   }
	}
		while(choice!=11);	
}
}