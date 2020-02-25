package br.com.sandroni.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.sandroni.models.Lesson;

public class ListLessons {

	public static void main(String[] args) {

		Lesson l1 = new Lesson("Consumindo API com Node",90);
		Lesson l2 = new Lesson("Roteando para WebSocket",20);
		Lesson l3 = new Lesson("Aprendendo sobre servidor",50);
		
		ArrayList<Lesson> listLessons = new ArrayList<>();
		listLessons.add(l1);
		listLessons.add(l2);
		listLessons.add(l3);
		
		System.out.println(listLessons);
		
		Collections.sort(listLessons);
		
		System.out.println(listLessons);
		
		listLessons.sort(Comparator.comparing(Lesson::getTime));
		
		System.out.println(listLessons);
	}

}
