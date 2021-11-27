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
                case 2:


                case 3:


                case 4:


                case 5:


                case 6:


                case 7:


                case 8:


                case 9:


            }

        }while(input!=-1);
        System.out.println("You have existed from the program.");
    }
}
