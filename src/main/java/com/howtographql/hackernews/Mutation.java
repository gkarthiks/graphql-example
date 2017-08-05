package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Mutation implements GraphQLRootResolver {
    
    private final LinkRepository linkRepository;

    public Mutation(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }
    
    public Link createLink(String url, String description,String linkName) {
        Link newLink = new Link(url, description, linkName);
        linkRepository.saveLink(newLink);
        return newLink;
    }
}