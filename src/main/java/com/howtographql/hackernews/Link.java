package com.howtographql.hackernews;
public class Link implements LinkInterface {
    
    private String id; //the new field
    private String url;
    private String description;
    private String linkName;

    public Link(String url, String description, String linkName) {
        this(null, url, description, linkName);
    }
    
    private Link(String id, String url, String description, String linkName) {
        this.id = id;
        this.url = url;
        this.description = description;
        this.linkName = linkName;
    }
    

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

	@Override
	public String getLinkName() {
		return linkName;
	}
    
}