package com.example.wish;

// It is the class contains all the setter and getters of the data which is to be extracted from JSONObject. 
public class Data {

    private String name;

    private Integer age;
    
    private String gender;
	    
    private String marital_status;
    
    private String working_status;
    
    private Object tags;
	
	private String locality;  
    
    public Data() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMarital_status() {
		return marital_status;
	}

	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}

	public String getWorking_status() {
		return working_status;
	}

	public void setWorking_status(String working_status) {
		this.working_status = working_status;
	}

	public Object getTags() {
		return tags;
	}

	public void setTags(Object tags) {
		this.tags = tags;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	
}
