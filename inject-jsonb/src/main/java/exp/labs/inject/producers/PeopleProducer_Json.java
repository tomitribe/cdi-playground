/**
Licensed to the Apache Software Foundation (ASF) under one or more
contributor license agreements.  See the NOTICE file distributed with
this work for additional information regarding copyright ownership.
The ASF licenses this file to You under the Apache License, Version 2.0
(the "License"); you may not use this file except in compliance with
the License.  You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

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
