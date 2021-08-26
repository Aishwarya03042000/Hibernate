package com.xworkz.birds.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "birds")
public class BirdsEntity implements Serializable {

	@Column(name = "b_id")
	@Id
	private int id;
	@Column(name = "b_name")
	private String name;
	@Column(name = "b_willFly")
	private boolean willFly;
	@Column(name = "b_color")
	private String color;
	@Column(name = "b_breed")
	private String breed;
	@Column(name = "b_height")
	private float height;
	@Column(name = "b_weight")
	private float weight;
	@Column(name = "b_isBills")
	private boolean isBills;
	@Column(name = "b_isBeak")
	private boolean isBeak;
	@Column(name = "b_eyeColor")
	private String eyeColor;

	public BirdsEntity() {

	}

	public BirdsEntity(int id, String name, boolean willFly, String color, String breed, float height, float weight,
			boolean isBills, boolean isBeak, String eyeColor) {

		this.id = id;
		this.name = name;
		this.willFly = willFly;
		this.color = color;
		this.breed = breed;
		this.height = height;
		this.weight = weight;
		this.isBills = isBills;
		this.isBeak = isBeak;
		this.eyeColor = eyeColor;
	}

	@Override
	public String toString() {
		return "BirdsEntity [id=" + id + ", name=" + name + ", willFly=" + willFly + ", color=" + color + ", breed="
				+ breed + ", height=" + height + ", weight=" + weight + ", isBills=" + isBills + ", isBeak=" + isBeak
				+ ", eyeColor=" + eyeColor + "]";
	}

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

	public boolean isWillFly() {
		return willFly;
	}

	public void setWillFly(boolean willFly) {
		this.willFly = willFly;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public boolean isBills() {
		return isBills;
	}

	public void setBills(boolean isBills) {
		this.isBills = isBills;
	}

	public boolean isBeak() {
		return isBeak;
	}

	public void setBeak(boolean isBeak) {
		this.isBeak = isBeak;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
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
		BirdsEntity other = (BirdsEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}
}
