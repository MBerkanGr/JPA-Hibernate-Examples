package mehmetberkan.JPAHibernate.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Grades {
	@Id
	@Column(name = "student_id")
	private int id;
	
	private String lessonName;
	
	private LocalDate cretionDate;
	
	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLessonName() {
		return lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public LocalDate getCretionDate() {
		return cretionDate;
	}

	public void setCretionDate(LocalDate cretionDate) {
		this.cretionDate = cretionDate;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
