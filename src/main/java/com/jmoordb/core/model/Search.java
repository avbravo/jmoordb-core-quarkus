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
public class Search {
    Document filter;
    Pagination pagination = new Pagination();
    Sorted sorted = new Sorted();

    public Search() {
    }

    public Document getFilter() {
        return filter;
    }

    public void setFilter(Document filter) {
        this.filter = filter;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Sorted getSorted() {
        return sorted;
    }

    public void setSorted(Sorted sorted) {
        this.sorted = sorted;
    }
    
    
}
