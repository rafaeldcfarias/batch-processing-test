package github.com.rafaeldcfarias;

import java.io.Serializable;

import org.springframework.batch.item.ItemProcessor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PersonItemProcessor implements ItemProcessor<Person, Person>, Serializable {

	private static final long serialVersionUID = 4281926948437872996L;

	@Override
	public Person process(Person person) throws Exception {
		final String firstNameInUppercase = person.getFirstName().toUpperCase();
		final String lastNameInUppercase = person.getLastName().toUpperCase();
		Person transformedPerson = new Person(firstNameInUppercase, lastNameInUppercase);
		log.info("Converting (" + person + ") into (" + transformedPerson + ")");
		return transformedPerson;
	}

}
