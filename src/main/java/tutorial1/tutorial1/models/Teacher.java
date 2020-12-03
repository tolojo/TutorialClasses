package tutorial1.tutorial1.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Teacher extends Person {
    private static int nextNumber=1;
    private int mecNumber;
    private ArrayList<Unit> units;
    private ArrayList<EnrolmentTeacher> enrolments;


        public Teacher(String name, char gender, LocalDate birthDay){
            super(name, gender, birthDay);
            this.mecNumber = nextNumber;
            nextNumber++;
            units = new ArrayList<>();
        }

        public int getMecNumber(){return mecNumber;}
        public void setMecNumber(int mecNumber){this.mecNumber=mecNumber;}
        
        public String getName(){return name;} 
        public void setName(String name){this.name=name;}

        public char getGender(){return gender;}
        public void setGender(char gender){this.gender=gender;}

        public LocalDate getBirthDay(){return birthDay;}
        public void setBirthDay(LocalDate birthDay){this.birthDay= birthDay;}

        public ArrayList<Unit> getUnits(){return units;}
        public EnrolmentTeacher getEnrolmentByUnitId(int unitId){
            for (EnrolmentTeacher enr:enrolments)
            if (enr.getUnit().getId()==unitId)return enr;
        return null;
        }
        public ArrayList<EnrolmentTeacher> getEnrolmentTeacher(){
            return enrolments;
        }


        public void enrollTeacher(EnrolmentTeacher enrolment) {
                enrolments.add(enrolment);
                enrolment.getUnit().getEnrolmentsTeacher().add(enrolment);
            
            }


      
            @Override
       
            public String getReference(){return "T<"+mecNumber+">";}
    
    }




