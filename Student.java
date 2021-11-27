package homework;

public class Student implements Comparable {
    private int id;
    private String name;
    private int mathGrade;
    private int dataStructureGrade;
    static int studentNumber;

    public float CalculateOverallAverage(){
        float overallAverage = (mathGrade+dataStructureGrade)/studentNumber;
        return overallAverage;
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

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString(){
        return id +" "+ name ;
    }
}
