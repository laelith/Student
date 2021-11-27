package homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList myLinkedList = Helper.createStudent();
        //MENU
        System.out.println("1- Display the linked list content.\n" +
                "2- Display the students sorted by their overall average.\n" +
                "3- Display the student names sorted by their data structure grades.\n" +
                "4- Find and display the math average.\n" +
                "5- Find and display the student(s) who has the lowest Data Structures grade.\n" +
                "6- Delete the student whose id is entered by the user.\n" +
                "7- insert a new student to the list by getting the info from the user. \n" +
                "8- Find and display the student count.\n" +
                "9- Find and display the successful students for each course.");

        Scanner sc= new Scanner(System.in);
        int input=0;
        do{
            System.out.println("Press -1 If you want to exist from the program." );
            System.out.print("Type the number that you want to see...: ");
            input = sc.nextInt();
            switch(input) {
                case 1:
                    myLinkedList.display();
                    break;
                case 2:
                    Helper.sortoverallAverage(myLinkedList);
                    myLinkedList.display();
                    break;
                case 3:
                    Helper.sortDSG(myLinkedList);
                    myLinkedList.display();
                    break;
                case 4:
                    System.out.println(Helper.mathAverage(myLinkedList));
                    break;
                case 5:
                    System.out.println("Data structure average is " + Helper.dataStructureAverage(myLinkedList));
                    System.out.println("The students which has the lowest data structure grade is " );
                    System.out.println(myLinkedList.findMin());
                    break;
                case 6:
                    System.out.print("Please enter an id..: ");
                    Scanner scanner= new Scanner(System.in);
                    int id=0;
                    id=sc.nextInt();
                    myLinkedList.deleteNode(id);
                    break;
                case 7:
                    System.out.println("Please enter id, name, and two grades (Math and Data structures respectively) in one line, please use one blank between informations.");
                    Helper.createAStudent(myLinkedList);
                    break;
                case 8:
                    System.out.println(Student.studentNumber);
                    break;
                case 9:
                    System.out.println("The students which are successfull in math");
                    System.out.println("Math average is.. : " + Helper.mathAverage(myLinkedList));
                    Helper.upperMathAverage(myLinkedList).display();

                    System.out.println("The students which are successfull in data structure");
                    System.out.println("Data Structure average is.. : " + Helper.dataStructureAverage(myLinkedList));
                    Helper.upperDataAverage(myLinkedList).display();
                    break;
            }

        }while(input!=-1);
        System.out.println("You have existed from the program.");
    }
}
