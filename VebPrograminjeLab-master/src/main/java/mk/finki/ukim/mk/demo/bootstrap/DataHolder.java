package mk.finki.ukim.mk.demo.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.finki.ukim.mk.demo.model.Event;
import mk.finki.ukim.mk.demo.model.EventBooking;
import mk.finki.ukim.mk.demo.model.Location;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class DataHolder {
    public static List<Event> events = new ArrayList<>();
    public static List<Location> locations = new ArrayList<>();
    public static List<EventBooking> bookings = new ArrayList<>();
    @PostConstruct
    public void init(){
        for (int i = 0; i < 10; i++) {
            String eventName = "Event " + (i + 1);
            events.add(new Event(eventName, "Description for " + eventName, i * 10));
            locations.add(new Location(
                    (long) (Math.random() * 1000),
                    "Location Name " + (i + 1),
                    "City " + (i + 1),
                    "Country " + (i + 1),
                    "Area " + (i + 1)
            ));
            events.get(i).setLocation(locations.get(i));
        }
    }
}
