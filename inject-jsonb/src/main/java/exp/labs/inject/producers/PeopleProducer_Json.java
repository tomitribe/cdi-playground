package exp.labs.inject.producers;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;

import exp.labs.inject.annotations.ApacheJohnzon;
import exp.labs.inject.annotations.JsonSource;
import exp.labs.inject.annotations.People;
import exp.labs.inject.beans.Person;

public class PeopleProducer_Json {
	
	@Inject
	@ApacheJohnzon
	private javax.json.bind.Jsonb jsonb;
	
	private final String INPUT_FILE_NAME = "MOCK_DATA.json";
	private final String OUTPUT_FILE_NAME = "MY_DATA.json";
	private final String ENCODING = "UTF-8";

	@Produces
	@People @JsonSource
	public List<Person> jsonPeople() {
		
		List<Person> persons = null;
		// Create a print writer for the file MY_DATA.json
		try (PrintWriter writer = new PrintWriter(OUTPUT_FILE_NAME, ENCODING)) {

			// Read the JSON file into a java.lang.String
			String data = new String(Files.readAllBytes(Paths.get(INPUT_FILE_NAME)));

			// Convert a java.lang.String of JSON data into an List of Person type
			persons = jsonb.fromJson(data, new ArrayList<Person>() {
			}.getClass().getGenericSuperclass());
		
		}catch(Exception e) {System.out.println(e.getStackTrace());}
		
		return persons;
		
	}

}
