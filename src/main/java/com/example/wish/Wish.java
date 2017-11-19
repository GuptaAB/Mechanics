package com.example.wish;



public class Wish {
	
	
	private Integer customer_id;
	
	private String locality;
	
	private String[] tags;
	
	private final String CUSTOMER_ID_CONSTANT="_id";
	
	private final String LOCALITY_CONSTANT="locality";
	
	private final String TAG_CONSTANT="tag";
	
	public Wish() {}	
	

	public Integer getCustomer_id() {
		return customer_id;
	}

	public Wish setCustomer_id(Integer customer_id) {
		this.customer_id = customer_id;
		return this;
	}

	public String[] getTags() {
		return tags;
	}

	public Wish setTags(String[] tags) {
		this.tags = tags;
		return this;
	}

	public String getLocality() {
		return locality;
	}

	public Wish setLocality(String locality) {
		this.locality = locality;
		return this;
	}
	
public org.bson.Document getWishDocument() 
{
	org.bson.Document doc=new org.bson.Document(CUSTOMER_ID_CONSTANT,customer_id.toString());
	doc.append(LOCALITY_CONSTANT,locality);
	for(int i=1;i<=tags.length;i++)
	{
		doc.append(TAG_CONSTANT+i,tags[i-1]);
	}
	return doc;
}
	
}
