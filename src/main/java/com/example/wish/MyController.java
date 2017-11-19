package com.example.wish;

//COntroller in which all the request from form will be handled.

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private MyService myService;
	
	
	@RequestMapping(method=RequestMethod.POST,value="/form.html")
	public void postDetails(@RequestBody Data data) throws Exception
	{
		//Saving user details in MySql
		User user=new User();
		user.setAge(data.getAge())
		.setGender(data.getGender())
		.setMarital_status(data.getMarital_status())
		.setWorking_status(data.getWorking_status())
		.setName(data.getName());
		myService.postDetailsToUser(user);
		
		//Extracting tags from JSONArray
		Object tagObject=data.getTags();
		String tagString=tagObject.toString();
		System.out.println(tagString);
		String[] tagArray;
		tagArray=tagString.split(", ");
		String[] t1=tagArray[0].split("");
		String[] t2=tagArray[(tagArray.length -1)].split("");
		tagArray[0]=t1[1];
		tagArray[(tagArray.length-1)]=t2[0];
		
		
		//Saving Wish details to NoSql
		Wish wish=new Wish();
		wish.setCustomer_id(user.getId())
		.setLocality(data.getLocality())
		.setTags(tagArray);
		Document wishDocument=wish.getWishDocument();
		myService.postDetailsToWish(wishDocument);
		
	  }
		
	
	
	
	
	}


