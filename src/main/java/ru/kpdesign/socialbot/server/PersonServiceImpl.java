package ru.kpdesign.socialbot.server;

import ru.kpdesign.socialbot.client.PersonService;
import ru.kpdesign.socialbot.server.entity.Person;
import ru.kpdesign.socialbot.server.repository.PersonRepository;
import ru.kpdesign.socialbot.server.service.AppContext;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import ru.kpdesign.socialbot.shared.PersonResp;

import java.util.ArrayList;
import java.util.List;

/**
 * The server side implementation of the RPC service.
 *
 * @author Mirimas
 */
public class PersonServiceImpl extends RemoteServiceServlet implements PersonService {

	private final PersonRepository persons = AppContext.getBean(PersonRepository.class);

	@Override
	public List<PersonResp> list() {
		List<PersonResp> people = new ArrayList<>();
		for (Person person : this.persons.findAll()) {
			people.add(new PersonResp(person.getId(), person.getUsername(), person.getBirthday()));
		}
		return people;
	}

	@Override
	public PersonResp save(PersonResp data) {
		Person person = new Person();
		person.setId(data.getId());
		person.setUsername(data.getUsername());
		person.setBirthday(data.getBirthday());
		this.persons.save(person);
		data.setId(person.getId());
		return data;
	}

	@Override
	public boolean delete(PersonResp person) {
		this.persons.deleteById(person.getId());
		return true;
	}
}
