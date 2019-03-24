package de.jfrdev.graphqldemo;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import de.jfrdev.graphqldemo.modle.Link;

import java.util.List;

public class Query implements GraphQLRootResolver {
    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getAllLinks();
    }
}
