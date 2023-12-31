package com.dhanashri.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {
	
	@Id
	@Column(nullable = false,unique = true)
	private Long categoryId;
	
	@Column(nullable = false,unique = true)
	private String categoryName;
	
	@Column(unique = true)
	private String discription;
	
	@Column(nullable = false)
	private Integer discount;
	
	@Column(nullable = false)
	private Integer gst;
	
	@Column(nullable = false)
	private Integer deliveryCharge;
	
	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(Long categoryId, String categoryName, String discription, Integer discount, Integer gst,
			Integer deliveryCharge) {
		super();
		this.categoryId = categoryId;
		this.categoryName = categoryName;
		this.discription = discription;
		this.discount = discount;
		this.gst = gst;
		this.deliveryCharge = deliveryCharge;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getDiscription() {
		return discription;
	}

	public void setDiscription(String discription) {
		this.discription = discription;
	}

	public Integer getDiscount() {
		return discount;
	}

	public void setDiscount(Integer discount) {
		this.discount = discount;
	}

	public Integer getGst() {
		return gst;
	}

	public void setGst(Integer gst) {
		this.gst = gst;
	}

	public Integer getDeliveryCharge() {
		return deliveryCharge;
	}

	public void setDeliveryCharge(Integer deliveryCharge) {
		this.deliveryCharge = deliveryCharge;
	}
	
	

}
