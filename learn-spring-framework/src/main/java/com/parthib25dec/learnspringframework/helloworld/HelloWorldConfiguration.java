package com.parthib25dec.learnspringframework.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person (String name, int age, Address address) {};
record Address (String Adl1, String City) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Lucy";
	}
	
	@Bean
	public int age() {
		return 22;
	}
	
	@Bean
	public Person person() {
		return new Person("Parthib",22, new Address("Kolkata","700001"));
	}
	
	@Bean
	@Primary
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	@Bean
	public Person person4Qualifier(String name, int age,Address address3) {
		return new Person(name,age,address3);
	}
	@Bean
	public Person person3Parameters(String name, int age, @Qualifier("newaddress")Address address) {
		return new Person(name,age,address);
	}
	@Bean(name = "address2")
	@Qualifier("newaddress")
	public Address address() {
		return new Address("Ward No - 01", "Arambagh");
	}
	
	@Bean
	@Primary
	public Address address3() {
		return new Address("Malir Bagan", "Uttarpara");
	}
}
