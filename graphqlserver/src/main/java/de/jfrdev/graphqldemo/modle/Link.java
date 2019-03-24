package de.jfrdev.graphqldemo.modle;

public class Link {
    private final String url;
    private final String description;
    private final LinkInfo linkInfo;

    public Link(String url, String description, LinkInfo info) {
        this.url = url;
        this.description = description;
        linkInfo = info;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }

    public LinkInfo getLinkInfo() {
        return linkInfo;
    }
}
