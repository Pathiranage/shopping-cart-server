package com.example.shopping.cart.shoppingcartserver.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Copyright (c) 2018. scicom.com.my - All Rights Reserved
 * Created by kalana.w on 1/10/2019.
 */
@Entity
@Table(name = "ITEMS")
@Data
public class Item
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "ITEM_NAME")
	private String itemName;

	@Column(name = "ITEM_CATEGORY")
	private String itemCategory;

	@Column(name = "COST_PRICE")
	private Double costPrice;

	@Column(name = "SELLING_PRICE")
	private Double sellingPrice;
}
