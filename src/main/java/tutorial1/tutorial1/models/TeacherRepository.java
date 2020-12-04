package tutorial1.tutorial1.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class TeacherRepository {
    private static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
    
    private Unit unit;
    

    public static void populate(){
        Teacher t;
        t= new Teacher("Joao", 'M',LocalDate.parse("1980-5-21"));
     
        teachers.add(t);
    }

    public static ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public static Teacher getTeacher(int mecNumber) {
        for (Teacher teacher : teachers)
            if (teacher.getMecNumber() == mecNumber)
                return teacher;
        return null;
    }

    public static Unit getUnit(Unit unit) {
        for(Teacher teacher: teachers)
        {
            teacher.getUnits() = unit;
        
        
        }

            
       
       
    }

  //  public static addUnit(){


        
    


}

