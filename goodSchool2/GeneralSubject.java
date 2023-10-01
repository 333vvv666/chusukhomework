package goodSchool2;
// 일반 과목
public class GeneralSubject extends Subject{

	public GeneralSubject(String subjectName) {
		super(subjectName);
	}

	@Override
	char grading(int score) {
		char grade;
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 55) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

}
