package com.howtographql.hackernews;

import java.util.ArrayList;
import java.util.List;

public class LinkRepository {
    
    private List<Link> links;

    public LinkRepository() {
        links = new ArrayList<>();
        //add some links to start off with
        links.add(new Link("http://howtographql.com", "Your favorite GraphQL page", "First Link"));
        links.add(new Link("http://graphql.org/learn/", "The official docks", "Second Link"));
        links.add(new Link("http://graphql.org/learn/", "The official docks", "Third Link"));
    }

    public List<Link> getAllLinks() {
        return links;
    }
    
    public void saveLink(Link link) {
        links.add(link);
    }
}