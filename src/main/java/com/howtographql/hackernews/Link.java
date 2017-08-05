package com.howtographql.hackernews;
public class Link implements LinkInterface, SecondInterface {
    
    private String id; //the new field
    private String url;
    private String description;
    private String linkName;
    private String aliasName;

    public Link(String url, String description, String linkName, String aliasName) {
        this(null, url, description, linkName, aliasName);
    }
    
    private Link(String id, String url, String description, String linkName, String aliasName) {
        this.id = id;
        this.url = url;
        this.description = description;
        this.linkName = linkName;
        this.aliasName = aliasName;
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

	@Override
	public String getAliasName() {
		return aliasName;
	}
    
}