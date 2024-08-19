package dp.template_part_3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import university.InstructorStudent;
import university.Student;
import university.CourseStudent;

public abstract class Printer {

	protected abstract String start(InstructorStudent instructorStudent, Student student);

	protected abstract String formatOrderNumber(List<CourseStudent> studentcourse, Student student);

	protected abstract String formatItems(Order order, Student student);

	protected abstract String end();

	public final void printOrder(Order order, String fileName, InstructorStudent instructorStudent, Student student,
			List<CourseStudent> studentcourses) throws IOException {

		Writer fw = new FileWriter(fileName);
		fw.write(start(instructorStudent, student));
		fw.write(formatOrderNumber(studentcourses, student));
		fw.write(formatItems(order, student));
		fw.write(end());
		fw.close();
	}

}
