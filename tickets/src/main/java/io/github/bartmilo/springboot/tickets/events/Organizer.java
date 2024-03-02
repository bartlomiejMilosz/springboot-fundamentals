package io.github.bartmilo.springboot.tickets.events;

public record Organizer(
        int id,
        String name,
        String description) {
}
