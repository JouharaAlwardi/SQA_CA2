package jouhara;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class ObjectTesting {

	RubricController rubricController = new RubricController();

	@Test
	void test() {
		ArrayList<Criterion> c1 = new ArrayList<>();
		ArrayList<StudentGrade> g2 = new ArrayList<>();

		// Sample Date for first student in the "Exam" rubric
		String rubricName = "Exam";
		String[] criterionName = { "Design", "Planing", "Implementation", "Testing", "Software Component",
				"Documentation" };
		Student student = new Student("Jouhara Alwardi");
		Grade[] grades = { new Grade(3), new Grade(2), new Grade(2), new Grade(4), new Grade(4), new Grade(4) };
		Grade[] grades2 = { new Grade(3), new Grade(1), new Grade(2), new Grade(3), new Grade(2), new Grade(1), };

		// Sample Date for another student in a different rubric
		String[] criterionNam = { "Design", "Testing", "Implementation", "Planing", "Software Component",
				"Documentation", "Extra", "More", "new", "h" };
		Student student1 = new Student("Alan Brown");
		Grade[] grades1 = { new Grade(3), new Grade(2), new Grade(2), new Grade(4), new Grade(4), new Grade(4),
				new Grade(5), new Grade(5), new Grade(5), new Grade(3) };

		c1 = rubricController.addCriterion(criterionName);
		// Test Criterion Name
		assertEquals("Planing", c1.get(1).getCriterionName());
		StudentGrade studentGrade1 = rubricController.createStudentGrade(grades, student);
		g2.add(studentGrade1);
		// Test Student Name in a Student Grade List (A list with all students and their
		// list of grades in a rubric)
		assertEquals("Jouhara Alwardi", g2.get(0).getStudent().getStudentName());
		StudentGrade studentGrade2 = rubricController.createStudentGrade(grades2, student);
		g2.add(studentGrade2);
		StudentGrade studentGrade3 = rubricController.createStudentGrade(grades, student);
		g2.add(studentGrade3);
		rubricController.createRubric(rubricName, c1, g2);

		g2 = new ArrayList<>();
		c1 = rubricController.addCriterion(criterionNam);
		StudentGrade studentGrade4 = rubricController.createStudentGrade(grades1, student1);
		g2.add(studentGrade4);
		rubricController.createRubric("New Exam", c1, g2);
		// Test a particular grade in a particular rubric
		assertEquals(2, g2.get(0).getStudentGrade().get(2).getScore());

		rubricController.getAllRubrics();

	}

}
