package tutorial1.tutorial1.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class StudentRepository {
    
    private static ArrayList<Student> students = new ArrayList<Student>();
    public static void populate() {
    Student s; // auxiliary variable
    s = new Student("John", 'M', LocalDate.parse("2000-05-24"));
    s.setEmail("john@gmail.com");
    students.add(s);
    students.add(new Student("Mary", 'F', LocalDate.parse("1999-12-23")));
    s = new Student("James", 'M', LocalDate.parse("2001-07-02"));
    students.add(s);
    }

    public static ArrayList<Student> getStudents() {
    return students;
    }

    public static Student getStudent(int number) {
    for (Student student: students)
        if (student.getNumber() == number)
            return student;
    return null;
    }
    public static boolean deleteStudent(int number){
        return students.removeIf((s)-> s.getNumber()==number);
    }
    public static Student addStudent(Student student) {
        students.add(student);
        return student;
    }

        

   


}
