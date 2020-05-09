package q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentBO {
	public ArrayList<Student> al;

	public StudentBO() {
		al = new ArrayList<Student>();
	}

	public void read() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter name, id & city");
		Student s = new Student(scn.next(), scn.nextInt(), scn.next());
		al.add(s);
	}

	public void display(Student s) {
		System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getCity());
	}

	public void alInCity(String city) {

		for (Student s : al) {
			if (s.getCity().equals(city))
				display(s);
		}
	}

	public void sortName() {
		Collections.sort(al, (a,b) -> {return a.getName().compareTo(b.getName());});
	}

	public void sortCity() {
		Collections.sort(al, (a,b) -> {return a.getCity().compareTo(b.getCity());});
	}

	public void searchById(int id) {
		try {
			Student res = null;

			for (Student s : al) {
				if (s.getId() == id) {
					res = s;
					break;
				}
			}
			System.out.println(res.getId() + "\t" + res.getName() + "\t" + res.getCity());
		} catch (Exception e) {
			System.out.println("Student Not Found");
			System.out.println(e);
		}
	}

}
