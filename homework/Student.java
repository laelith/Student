package homework;

import java.io.File;
import java.util.Scanner;

public class Student <T extends Comparable> {
    private int id;
    private String name;
    private int mathGrade;
    private int dataStructureGrade;
    static int studentNumber;

//
//    public float CalculateOverallAverage(){
//        float overallAverage = (mathGrade+dataStructureGrade)/studentNumber;
//        return overallAverage;
//    }

    public void createAStudent() throws Exception {
        File file = new File("D:\\Repository\\Java\\src\\homework\\students.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            int id = scanner.nextInt();
            String name = scanner.next();
            int mathGrade = scanner.nextInt();
            int dataStructureGrade = scanner.nextInt();
            Student student = new Student(id,name,mathGrade,dataStructureGrade);

            studentNumber+=studentNumber;
        }

    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public int getDataStructureGrade() {
        return dataStructureGrade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public void setDataStructureGrade(int dataStructureGrade) {
        this.dataStructureGrade = dataStructureGrade;
    }

    public Student(int id, String name, int mathGrade, int dataStructureGrade) {
        this.id = id;
        this.name = name;
        this.mathGrade = mathGrade;
        this.dataStructureGrade = dataStructureGrade;
    }
}
