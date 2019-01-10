package com.example.shopping.cart.shoppingcartserver.repository;

import com.example.shopping.cart.shoppingcartserver.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Copyright (c) 2018. scicom.com.my - All Rights Reserved
 * Created by kalana.w on 1/10/2019.
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Long>
{
}
