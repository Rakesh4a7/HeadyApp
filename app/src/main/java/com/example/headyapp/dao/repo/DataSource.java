package com.example.headyapp.dao.repo;

import java.util.List;

/**
 * @author Rakesh
 * Base datasource
 * @param <T>
 */
public interface DataSource<T>
{

    void addItem(T item);

    void addItems(List<T> items);


}
