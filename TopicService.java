package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
private	List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic("Shubham" , "Priyanka" , "Forever"),
		new Topic("Java" , "Core java" , "Advance java"),
		new Topic("Spring" , "Spring Framework" , "Spring Framework Description")
		));


public List<Topic> getAllTopics()

{
	return topics;
}

public Topic getTopic(String id) {
	return topics.stream().filter(t -> t.getId().contentEquals(id)).findFirst().get();
}

public void addTopic(Topic topic) {
	topics.add(topic);
}

public void updateTopic(String id ,Topic topic) {
	for(int i=0 ; i<topics.size();i++) {
		Topic t = topics.get(i);
		if(t.getId().contentEquals(id)) {
			topics.set(i, topic);
			return;
		}
	}
	
}
// For calling the deleting method
public void deleteTopic(String id ,Topic topic) {
	for(int i=0 ; i<topics.size();i++) {
		Topic t = topics.get(i);
		if(t.getId().contentEquals(id)) {
			topics.set(i, topic);
			return;
		}
	}
	
}

}
