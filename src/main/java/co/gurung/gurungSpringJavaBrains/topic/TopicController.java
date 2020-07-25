package co.gurung.gurungSpringJavaBrains.topic;

import co.gurung.gurungSpringJavaBrains.topic.Topic;
import co.gurung.gurungSpringJavaBrains.topic.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;



    @RequestMapping("/topics")
    public List<Topic> getAllTopic() {
        return topicService.getAllTopic();
    }


    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){  //@PathVarible(@id)
        return topicService.getTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addTopic(@RequestBody Topic topic){
        topicService.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public  void upDateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.upDateTopic(topic,id);

    }

    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id){
        topicService.deleteTopic(id);
    }


}
