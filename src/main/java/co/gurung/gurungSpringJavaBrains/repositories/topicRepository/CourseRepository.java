package co.gurung.gurungSpringJavaBrains.repositories.topicRepository;

import co.gurung.gurungSpringJavaBrains.models.Course;
import co.gurung.gurungSpringJavaBrains.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {
}
