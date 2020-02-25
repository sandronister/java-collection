package br.com.sandroni.exercises;

import java.util.ArrayList;
import java.util.Collections;

public class ListTesting {
	
	public static void main(String[] args) {
		String task1 = "Init a JDK";
		String task2 = "Understanding JAVA";
		String task3 = "Java Objects";
		
		ArrayList<String> listTask = new ArrayList<>();
		
		listTask.add(task1);
		listTask.add(task2);
		listTask.add(task3);
		
		System.out.println(listTask);
		
		Collections.sort(listTask);
		
		listTask.forEach(task ->{
			System.out.println("Task");
			System.out.println(task);
		});
	}

}
