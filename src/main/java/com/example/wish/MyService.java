package com.example.wish;

// This class will provide service to the controller to save the data into databases.
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;


@Service
public class MyService {
	
	private final String DATABASE_NAME = "wish_factory";
	private final String COLLECTION_NAME="wish";
	
	@Autowired
	private UserRepository userRepository;
	
	private MongoClient mongoClient;
	
	// Function for saving wish data in noSQL.
	public void postDetailsToWish(Document wishDocument)
	{
		mongoClient = new MongoClient();
		MongoDatabase wishDatabase =  mongoClient.getDatabase(DATABASE_NAME);
		com.mongodb.client.MongoCollection<Document> wishCollection = wishDatabase.getCollection(COLLECTION_NAME);
		wishCollection.insertOne(wishDocument);
	}
	
	// Function for saving user data into mySQL.
	public void postDetailsToUser(User user)
	{
		
		userRepository.save(user);	
	}
}
