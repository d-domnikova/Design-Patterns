package edu.patterns.Behavioral.Observer;

import java.time.LocalDateTime;

public class CatastropheData {
    private CatastropheType type;
    private String location;
    private LocalDateTime dateTime;

    public CatastropheData(CatastropheType type, String location, LocalDateTime dateTime) {
        this.type = type;
        this.location = location;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Location: " + location + "\nType: " + type.name() + "\nData and Time: " + dateTime.toString();
    }
}
