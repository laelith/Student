package homework;

import java.io.File;
import java.util.Scanner;

public class Helper<T extends Comparable> {

    public static LinkedList<Student> createStudent() throws Exception {
        File file = new File("D:\\Repository\\Java\\src\\homework\\students.txt");
        Scanner scanner = new Scanner(file);
        LinkedList<Student> mylinkedList = new LinkedList();
        while (scanner.hasNextLine()) {
            int id = scanner.nextInt();
            String name = scanner.next();
            int mathGrade = scanner.nextInt();
            int dataStructureGrade = scanner.nextInt();
            Student student = new Student(id, name, mathGrade, dataStructureGrade);
            mylinkedList.addNode(student);
        }
        return mylinkedList;
    }

    public static LinkedList<Student> createAStudent(LinkedList<Student> list) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        String name = scanner.next();
        int mathGrade = scanner.nextInt();
        int dataStructureGrade = scanner.nextInt();
        Student student = new Student(id, name, mathGrade, dataStructureGrade);
        list.addNode(student);
        return list;
    }

    //Sorts the linked list by overallAverage
    public static <T extends Student> void sortoverallAverage(LinkedList<T> list) {
        Node<T> currentNode = list.getHead();
        T temp;
        Node<T> nextNode = null;
        while (currentNode != null) {
            nextNode = currentNode.next;
            while (nextNode != null) {
                if (currentNode.value.findAverage() < (nextNode.value.findAverage())) {
                    temp = currentNode.value;
                    currentNode.value = nextNode.value;
                    nextNode.value = temp;
                }
                nextNode = nextNode.next;
            }
            currentNode = currentNode.next;
        }
    }

    //Sorts the linked list by data structure grade
    public static <T extends Student> void sortDSG(LinkedList<T> list) {
        Node<T> currentNode = list.getHead();
        T temp;
        Node<T> nextNode = null;
        while (currentNode != null) {
            nextNode = currentNode.next;
            while (nextNode != null) {
                if (currentNode.value.getDataStructureGrade() < (nextNode.value.getDataStructureGrade())) {
                    temp = currentNode.value;
                    currentNode.value = nextNode.value;
                    nextNode.value = temp;
                }
                nextNode = nextNode.next;
            }
            currentNode = currentNode.next;
        }
    }

    //Sorts the linked list by math grade
    public static <T extends Student> void sortMG(LinkedList<T> list) {
        Node<T> currentNode = list.getHead();
        T temp;
        Node<T> nextNode = null;
        while (currentNode != null) {
            nextNode = currentNode.next;
            while (nextNode != null) {
                if (currentNode.value.getMathGrade() < (nextNode.value.getMathGrade())) {
                    temp = currentNode.value;
                    currentNode.value = nextNode.value;
                    nextNode.value = temp;
                }
                nextNode = nextNode.next;
            }
            currentNode = currentNode.next;
        }
    }

    //Calculates Math Average of the Class
    public static <T extends Student> int mathAverage(LinkedList<T> list){
        int mathAverage=0;
        Node<T> iterator = list.getHead();
        while(iterator!=null){
            mathAverage=iterator.value.getMathGrade()+ mathAverage;
            iterator=iterator.next;
        }
        //list.count = the number of students.
        return mathAverage/list.count();
    }

    public static <T extends Student> LinkedList<Student> upperMathAverage(LinkedList<Student> list){
        LinkedList<Student> myll = new LinkedList();
        int mathAve = Helper.mathAverage(list);
        Node<Student> iterator = list.getHead();
        while(iterator!=null){
            if (iterator.value.getMathGrade()>mathAve){
                myll.addNode(iterator.value);
            }
            iterator=iterator.next;
        }
        return myll;
    }

    //Calculates Data Structure Average of the Class, The students which are under the average are shown.
    public static <T extends Student> int dataStructureAverage(LinkedList<T> list){
        int dataAverage=0;
        Node<T> iterator = list.getHead();
        while(iterator!=null){
            dataAverage=iterator.value.getDataStructureGrade()+ dataAverage;
            iterator=iterator.next;
        }
        //list.count = the number of students.
        return dataAverage/list.count();
    }

    public static <T extends Student> LinkedList<Student> upperDataAverage(LinkedList<Student> list){
        LinkedList<Student> myll = new LinkedList();
        int dataAve = Helper.dataStructureAverage(list);
        Node<Student> iterator = list.getHead();
        while(iterator!=null){
            if (iterator.value.getDataStructureGrade()>dataAve){
                myll.addNode(iterator.value);
            }
            iterator=iterator.next;
        }
        return myll;
    }
}
