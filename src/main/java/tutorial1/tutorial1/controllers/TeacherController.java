package tutorial1.tutorial1.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tutorial1.tutorial1.models.Teacher;
import tutorial1.tutorial1.models.TeacherRepository;


@RequestMapping(path="/api/teachers")
public class TeacherController {
    private Logger logger = LoggerFactory.getLogger(TeacherController.class);

    @GetMapping(path = "", produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Teacher> getTeachers() {
        logger.info("Sending all teachers");
        return TeacherRepository.getTeachers();
     
    }

    @GetMapping(path = "{number}", produces= MediaType.APPLICATION_JSON_VALUE)
    public Teacher getTeacher(@PathVariable("number") int number)  {
        logger.info("Sending specific teacher");
        return TeacherRepository.getTeacher(number);
        
      
    }

}
