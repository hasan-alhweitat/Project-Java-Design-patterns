package dp.template_part_3;

import java.util.Date;
import java.util.List;
import university.InstructorStudent;
import university.Student;
import university.CourseStudent;

public class TextPrinter extends Printer {

	Date currentDate = new Date();

	protected String start(InstructorStudent instructorStudent, Student student) {
		return "Student Schedule:- \n Header: " + instructorStudent.getNameInstrStud() + ", " + instructorStudent.getSchool()
				+ ", " + student.getProgram() + ", " + currentDate + " \n";
	}

	@Override
	protected String formatOrderNumber(List<CourseStudent> studentcourses, Student student) {
		return "Content: " + studentcourses + "The GPA: " + student.getAverage() + "\n";
	}

	@Override
	protected String formatItems(Order order, Student student) {
		StringBuilder builder = new StringBuilder("Footer: The total credit hours=" + student.totalCredit());

		return builder.toString();
	}

	@Override
	protected String end() {
		return " ";
	}

}
