package tutorial1.tutorial1.models;

import java.util.ArrayList;

public class TeacherRepository {
    private static ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        Unit unit;
        Teacher teacher;
    public static ArrayList<Teacher> getTeachers() {
        return teachers;
        }


    public static Teacher getTeacher(int mecNumber){
            for(Teacher teacher: teachers)
            if (teacher.getMecNumber() == mecNumber)
            return teacher;
    return null;
    }    
    public static Unit getUnit(Unit units){
        for (Teacher teacher: teachers)
        if(teacher.getUnits() == units)
        return units;

        return null;
    }

    public static addUnit(){


        
    }


}

