package goodSchool2;

import java.util.ArrayList;

public class Major {
	
	// 필
	String majorName;
	ArrayList<Subject> subjectArr = new ArrayList<>();
	
	// 생
	public Major(String majorName) {
		this.majorName = majorName;
	}
	
	// 메
	void addSubject(Subject subject) {
		this.subjectArr.add(subject);
	}
	
}
