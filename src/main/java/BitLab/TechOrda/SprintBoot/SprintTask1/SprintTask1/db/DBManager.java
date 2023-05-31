package BitLab.TechOrda.SprintBoot.SprintTask1.SprintTask1.db;

import BitLab.TechOrda.SprintBoot.SprintTask1.SprintTask1.Controller.Student;

import java.util.ArrayList;

public class DBManager {
    public static ArrayList<Student> getStudents(){
        return students;
    }
    private static Long id = 1L;
    private static final ArrayList<Student> students = new ArrayList<>();
    public static void addStudent(Student student){
        student.setId(id);

        if (student.getExam() < 50){
            student.setMark("F");
        }else if(student.getExam() < 60){
            student.setMark("D");
        }else if(student.getExam() < 75){
            student.setMark("C");
        }else if(student.getExam() < 90){
            student.setMark("B");
        }else {
            student.setMark("A");
        }

        id++;

        students.add(student);

    }

}
