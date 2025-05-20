/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package personal;

import java.util.ArrayList;

/**
 *
 * @author ITS
 */
public interface IPersonal<ID extends Number, T extends Personal> {
    ArrayList<T> query();
    void insert(T obj);
    void remove(ID id);
    void update(T objOld, T obj);
    T getById(ID id);
}
