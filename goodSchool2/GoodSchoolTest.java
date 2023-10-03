package goodSchool2;
// git테스트
// git테스트3
public class GoodSchoolTest {

	public static void main(String[] args) {
		
		// 전공
		Major korean = new Major("국어국문학과");
		Major computerScience = new Major("컴퓨터공학과");
		
		// 과목(필수과목, 일반과목 분리)
		Subject kor1 = new GeneralSubject("국어");
		Subject kor2 = new CompulsorySubject("국어");
		Subject math1 = new GeneralSubject("수학");
		Subject math2 = new CompulsorySubject("수학");
		
		// 전공 별 과목 추가 
		korean.addSubject(kor2);
		korean.addSubject(math1);
		computerScience.addSubject(math2);
		computerScience.addSubject(kor1);
		
		// 학생 객체 생성, 과목별 점수 추가
		Student ahn = new Student("안성원", 181213, korean);
		ahn.addSubjectScore("국어", 56);
		ahn.addSubjectScore("수학", 95);

		Student oh = new Student("오태훈", 182330, computerScience);
		oh.addSubjectScore("국어", 98);
		oh.addSubjectScore("수학", 95);
		
		Student lee = new Student("이동호", 171518, korean);
		lee.addSubjectScore("국어", 88);
		lee.addSubjectScore("수학", 100);

		Student cho = new Student("조성욱", 172350, korean);
		cho.addSubjectScore("국어", 95);
		cho.addSubjectScore("수학", 89);

		Student choi = new Student("최태평", 171290, computerScience);
		choi.addSubjectScore("국어", 56);
		choi.addSubjectScore("수학", 83);
		
		Student stuArr[] = {ahn, oh, lee, cho, choi}; 
		
		System.out.println("--------------------------------");
		System.out.println("국어 수강생 학점");
		System.out.println("이름  |  학번  |  중점과목  |  점수");
		System.out.println("--------------------------------");
		
		// 중점과목 도출
		for(Student student : stuArr) {
			for(Subject subject : student.studentMajor.subjectArr) {
				if(subject instanceof CompulsorySubject) {
					System.out.println();
				}
			}
		}
		
		System.out.printf("%s  |  %d  |  ");
		
	}

}
