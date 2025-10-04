package HomeWork14.methodic;

public class Student {
    String name;
    int group;
    int course;
    int averageMarks;

    Student(String name, int group, int course, int averageMarks) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.averageMarks = averageMarks;
    }

    public int getCourse() {
        return course;
    }

    public int getAverageMarks() {
        return averageMarks;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "{" + name + ": group " + group +
                ", course: " + course +
                ", averageMarks: " + averageMarks + "}";
    }
}
