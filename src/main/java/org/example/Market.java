package org.example;

public class Market {
    private final int id;
    private final String name;
    private final int typeId;

    private final int eventId;

    public Market(int id, int eventId, String name, int typeId) {
        this.id = id;
        this.name = name;
        this.typeId = typeId;
        this.eventId = eventId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTypeId() {
        return typeId;
    }

    public int getEventId() {
        return eventId;
    }
}
