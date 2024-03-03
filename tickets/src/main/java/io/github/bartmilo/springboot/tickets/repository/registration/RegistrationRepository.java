package io.github.bartmilo.springboot.tickets.repository.registration;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.bartmilo.springboot.tickets.models.registration.Registration;

import java.util.Optional;

public interface RegistrationRepository extends MongoRepository<Registration, String> {

    Optional<Registration> findByTicketCode(String ticketCode);

    void deleteByTicketCode(String ticketCode);
}
