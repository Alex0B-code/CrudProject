package com.wiccan.ticketapp.model;

public class Ticket {
    public String getTitle() {
        return title;
    }

    // GETTERs and Setters

    public void setTitle(String title) {
        this.title = title;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private enum level {LOW, MED, HIGH };
    private String title;
    private int ID;
    private String description;
    private enum status{OPEN, CLOSE};

}
