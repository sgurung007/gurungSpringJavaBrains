package co.gurung.gurungSpringJavaBrains.repositories.topicRepository;

import co.gurung.gurungSpringJavaBrains.models.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic,String> {
}
