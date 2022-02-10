package com.cpmg.day8;

import java.util.*;

class Student {
	public Student(int rollno, int age, String name) {
		this.rollno = rollno;
		this.age = age;
		this.name = name;
	}

	public String toString() {
		return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + "]";
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	int rollno;
	int age;
	String name;
}

public class MySetApp {
	public static void main(String args[]) {
		List<Student> a = new ArrayList<Student>();
		Set<Student> b = new LinkedHashSet<Student>();
		Student s1 = new Student(1, 7687, "uygygiu");
		Student s2 = new Student(0, 4687, "disygiu");
		b.add(s1);
		b.add(s2);
		a.add(s1);
		a.add(s2);

		Scanner sc = new Scanner(System.in);
		int c = 0, d = 2;

		while (true) {
			System.out.println("Press 1 for insert");
			System.out.println("Press 2 for delete");
			System.out.println("Press 3 for update");
			System.out.println("Press 4 for sort ASC");
			System.out.println("Press 5 for sort DESC");
			System.out.println("Press 6 for print size");
			System.out.println("Press 7 for exit");
			c = sc.nextInt();

			if (c == 1) {
				System.out.println("Enter age,name to insert");
				a.add(new Student(d, sc.nextInt(), sc.next()));
				d++;
			}
			if (c == 2) {
				a.forEach(System.out::println);
				System.out.println("Enter row to delete");
				a.remove(sc.nextInt());
				a.forEach(System.out::println);
			}
			if (c == 3) {
				a.forEach(System.out::println);
				System.out.println("Enter row to update");
				a.remove(sc.nextInt());
				System.out.println("Enter rollno,age,name to update");
				a.add(new Student(sc.nextInt(), sc.nextInt(), sc.next()));
				a.forEach(System.out::println);
			}
			if (c == 4) {
				Collections.sort(a, new SortById());
				a.forEach(System.out::println);
			}
			if (c == 5) {
				Collections.sort(a, new Reverse());
				a.forEach(System.out::println);
			}
			if (c == 6) {
				System.out.println(a.size());

			}
			if (c == 7) {
				break;
			}

		}

	}
}
