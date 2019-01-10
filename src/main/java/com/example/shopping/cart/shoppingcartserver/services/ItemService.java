package com.example.shopping.cart.shoppingcartserver.services;

import com.example.shopping.cart.shoppingcartserver.model.Item;
import com.example.shopping.cart.shoppingcartserver.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Copyright (c) 2018. scicom.com.my - All Rights Reserved
 * Created by kalana.w on 1/10/2019.
 */
@Service
public class ItemService
{
	@Autowired
	private ItemRepository itemRepository;

	public Item saveNewItem( Item item )
	{
		return this.itemRepository.save( item );
	}

	public List<Item> findAllItems()
	{
		return this.itemRepository.findAll();
	}

	public Item findItemById( long id )
	{
		return this.itemRepository.findById( id ).orElse( null );
	}
}
