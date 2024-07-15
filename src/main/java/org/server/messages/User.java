package org.server.messages;

import java.io.Serializable;


public class User implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public org.server.messages.Status getStatus() {
        return status;
    }

    public void setStatus(org.server.messages.Status status) {
        this.status = status;
    }

    String picture;
    org.server.messages.Status status;
}
