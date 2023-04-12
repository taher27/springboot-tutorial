package com.example.first_project;

import java.util.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FirstProjectApplicationTests {

	ArrayList<String> obj = new ArrayList<String>();

	@Test
	void contextLoads() {
	}

	@Test
	public void testAdd() {
		obj.add("Emma");
		obj.add("Ronan");
		obj.add("Antonio");
		obj.add("Paul");
		System.out.println("Adding 4 student to list: ");
		assertEquals(4, obj.size());
	}

	@Test
	public void testSize() {
		obj.add("Emma");
		obj.add("Ronan");
		obj.add("Antonio");
		System.out.println("Checking size of List: ");
		assertEquals(3, obj.size());
	}

	@Test
	public void testRemove() {
		obj.add("Antonio");
		obj.add("Paul");
		obj.remove("Paul");
		System.out.println("Removing 1 student from list: ");
		assertEquals(1, obj.size());
	}

	// @Test
	// public void removeAll() {
	// obj.removeAll();
	// }

}
