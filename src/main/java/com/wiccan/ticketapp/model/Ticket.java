package com.wiccan.ticketapp.model;

public class Ticket {
    public enum Level{LOW, MED, HIGH}
    public enum Status{OPEN, CLOSED};
    private Status status;
    private Level level;
    private String title;
    private int ID;
    private String description;


//Constructor
    public Ticket(String title, int ID, String description) {
        this.title = title;
        this.ID = ID;
        this.description = description;
        this.status = Status.OPEN;
        this.level = Level.MED;
    }

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


}
