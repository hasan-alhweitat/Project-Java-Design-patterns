package dp.template_part_3;

import java.util.Date;
import java.util.List;
import university.InstructorStudent;
import university.Student;
import university.CourseStudent;

public class HTMLPrinter extends Printer {

	Date currentDate = new Date();

	@Override
	protected String start(InstructorStudent instructorStudent, Student student) {
		return "<html><head><title>Student Schedule:- </title></head><body><h1>Header:- " + instructorStudent.getNameInstrStud()
				+ " " + instructorStudent.getSchool() + " " + student.getProgram() + " " + currentDate + "</h1>";
	}

	@Override
	protected String formatOrderNumber(List<CourseStudent> studentcourses, Student student) {
		return "<br><h2>Content:- "+"<br>"+" "+"<br>" +studentcourses + "<br>"+"The GPA: " + student.getAverage() + "<br></h2>";
	}

	@Override
	protected String formatItems(Order order, Student student) {
		StringBuilder builder = new StringBuilder("<h3>Footer: The Total Credit Hours=" + student.totalCredit());

		builder.append("</h3>");
		return builder.toString();
	}

	@Override
	protected String end() {
		return "</body></html>";
	}

}
