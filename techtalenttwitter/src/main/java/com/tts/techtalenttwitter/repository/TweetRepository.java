package com.tts.techtalenttwitter.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tts.techtalenttwitter.model.Tweet;
import com.tts.techtalenttwitter.model.User;

@Repository
public interface TweetRepository extends CrudRepository<Tweet, Long> {
	List<Tweet> findAllByOrderByCreatedAtDesc();
	List<Tweet> findAllByUserOrderByCreatedAtDesc(User user);
	List<Tweet> findAllByUserInOrderByCreatedAtDesc(List<User> users);
	List<Tweet> findByTags_PhraseOrderByCreatedAtDesc(String phrase);
}