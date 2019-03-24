package de.jfrdev.graphqldemo;

import de.jfrdev.graphqldemo.modle.Link;
import de.jfrdev.graphqldemo.modle.LinkInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LinkRepository {

    private final List<Link> links;

    public LinkRepository() {
        links = new ArrayList<>();
        //add some links to start off with
        LinkInfo info = new LinkInfo(new Date(), "Bear");
        LinkInfo secondInfo = new LinkInfo(new Date(), "Mouse");
        links.add(new Link("http://howtographql.com", "Your favorite GraphQL page", info));
        links.add(new Link("http://graphql.org/learn/", "The official docks", secondInfo));
    }

    public List<Link> getAllLinks() {
        return links;
    }

    public void saveLink(Link link) {
        links.add(link);
    }
}