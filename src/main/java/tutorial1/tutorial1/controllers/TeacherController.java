package tutorial1.tutorial1.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class TeacherController {
    
    @GetMapping(path = "", produces= MediaType.APPLICATON_JSON_VALUE)
    public List<Person> getPersons(){
        logger.info("sending all persons")
    }

}
