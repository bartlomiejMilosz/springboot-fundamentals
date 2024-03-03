package io.github.bartmilo.springboot.tickets.models.events;

public record Venue(
        int id,
        String name,
        String street,
        String city,
        String country) {
}
