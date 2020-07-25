package co.gurung.gurungSpringJavaBrains.services;

import co.gurung.gurungSpringJavaBrains.models.Course;
import co.gurung.gurungSpringJavaBrains.models.Course;
import co.gurung.gurungSpringJavaBrains.repositories.topicRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses() {
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll()
                .forEach(courses::add);
        return courses;
    }

    public Course getCourse(String id) {
        return courseRepository.findById(id).get();
    }

    public void addCourse(Course topic) {
        courseRepository.save(topic);
    }

    public void upDateCourse(Course topic, String id) {
        courseRepository.save(topic);
    }

    public void deleteCourse(String id) {
        courseRepository.deleteById(id);
    }
}
