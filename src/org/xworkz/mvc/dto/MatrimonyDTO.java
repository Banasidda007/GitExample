package org.xworkz.mvc.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="matri_table")
public class MatrimonyDTO {
	
	@Id
	@GenericGenerator(name="abd", strategy="increment")
	@GeneratedValue(generator = "abd")
	@Column(name="m_id")
	private int id;
	@Column(name="m_name")
	private String name;
	@Column(name="m_DOB")
	private String DOB;
	@Column(name="m_gender")
	private String gender;
	@Column(name="m_status")
	private String status;
	@Column(name="m_occupation")
	private String Occupation;
	@Column(name="m_lookingFor")
	private String lookingFor;
	
	public MatrimonyDTO() {
		System.out.println("create \t"+this.getClass().getTypeName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String DOB) {
		this.DOB = DOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getOccupation() {
		return Occupation;
	}

	public void setOccupation(String occupation) {
		Occupation = occupation;
	}

	public String getLookingFor() {
		return lookingFor;
	}

	public void setLookingFor(String lookingFor) {
		this.lookingFor = lookingFor;
	}

	@Override
	public String toString() {
		return "MatrimonyDTO [name=" + name + ", dateOfBirth=" + DOB + ", gender=" + gender + ", status="
				+ status + ", Occupation=" + Occupation + ", lookingFor=" + lookingFor + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DOB == null) ? 0 : DOB.hashCode());
		result = prime * result + ((Occupation == null) ? 0 : Occupation.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((lookingFor == null) ? 0 : lookingFor.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MatrimonyDTO other = (MatrimonyDTO) obj;
		if (DOB == null) {
			if (other.DOB != null)
				return false;
		} else if (!DOB.equals(other.DOB))
			return false;
		if (Occupation == null) {
			if (other.Occupation != null)
				return false;
		} else if (!Occupation.equals(other.Occupation))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (lookingFor == null) {
			if (other.lookingFor != null)
				return false;
		} else if (!lookingFor.equals(other.lookingFor))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

}
