package ru.kpdesign.socialbot.server.repository;

import org.springframework.data.repository.CrudRepository;
import ru.kpdesign.socialbot.server.entity.Person;

/**
 * @author Mirimas
 */
public interface PersonRepository extends CrudRepository<Person, Integer> {
}
