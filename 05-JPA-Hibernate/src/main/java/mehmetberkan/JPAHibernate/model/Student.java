package mehmetberkan.JPAHibernate.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	
	private String studentName;
	
	private LocalDate studentBirthDate;
	
	@Transient
	private int studentAge;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@ManyToMany
	@JoinTable(
			name = "student_lessons",
			joinColumns = @JoinColumn(name = "student_id"),
			inverseJoinColumns = @JoinColumn(name = "lesson_id")
			)
	private Set<Lesson> registeredLessons;

	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public LocalDate getStudentBirthDate() {
		return studentBirthDate;
	}

	public void setStudentBirthDate(LocalDate studentBirthDate) {
		this.studentBirthDate = studentBirthDate;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Set<Lesson> getRegisteredLessons() {
		return registeredLessons;
	}

	public void setRegisteredLessons(Set<Lesson> registeredLessons) {
		this.registeredLessons = registeredLessons;
	}
	
}
