package goodSchool2;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	
	// 필
	String studentName;
	int studentNumber;
	Major studentMajor;
	HashMap<String, Integer> subjectTaken = new HashMap<>();
	
	// 생
	public Student(String studentName, int studentNumber, Major studentMajor) {
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.studentMajor = studentMajor;
	}
	
	// 메
	void addSubjectScore(String subjectName, int score) {
		this.subjectTaken.put(subjectName, score);
	}
	
	char showGrade(String subject) {
		int score = this.subjectTaken.get(subject);
		for(Subject arr : this.studentMajor.subjectArr) {
			if(subject.equals(arr.subjectName)) {
				return arr.grading(score);
			}
		}
		return 0;
	}
	
	
	
}
