package semester3;
import java.util.Scanner;

public class Queue2DArray {
	String[][] patients = new String[1][5];

    int front = 0;
    int rear = -1;

    
    void addPatient(String name) {

        if (rear == patients[0].length - 1) {
            System.out.println("Patient queue is full.");
            return;
        }

        rear++;

        patients[0][rear] = name;

        System.out.println("Patient added: " + name);
    }

   
    void callPatient() {

        if (front > rear) {
            System.out.println("No patients are waiting.");
            return;
        }

        System.out.println("Calling patient: " + patients[0][front]);

        patients[0][front] = null;

        front++;
    }

   
    void nextPatient() {

        if (front > rear) {
            System.out.println("No patients are waiting.");
        } else {
            System.out.println("Next patient: " + patients[0][front]);
        }
    }

    
    void displayPatients() {

        if (front > rear) {
            System.out.println("No patients are waiting.");
            return;
        }

        System.out.println("\n===== WAITING PATIENTS =====");

        for (int i = front; i <= rear; i++) {

            System.out.println(patients[0][i]);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Queue2DArray hospital = new Queue2DArray();

        int choice;

        do {

            System.out.println("\n===== HOSPITAL PATIENT SYSTEM =====");
            System.out.println("1. Add Patient");
            System.out.println("2. Call Next Patient");
            System.out.println("3. View Next Patient");
            System.out.println("4. Display Waiting Patients");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            input.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter patient name: ");
                    String name = input.nextLine();

                    hospital.addPatient(name);

                    break;

                case 2:
                    hospital.callPatient();
                    break;

                case 3:
                    hospital.nextPatient();
                    break;

                case 4:
                    hospital.displayPatients();
                    break;

                case 5:
                    System.out.println("Hospital system closed.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        input.close();
    }
}
