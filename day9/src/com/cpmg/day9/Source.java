package com.cpmg.day9;

import java.util.*;

class Doctor implements Comparable<Doctor> {

	@Override
	public String toString() {
		return "Doctor [name=" + name + ", speciality=" + speciality + ", experience=" + experience + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpeciality() {
		return speciality;
	}

	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	private String name;

	private String speciality;

	private int experience;

	public Doctor(String name, String speciality, int experience) {
		this.name = name;

		this.speciality = speciality;

		this.experience = experience;
	}

	@Override
	public int compareTo(Doctor o) {

		// TODO Auto-generated method stub
		if (!this.speciality.equals(o.getSpeciality())) {
			return this.speciality.compareTo(o.getSpeciality());
		}
		return this.experience - o.getExperience();

	}
}

class DoctorService {

	// DONT MODIFY THIS

	private List<Doctor> doctorsRepository;

	// DONT MODIFY THIS

	public DoctorService(List<Doctor> doctorsRepository) {
		this.doctorsRepository = doctorsRepository;
	}

	public List<Doctor> getExperiencedDoctors(int a) {
		List<Doctor> d = new ArrayList<Doctor>();
		for (int i = 0; i < doctorsRepository.size(); i++) {
			if (doctorsRepository.get(i).getExperience() >= a) {
				d.add(doctorsRepository.get(i));
			}
		}
		Collections.sort(d);
		return d;
	}

	public List<Doctor> getSpecialityDoctors(String a) {

		List<Doctor> d = new ArrayList<Doctor>();
		for (int i = 0; i < doctorsRepository.size(); i++) {
			if (doctorsRepository.get(i).getSpeciality().equals(a)) {
				d.add(doctorsRepository.get(i));
			}
		}
		return d;

	}
	// CODE HERE
}

public class Source {
	private static String doctorsData;

	// DON'T MODIFY THIS

	static {

		StringBuilder doctors = new StringBuilder();
		doctors.append("Amy-Pediatrics-16;");
		doctors.append("John-Dermatology-10;");
		doctors.append("David-Dermatology-15;");
		doctors.append("Bob-Pediatrics-6;");
		doctors.append("Cathy-Dermatology-5;");
		doctors.append("Mavis-Pediatrics-11;");
		doctors.append("Robin-Pediatrics-7;");
		doctors.append("Minty-Dermatology-9;");
		doctors.append("Jim-Cardiology-25;");
		doctorsData = doctors.toString();
	}

	public static void main(String[] args) {
		// CODE HERE
		Scanner s = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(doctorsData, ";");
		int n = st.countTokens();
		List<Doctor> d = new ArrayList<Doctor>();

		while (st.hasMoreTokens()) {
			String str = st.nextToken();
			StringTokenizer rt = new StringTokenizer(str, "-");
			String a = rt.nextToken();
			String b = rt.nextToken();
			int c = Integer.valueOf(rt.nextToken());
			d.add(new Doctor(a, b, c));
		}
		DoctorService ds = new DoctorService(d);
		int e = s.nextInt();
		if (e == 1) {
			List<Doctor> dl = ds.getExperiencedDoctors(s.nextInt());

			for (int i = 0; i < dl.size(); i++)
				System.out.println(dl.get(i));
		} else if (e == 2) {
			List<Doctor> dl = ds.getSpecialityDoctors(s.next());

			for (int i = 0; i < dl.size(); i++)
				System.out.println(dl.get(i));
		} else {
			System.out.println("Invalin input");
		}
	}
}
