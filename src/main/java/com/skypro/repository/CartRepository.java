package com.skypro.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CartRepository {
    private final List <Integer> idList = new ArrayList<> ();

    public void addToCart (List <Integer> ids) {
        idList.addAll (ids);
    }

    public  List<Integer> getCartContent() {
        return this.idList;
    }
}
