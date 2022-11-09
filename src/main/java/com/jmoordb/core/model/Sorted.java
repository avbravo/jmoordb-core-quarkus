/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordb.core.model;

import org.bson.Document;

/**
 *
 * @author avbravo
 */
public class Sorted {
    private Document sort;

    public Sorted() {
    }

    public Sorted(Document sort) {
        this.sort = sort;
    }

    public Document getSort() {
        return sort;
    }

    public void setSort(Document sort) {
        this.sort = sort;
    }
    
    
}
