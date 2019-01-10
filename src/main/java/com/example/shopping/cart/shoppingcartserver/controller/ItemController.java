package com.example.shopping.cart.shoppingcartserver.controller;

import com.example.shopping.cart.shoppingcartserver.model.Item;
import com.example.shopping.cart.shoppingcartserver.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Copyright (c) 2018. scicom.com.my - All Rights Reserved
 * Created by kalana.w on 1/10/2019.
 */
@RestController
@RequestMapping("items")
public class ItemController
{
	@Autowired
	private ItemService itemService;

	@PostMapping("/")
	public ResponseEntity<Item> saveNewItem( @RequestBody Item item )
	{
		if ( item == null )
		{
			return ResponseEntity.badRequest().build();
		}
		Item savedItem = this.itemService.saveNewItem( item );
		return ResponseEntity.ok( savedItem );
	}

	@GetMapping("/")
	public ResponseEntity<List<Item>> findAllItems()
	{
		List<Item> items = this.itemService.findAllItems();
		if ( items == null || items.isEmpty() )
		{
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.ok( items );
	}

	@GetMapping("/{id}")
	public ResponseEntity<Item> findItemById( @PathVariable(name = "id") long id )
	{
		if ( id <= 0 )
		{
			return ResponseEntity.badRequest().build();
		}
		Item item = this.itemService.findItemById( id );
		if ( item == null )
		{
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.ok( item );
	}
}
