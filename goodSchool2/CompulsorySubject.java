package goodSchool2;
// 필수 과목
public class CompulsorySubject extends Subject{

	public CompulsorySubject(String subjectName) {
		super(subjectName);
	}

	@Override
	char grading(int score) {
		char grade;
		if(score >= 95) {
			grade = 'S';
		} else if(score >= 90) {
			grade = 'A';
		} else if(score >= 80) {
			grade = 'B';
		} else if(score >= 70) {
			grade = 'C';
		} else if(score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}

}
