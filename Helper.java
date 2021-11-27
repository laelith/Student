package homework;

import java.io.File;
import java.util.Scanner;

public class Helper {

    public static LinkedList<Student> createStudent() throws Exception{
        File file = new File("D:\\Repository\\Java\\src\\homework\\students.txt");
        Scanner scanner = new Scanner(file);
        LinkedList<Student> mylinkedList = new LinkedList();
        while (scanner.hasNextLine()){
            int id = scanner.nextInt();
            String name = scanner.next();
            int mathGrade = scanner.nextInt();
            int dataStructureGrade = scanner.nextInt();
            Student student = new Student(id,name,mathGrade,dataStructureGrade);
            mylinkedList.addNode(student);
            Student.studentNumber+=Student.studentNumber;
        }
        return mylinkedList;
    }

}
