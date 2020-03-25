package github.com.rafaeldcfarias;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
public class Person {

	private String lastName;
	private String firstName;

}
