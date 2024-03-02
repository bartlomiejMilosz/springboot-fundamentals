package io.github.bartmilo.springboot.tickets.registration;

public record Registration(
        Integer id,
        Integer productId,
        String ticketCode,
        String attendeeName) {
}
