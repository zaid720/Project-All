/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package person;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import person.Person;

/**
 *
 * @author ITS
 */
public interface IPerson<T extends Person, ID extends Number> {
    
    void add(T obj);
    
    void update(T obj, ID id);
    
    void remove(ID id);
    
    T getById(ID id);
    
    void getAll();
    
//    default boolean isValidDate(String dateStr) {
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        try {
//            LocalDate.parse(dateStr, formatter);
//            return true;
//        } catch (DateTimeParseException e) {
//            return false; // If parsing fails, the format is invalid
//        }
//    }
    
}
