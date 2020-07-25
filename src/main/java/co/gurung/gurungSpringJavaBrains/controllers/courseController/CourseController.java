package co.gurung.gurungSpringJavaBrains.controllers.courseController;

import co.gurung.gurungSpringJavaBrains.models.Course;
import co.gurung.gurungSpringJavaBrains.models.Topic;
import co.gurung.gurungSpringJavaBrains.repositories.topicRepository.CourseRepository;
import co.gurung.gurungSpringJavaBrains.services.CourseService;
import co.gurung.gurungSpringJavaBrains.services.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return  courseService.getAllCourses();
    }

    @RequestMapping("/courses/{id}")
    public Course getCourse(@PathVariable String id){
        return courseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/courses")
    public  void addCourse(@RequestBody Course course){
        courseService.addCourse(course);
    }


}

