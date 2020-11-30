package tutorial1.tutorial1.models;

public class EnrolmentTeacher {
    private Teacher teacher;
    private Unit unit;

    public EnrolmentTeacher(Teacher teacher,Unit unit){
        this.setTeacher(teacher);
        this.setUnit(unit);

    }

    public Unit getUnit(){return unit;}
    public void setUnit(Unit unit){this.unit=unit;}

    public Teacher getTeacher(){return teacher;}
    public void setTeacher(Teacher teacher){this.teacher=teacher;}

}
