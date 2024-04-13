package school.com.School.restController;

import org.springframework.web.bind.annotation.*;
import school.com.School.entity.School;
import school.com.School.service.SchoolService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SchoolRestController {
    public SchoolService schoolService;

    public SchoolRestController(SchoolService theSchoolService){
        schoolService = theSchoolService;
    }

    @GetMapping("/schools")
    public List<School> findAll(){
        return schoolService.findAll();
    }

    @GetMapping("/schools/{schoolId}")
    public School getSchool(@PathVariable int schoolId){
        School school = schoolService.findById(schoolId);
        if(school== null) throw new RuntimeException("School not found "+ schoolId);
        return school;
    }

    @PostMapping("/schools")
    public School addSchool(@RequestBody School theSchool){
        theSchool.setId(0);
        return schoolService.save(theSchool);
    }
    @PutMapping("/schools")
    public School updateSchool(@RequestBody School theSchool){
        return schoolService.save(theSchool);
    }

    @DeleteMapping("/schools/{schoolId}")
    public String deleteSchool(@PathVariable int schoolId){
        School school = schoolService.findById(schoolId);
        if(school== null) throw new RuntimeException("School not found "+ schoolId);
        schoolService.deleteById(schoolId);

        return "School is deleted id - "+schoolId ;
    }

}
