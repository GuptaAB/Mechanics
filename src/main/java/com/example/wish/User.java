package com.example.wish;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity  // This tells Hibernate to make a table out of this class
@Table(name = "user")
public class User {
	
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer customer_id;

    private String name;

    private Integer age;
    
    private String gender;
	    
    private String marital_status;
    
    private String working_status;
    

	public User() {}
    
	
    public Integer getAge() {
		return age;
	}

	public User setAge(Integer age) {
		this.age = age;
		return this;
	}

	public String getGender() {
		return gender;
	}

	public User setGender(String gender) {
		this.gender = gender;
		return this;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public User	 setMarital_status(String marital_status) {
		this.marital_status = marital_status;
		return this;
	}

	public String getWorking_status() {
		return working_status;
	}

	public User setWorking_status(String working_status) {
		this.working_status = working_status;
		return this;
	}


	public Integer getId() {
		return customer_id;
	}

	public User setId(Integer id) {
		this.customer_id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public User setName(String name) {
		this.name = name;
		return this;
	}



}

