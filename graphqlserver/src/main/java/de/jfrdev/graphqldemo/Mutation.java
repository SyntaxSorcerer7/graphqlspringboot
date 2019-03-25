package de.jfrdev.graphqldemo;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import de.jfrdev.graphqldemo.modle.Link;

public class Mutation implements GraphQLRootResolver {

    private LinkRepository linkRepository;

    public Mutation(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public Link createLink(String url, String description) {
        Link newLink = new Link(url, description, null);
        linkRepository.saveLink(newLink);
        return newLink;
    }

}
