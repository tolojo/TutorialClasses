package tutorial1.tutorial1.models;

import java.util.ArrayList;

public class Unit {
  private int id;
  private String name;
  private int credits;
  private ArrayList<Student> students;
  private ArrayList<Enrolment> enrolments;
  public Unit(int id, String name, int credits){
this.id=id;
this.name=name;
this.credits=credits;
students=new ArrayList<Student>();   
enrolments = new ArrayList<Enrolment>(); 
  }
    
  public int getId(){ return id; }
  public String getName(){ return name;}
  public int getCredits(){ return credits;}
  public ArrayList<Student> getStudents(){ return students;}
  public ArrayList<Enrolment> getEnrolments(){return enrolments;}



}
