/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.jmoordb.core.repository;

import com.jmoordb.core.annotation.repository.CoreException;
import com.jmoordb.core.annotation.repository.Count;
import com.jmoordb.core.annotation.repository.DeleteBy;
import com.jmoordb.core.annotation.repository.DeleteMany;
import com.jmoordb.core.annotation.repository.Find;
import com.jmoordb.core.annotation.repository.Save;
import com.jmoordb.core.annotation.repository.Update;
import com.jmoordb.core.annotation.repository.UpdateMany;
import com.jmoordb.core.context.ContextJMoordbCore;
import com.jmoordb.core.model.Pagination;
import com.jmoordb.core.model.Search;
import com.jmoordb.core.model.Sorted;
import com.jmoordb.core.processor.model.JmoordbException;
import com.mongodb.client.ListIndexesIterable;
import com.mongodb.client.MongoIterable;
import java.util.List;
import java.util.Optional;
import org.bson.Document;
import org.bson.conversions.Bson;

/**
 *
 * @author avbravo
 */
public interface CrudRepository<T, PK> {
default public void setDynamicDatabase(String dataBase) {
        ContextJMoordbCore.mongodbdatabase = dataBase;
    }

    default public String getDynamicDatabase() {
        if (ContextJMoordbCore.mongodbdatabase == null) {
            return "";
        } else {
            return ContextJMoordbCore.mongodbdatabase;
        }

    }
    default public void setDynamicCollection(String collection) {
        ContextJMoordbCore.mongodbcollection = collection;
    }

    default public String getDynamicCollection() {
        if (ContextJMoordbCore.mongodbcollection == null) {
            return "";
        } else {
            return ContextJMoordbCore.mongodbcollection;
        }

    }
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
    
    @DeleteMany
    public Long deleteMany(Search search);
    
    @UpdateMany
    public Long updateMany(Bson query, Bson update);
@CoreException()
public JmoordbException getJmoordbException();


    public String createIndex(Bson bson );
    
    public void dropIndex(Bson bson );
    
    public Optional<ListIndexesIterable<Document>> listIndexes();
    
     public Optional<MongoIterable<String>> listCollectionNames();

}
