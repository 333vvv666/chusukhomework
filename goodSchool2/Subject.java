package goodSchool2;

public abstract class Subject {
	
	// 필
	String subjectName;
	
	// 생
	public Subject(String subjectName) {
		this.subjectName = subjectName;
	}
	
	// 메
	abstract char grading(int score);
}
