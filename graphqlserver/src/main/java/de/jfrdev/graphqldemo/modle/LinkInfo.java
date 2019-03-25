package de.jfrdev.graphqldemo.modle;

import java.util.Date;

public class LinkInfo {

    private Date creationDate;
    private String creator;

    public LinkInfo(Date creationDate, String creator) {
        this.creationDate = creationDate;
        this.creator = creator;
    }

    public String getCreator() {
        return creator;
    }

    public Date getCreationDate() {
        return creationDate;
    }

}
