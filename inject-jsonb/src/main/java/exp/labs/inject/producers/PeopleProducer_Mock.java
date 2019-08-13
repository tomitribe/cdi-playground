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

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;

import exp.labs.inject.annotations.JsonSource;
import exp.labs.inject.annotations.Moch;
import exp.labs.inject.annotations.People;
import exp.labs.inject.beans.Person;


public class PeopleProducer_Mock {
	
	@Produces
	@People @Moch
	public List<Person> mochPeople(){
		
		ArrayList<Person> list = new ArrayList<Person>();
		list.add(new Person(995,"Rogers","Kennewell","rkennewellrm@mail.ru","Male","123.2.139.173"));
		list.add(new Person(996,"Lishe","Skase","lskasern@1688.com","Female","249.220.23.185"));
		list.add(new Person(997,"Marion","Gaytor","mgaytorro@noaa.gov","Female","32.2.181.137"));
		list.add(new Person(998,"Effie","Flatt","eflattrp@reverbnation.com","Female","120.173.191.224"));
		list.add(new Person(999,"Addie","Pitceathly","apitceathlyrq@about.com","Female","197.39.73.185"));
		list.add(new Person(1000,"Deanna","Doag","ddoagrr@kickstarter.com","Female","172.168.171.192"));
		
		return list;

	}
}
