package br.com.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import br.com.spring.model.Person;

//Permite que o Spring faça a injeção desta classe - @Autowired
@Service
public class PersonService {

	// -- Sempre vai gerar um id novo
	private final AtomicLong counter = new AtomicLong();

	public Person create(Person person) {

		return person;
	}

	public Person update(String id, Person person) {

		person.setId(Long.parseLong(id));
		return person;
	}
	
	public void delete(String id) {
	
	}

	public Person findById(String id) {

		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Diego");
		person.setLastName("Ferreira");
		person.setAddress("São Paulo - SP");
		person.setGender("Male");
		return person;
	}

	public List<Person> findAll() {

		List<Person> persons = new ArrayList<Person>();

		for (int i = 0; i < 8; i++) {

			Person person = mockPerson(i);
			persons.add(person);
		}

		return persons;
	}

	private Person mockPerson(int i) {

		Person person = new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("First Name " + i);
		person.setLastName("Last Name" + i);
		person.setAddress("Some Address Brazil" + i);
		person.setGender("Gender");
		return person;
	}

}
