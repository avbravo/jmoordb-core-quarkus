/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jmoordb.core.repository;

import com.jmoordb.core.annotation.repository.DeleteBy;
import com.jmoordb.core.annotation.repository.Find;
import com.jmoordb.core.annotation.repository.Save;
import com.jmoordb.core.annotation.repository.Update;
import com.jmoordb.core.model.Pagination;
import com.jmoordb.core.model.Sorted;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author avbravo
 */
public interface CrudRepository<T, PK> {

    @Save
    public Optional<T> save(T t);

    @Update
    public Boolean update(T t);

    @Find()
    public List<T> findAll();

    @Find()
    public List<T> findAllPagination(Pagination pagination);

    @Find()
    public List<T> findAllSorted(Sorted sorted);

    @Find()
    public List<T> findAllPaginationSorted(Pagination pagination, Sorted sorted);

   
    public Optional<T> findByPk(PK id);
    
    @DeleteBy
    public Long deleteByPk(PK id);


}
