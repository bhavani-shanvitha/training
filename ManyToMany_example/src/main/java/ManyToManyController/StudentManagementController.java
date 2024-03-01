package ManyToManyController;
import java.util.Arrays;
import java.util.List;
import javax.persistence.*;

import ManyToManyEntity.Student;
import ManyToManyEntity.Subject;
import ManyToManyEntityDao.SubjectDao;
import ManyToManyEntityDao.StudentDao;
public class StudentManagementController {
	public static void main(String[] args) {
		List<Subject> subjects=readSubjectInfo();
		List<Student> students=readStudentInfo(subjects);
		//save subject
//		SubjectDao subjectDao=new SubjectDao();
//		for(Subject subject:subjects) {
//			subjectDao.saveSubject(subject);
//		}
		
		//save student
		StudentDao studentDao=new StudentDao();
		for(Student student:students) {
			studentDao.saveStudent(student);
		}
	}

	public static List<Subject> readSubjectInfo() {
		Subject subject1=new Subject();
		subject1.setId(101);
		subject1.setName("english");
		subject1.setNumberOfclass(200);
		
		Subject subject2=new Subject();
		subject2.setId(102);
		subject2.setName("math");
		subject2.setNumberOfclass(300);
		
		Subject subject3=new Subject();
		subject3.setId(103);
		subject3.setName("science");
		subject3.setNumberOfclass(400);
		
		Subject subject4=new Subject();
		subject4.setId(104);
		subject4.setName("social");
		subject4.setNumberOfclass(500);
		return Arrays.asList(subject1,subject2,subject3,subject4);
	}

	public static List<Student> readStudentInfo(List<Subject> subjects) {
		Student student1=new Student();
		student1.setId(1003);
		student1.setName("geetha");
		student1.setEmail("geetha@abc");
		student1.setAge(21);
		student1.setMarks(35);
		student1.setSubjects(subjects);
		
		Student student2=new Student();
		student2.setId(1004);
		student2.setName("madhu");
		student2.setEmail("madhu@abc");
		student2.setAge(21);
		student2.setMarks(25);
		student2.setSubjects(subjects);
		return Arrays.asList(student1,student2);
	}
}
