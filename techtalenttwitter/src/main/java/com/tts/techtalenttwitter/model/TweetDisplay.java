package com.tts.techtalenttwitter.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//This holds the form of a tweet for display, the main
//difference between this and Tweet.java is that the "date"
//is a String.
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TweetDisplay {
	private User user;
	private String message;
	private List<Tag> tags;
	private String date;
}