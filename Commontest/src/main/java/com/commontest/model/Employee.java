package com.commontest.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.IndexColumn;

@Entity
@Table(name = "employee")
public class Employee  implements Serializable  {

	private static final long serialVersionUID = 1L;
	
	private String name;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id")
	private int id;
	@Column(name="experience")
	private  String experience;
	
	/*@OneToMany(fetch=FetchType.EAGER,mappedBy="employee",
			cascade=CascadeType.ALL)*/
	
	@OneToMany(cascade={CascadeType.ALL})
	@JoinColumn(name="employee_id")
	@IndexColumn(name="idx")
	private Set<Address> address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Set<Address> getAddress() {
		return address;
	}
	public void setAddress(Set<Address> address) {
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
 
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", experience=" + experience + ", address=" + address + "]";
	}
	 
	
}
