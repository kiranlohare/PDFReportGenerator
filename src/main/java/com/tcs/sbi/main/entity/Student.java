package com.tcs.sbi.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Integer id;
	@Column
	private String name;	
	@Column
	private String standard;
	@Column
	private Float marathi;
	@Column
	private Float hindi;
	@Column
	private Float english;
	@Column
	private Float socialScience;
	@Column
	private Float biology;
	@Column
	private Float maths;
	@Column
	private Float physics;
	@Column
	private Float chemistry;
	
	public void setMarathi(Float marathi) {
		this.marathi = marathi;
	}
	public void setHindi(Float hindi) {
		this.hindi = hindi;
	}
	public void setEnglish(Float english) {
		this.english = english;
	}
	public void setSocialScience(Float socialScience) {
		this.socialScience = socialScience;
	}
	public void setMaths(Float maths) {
		this.maths = maths;
	}
	public void setPhysics(Float physics) {
		this.physics = physics;
	}
	public void setChemistry(Float chemistry) {
		this.chemistry = chemistry;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	
	public float getMarathi() {
		return marathi;
	}
	public void setMarathi(float marathi) {
		this.marathi = marathi;
	}
	public float getHindi() {
		return hindi;
	}
	public void setHindi(float hindi) {
		this.hindi = hindi;
	}
	public float getEnglish() {
		return english;
	}
	public void setEnglish(float english) {
		this.english = english;
	}
	public float getSocialScience() {
		return socialScience;
	}
	public void setSocialScience(float socialScience) {
		this.socialScience = socialScience;
	}
	
	public Float getBiology() {
		return biology;
	}
	public void setBiology(Float biology) {
		this.biology = biology;
	}
	public float getMaths() {
		return maths;
	}
	public void setMaths(float maths) {
		this.maths = maths;
	}
	public float getPhysics() {
		return physics;
	}
	public void setPhysics(float physics) {
		this.physics = physics;
	}
	public float getChemistry() {
		return chemistry;
	}
	public void setChemistry(float chemistry) {
		this.chemistry = chemistry;
	}
}
