
public class StudentTest {

	public static void main(String[] args) {
		Student student1 = new Student ("Jane Green", 93.0);
		Student student2 = new Student ("John Blue", 55.0);
		
		System.out.printf("%s's lettergrade is: %s%n", student1.getName(), student1.getLetterGrade());
		System.out.printf("%s's lettergrade is: %s%n", student2.getName(), student2.getLetterGrade());
	}

}
