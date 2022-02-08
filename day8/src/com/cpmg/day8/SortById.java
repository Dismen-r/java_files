package com.cpmg.day8;
import java.util.Comparator;
public class SortById implements Comparator<Student> {

	@Override
	public int compare(Student e1, Student e2) {
		// TODO Auto-generated method stub
		if (e1.getRollno() > e2.getRollno()) {
			return 1;

		} else if (e1.getRollno() < e2.getRollno()) {
			return -1;

		} else {
			return 0;
		}

	}

}
