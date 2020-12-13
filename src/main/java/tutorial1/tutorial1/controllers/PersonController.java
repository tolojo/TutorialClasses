package tutorial1.tutorial1.controllers;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import tutorial1.tutorial1.models.Person;
import tutorial1.tutorial1.models.StudentRepository;
import tutorial1.tutorial1.models.TeacherRepository;

public class PersonController {
    private Logger logger = LoggerFactory.getLogger(PersonController.class);
   
    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
 public List<Person> getPersons() {
 logger.info("Sending all persons");
 ArrayList<Person> persons = new ArrayList<>();
 persons.addAll(StudentRepository.getStudents());
 persons.addAll(TeacherRepository.getTeachers());
 return persons;
 }


 @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
 public Person getReference(String reference) {
 logger.info("Given a reference, send that person");
 ArrayList<Person> persons = new ArrayList<>();
 persons.addAll(StudentRepository.getStudents());
 persons.addAll(TeacherRepository.getTeachers());
  Person person: persons; 
 if(reference==persons.getReference())

   return persons;

  
   
 
 
 }
 
}
