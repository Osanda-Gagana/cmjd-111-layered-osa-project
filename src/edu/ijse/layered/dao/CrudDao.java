/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package edu.ijse.layered.dao;
import java.util.ArrayList;

public interface CrudDao<T, ID> extends SuperDao{
    public boolean save(T t) throws Exception;
    public boolean update(T t) throws Exception;
    public boolean delete(ID id) throws Exception;
    public T search(ID id) throws Exception;
    public ArrayList<T> getAll() throws Exception;
}