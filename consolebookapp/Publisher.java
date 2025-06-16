package com.talibelahi.consolebookapp;

import java.util.Objects;

public class Publisher {

    private int id;
    private String publisherName;

    public Publisher() {
    }

    public Publisher(int publisher, String publisherName) {
        this.id = publisher;
        this.publisherName = publisherName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    @Override
    public String toString() {
        return "Publisher{" + "publisher=" + id + ", publisherName=" + publisherName + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, publisherName);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Publisher other = (Publisher) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.publisherName, other.publisherName);
    }

}
