package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;

public class Mutation implements GraphQLRootResolver {
    
    private final LinkRepository linkRepository;

    public Mutation(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }
    
    public Link createLink(String url, String description,String linkName, String aliasName) {
        Link newLink = new Link(url, description, linkName, aliasName);
        linkRepository.saveLink(newLink);
        return newLink;
    }
}