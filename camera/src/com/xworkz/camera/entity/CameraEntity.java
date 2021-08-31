package com.xworkz.camera.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "camera")
public class CameraEntity implements Serializable {

	@Column(name = "c_id")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "c_brand")
	private String brand;
	@Column(name = "c_styleName")
	private String styleName;
	@Column(name = "c_color")
	private String color;
	@Column(name = "c_price")
	private double price;
	@Column(name = "c_weight")
	private double weight;
	@Column(name = "c_specialFeature")
	private String specialFeature;
	@Column(name = "c_lensType")
	private String lensType;
	@Column(name = "c_shootingModes")
	private String shootingModes;
	@Column(name = "c_distributedBy")
	private String distributedBy;

	public CameraEntity() {

	}

	public CameraEntity(String brand, String styleName, String color, double price, double weight,
			String specialFeature, String lensType, String shootingModes, String distributedBy) {

		this.id = id;
		this.brand = brand;
		this.styleName = styleName;
		this.color = color;
		this.price = price;
		this.weight = weight;
		this.specialFeature = specialFeature;
		this.lensType = lensType;
		this.shootingModes = shootingModes;
		this.distributedBy = distributedBy;
	}

	@Override
	public String toString() {
		return "CameraEntity [id=" + id + ", brand=" + brand + ", styleName=" + styleName + ", color=" + color
				+ ", price=" + price + ", weight=" + weight + ", specialFeature=" + specialFeature + ", lensType="
				+ lensType + ", shootingModes=" + shootingModes + ", distributedBy=" + distributedBy + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getStyleName() {
		return styleName;
	}

	public void setStyleName(String styleName) {
		this.styleName = styleName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getSpecialFeature() {
		return specialFeature;
	}

	public void setSpecialFeature(String specialFeature) {
		this.specialFeature = specialFeature;
	}

	public String getLensType() {
		return lensType;
	}

	public void setLensType(String lensType) {
		this.lensType = lensType;
	}

	public String getShootingModes() {
		return shootingModes;
	}

	public void setShootingModes(String shootingModes) {
		this.shootingModes = shootingModes;
	}

	public String getDistributedBy() {
		return distributedBy;
	}

	public void setDistributedBy(String distributedBy) {
		this.distributedBy = distributedBy;
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
		CameraEntity other = (CameraEntity) obj;
		if (id != other.id)
			return false;
		return true;
	}

}
