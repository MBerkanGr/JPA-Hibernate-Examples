package mehmetberkan.JPAHibernate.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity(name = "student")
@Table(name="students", schema="schema_1")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int studentId;
	
	@Column(nullable = false, length = 100, unique = false)
	private String studentName;
	
	private LocalDate studentBirthDate;
	
	@Transient
	private int studentAge;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	@OneToMany(mappedBy = "student")
	private Set<Grades> grades;

	
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

	public Set<Grades> getGrades() {
		return grades;
	}

	public void setGrades(Set<Grades> grades) {
		this.grades = grades;
	}
	
}