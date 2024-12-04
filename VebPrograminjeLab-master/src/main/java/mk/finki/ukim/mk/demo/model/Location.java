package mk.finki.ukim.mk.demo.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String capacity;
    private String description;
    @OneToMany(mappedBy = "location")
    List<Event> eventList;

    public Location(Long id, String name, String address, String capacity, String description) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.description = description;
        eventList = new ArrayList<>();
    }

    public Location() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCapacity() {
        return capacity;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}



/*
INSERT INTO LOCATION (name, address,  capacity, description)
values
('221B Baker Street, London, UK', 150, 'Historical venue for meetings', 'Sherlock Hall'),
('1600 Pennsylvania Avenue NW, Washington, DC, USA', 300, 'Large hall for official events', 'White House Hall'),
('1 Rue de Rivoli, Paris, France', 250, 'Modern conference room', 'Louvre Hall'),
('4 Chome-2-8 Shibakoen, Minato City, Tokyo, Japan', 400, 'Spacious venue for cultural events', 'Tokyo Tower Hall'),
('Sydney Opera House, Bennelong Point, Sydney, Australia', 500, 'Iconic space for performances', 'Opera Hall');
* */