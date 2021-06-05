package mehmetberkan.JPAHibernate.model;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Lesson {
	
	@Id
	@Column(name = "student_id")
	private int id;
	
	private String name;
	
	private LocalDate registrationDate;
	
	@ManyToMany(mappedBy = "registeredLessons", fetch = FetchType.EAGER)   //EAGER -  Getir
	private Set<Student> students;										   //LAZY  -  Gerekli olduğu zaman getir

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}
}
