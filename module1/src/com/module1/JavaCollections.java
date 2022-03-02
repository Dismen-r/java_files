package com.module1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
class People{
	public enum Gender {male, female}
	
	private String name;
	private int age;
	private Gender gender;
	
	public int getAge() {
		return age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
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
	public People(String name, int age, Gender gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
	
	
}
class AgeComparator implements Comparator<People>{

	@Override
	public int compare(People o1, People o2) {
		// TODO Auto-generated method stub
		return o1.getAge()-o2.getAge();
	}

	
	
}


class PeopleImplementation{
	public Integer minimumAgeContainingE(Collection<People> peoples){
	
		List<People> e =peoples.stream().filter(x ->x.getName().contains("e")).collect(Collectors.toList());
		System.out.println(e);
		
		Optional<People> p=e.stream().min(new AgeComparator());		
		return p.get().getAge();
	}
	public Integer getAgeOfOldestMan(Collection<People> peoples){
		List<People> list = peoples.stream().filter(x->x.getGender().equals(People.Gender.male)).collect(Collectors.toList());
		System.out.println(list);
		Optional<People> p=list.stream().max(new AgeComparator());		
		return p.get().getAge();
	}
}
public class JavaCollections {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<People> peoples = Arrays.asList(new People("vivek",16,People.Gender.male),
				new People("kayle",23,People.Gender.female),
				new People("jermy",42,People.Gender.male),
				new People("ivan",69,People.Gender.male)
				
				);
		PeopleImplementation p = new PeopleImplementation();
		System.out.println(p.minimumAgeContainingE(peoples));
		System.out.println(p.getAgeOfOldestMan(peoples));
	}

}
