package mk.finki.ukim.lab.repository.jpa;

import mk.finki.ukim.lab.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event,Long> {
    List<Event> findAllByLocation_Id(Long locationId);
}
