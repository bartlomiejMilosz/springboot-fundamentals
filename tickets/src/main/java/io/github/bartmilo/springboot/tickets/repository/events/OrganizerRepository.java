package io.github.bartmilo.springboot.tickets.repository.events;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.github.bartmilo.springboot.tickets.models.events.Organizer;

@Repository
public class OrganizerRepository {
    private final List<Organizer> organizers = List.of(
            new Organizer(101, "Globomantics", "Globomantics Technology Corporation"),
            new Organizer(102, "Carver Rock", "Carved Rock Sports Equipment"));

    public List<Organizer> findAll() {
        return organizers;
    }
}