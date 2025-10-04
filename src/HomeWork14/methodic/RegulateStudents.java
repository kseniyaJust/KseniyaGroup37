package HomeWork14.methodic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegulateStudents {
    ArrayList<Student> allStudentList;
    ArrayList<Student> passedStudent;

    RegulateStudents(Student... students) {
        allStudentList = new ArrayList<>();
        passedStudent = new ArrayList<>();

        allStudentList.addAll(Arrays.asList(students));
    }

    public void regulate() {
        ArrayList<Student> graduateStudents = new ArrayList<>();
        for (Student student : allStudentList) {
            if (student.getAverageMarks() < 3) {
                continue;
            }
            if (student.getCourse() < 4) {
                student.setCourse(student.getCourse() + 1);
                passedStudent.add(student);
            } else {
                graduateStudents.add(student);
            }
        }

        System.out.print("Those students graduated: ");
        for (Student graduate : graduateStudents) {
            System.out.println(graduate.toString());
        }
    }

    public void printStudents(int course) {
        for (Student student : passedStudent) {
            if (student.getCourse() == course)
                System.out.print(student.toString() + " ");
        }
        System.out.println();

    }

}
