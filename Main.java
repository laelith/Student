package homework;


public class Main {
    public static void main(String[] args) throws Exception {
        LinkedList myLinkedList = Helper.createStudent();
        //MENU
        System.out.println("1- Display the linked list content.\n" +
                "2- Display the students sorted by their overall average. For this problem, use compareTo method of Student class you have written.\n" +
                "3- Display the student names sorted by their data structure grades.\n" +
                "4- Find and display the math average.\n" +
                "5- Find and display the student(s) who has the lowest Data Structures grade.\n" +
                "6- Delete the student whose id is entered by the user.\n" +
                "7- insert a new student to the list by getting the info from the user. \n" +
                "8- Find and display the student count.\n" +
                "9- Students pass the class if their grade is above the average for each course.\n" +
                "10 - Find and display the successful students for each course.");

        myLinkedList.display();
    }
}
