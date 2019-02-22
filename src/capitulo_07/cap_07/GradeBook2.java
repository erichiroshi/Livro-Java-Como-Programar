package capitulo_07.cap_07;

public class GradeBook2 {

	private String courseName;
	private int[][] grades;

	public GradeBook2(String courseName, int[][] grades) {
		super();
		this.courseName = courseName;
		this.grades = grades;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public void processGrades() {

		outputGrades();

		System.out.printf("%n%s %d%n%s %d%n%n", "Lowest grade in the grade book is", getMinimum(),
				"Highest grade in the grade book is", getMaximum());

		outputBarChart();

	}

	private int getMinimum() {

		int lowGrade = grades[0][0];

		for (int[] StudentGrades : grades)
			for (int grade : StudentGrades) {
				if (grade < lowGrade)
					lowGrade = grade;
			}

		return lowGrade;
	}

	private int getMaximum() {

		int highGrade = grades[0][0];

		for (int[] studentGrade : grades)
			for (int grade : studentGrade)
				if (grade > highGrade)
					highGrade = grade;

		return highGrade;
	}

	private double getAverage(int[] setOfGrades) {

		int total = 0;

		for (int grade : setOfGrades)
			total += grade;

		return (double) total / setOfGrades.length;
	}

	private void outputBarChart() {

		System.out.println("Overall grade distribuition:");
		int[] frequency = new int[11];

		for (int[] studentGrades : grades)
			for (int grade : studentGrades)
				++frequency[grade / 10];

		for (int count = 0; count < frequency.length; count++) {
			if (count == 10)
				System.out.printf("%5d: ", 100);
			else
				System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);

			for (int stars = 0; stars < frequency[count]; stars++)
				System.out.print("*");

			System.out.println();
		}

	}

	private void outputGrades() {

		System.out.printf("The grades are:%n%n");
		System.out.printf("              ");

		for (int test = 0; test < grades[0].length; test++)
			System.out.printf("Test %d   ", test + 1);
		System.out.println("Average");

		for (int student = 0; student < grades.length; student++) {
			System.out.printf("Student %3d", student + 1);

			for (int test : grades[student])
				System.out.printf("%9d", test);

			double average = getAverage(grades[student]);
			System.out.printf("%10.2f%n", average);
		}

	}

}
