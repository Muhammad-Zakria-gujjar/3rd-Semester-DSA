package semester3;
import java.util.Scanner;

public class QueueCircular{
	String[] cars=new String[5];

    int front=-1;
    int rear=-1;
    void parkCar(String car){

        if((rear+1)%cars.length==front){

            System.out.println("Parking lot is full.");
            return;
        }

        if(front==-1){
            front=0;
            rear=0;
        }
        else{
            rear=(rear+1)%cars.length;
        }
        cars[rear]=car;
        System.out.println(car + " parked successfully.");
    }

    
    void removeCar(){

        if (front==-1){
            System.out.println("Parking lot is empty.");
            return;
        }
        System.out.println(cars[front] + " removed from parking.");
        cars[front]=null;

        if(front==rear){
            front=-1;
            rear=-1;
        } 
        else{
            front=(front+1)%cars.length;
        }
    }

    
    void firstCar(){

        if(front==-1){
            System.out.println("Parking lot is empty.");

        } 
        else{
            System.out.println("First parked car: " +cars[front]);
        }
        }

    
    void displayCars(){
        if (front==-1){
            System.out.println("Parking lot is empty.");
            return;
        }

        System.out.println("\n===== PARKED CARS =====");

        int i=front;

        while(true){
            System.out.println(cars[i]);
            if (i==rear){
                break;
            }

            i=(i+1)%cars.length;
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        QueueCircular parking = new QueueCircular();
        int choice;
        do {
            System.out.println("\n===== PARKING LOT SYSTEM =====");
            System.out.println("1. Park Car");
            System.out.println("2. Remove Car");
            System.out.println("3. View First Car");
            System.out.println("4. Display All Cars");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            input.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter car number: ");
                    String car = input.nextLine();
                    parking.parkCar(car);
                    break;

                case 2:
                    parking.removeCar();
                    break;

                case 3:
                    parking.firstCar();
                    break;

                case 4:
                    parking.displayCars();
                    break;

                case 5:
                    System.out.println("Parking system closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 5);

        input.close();
    }
}
