/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interface;

import Models.MAppointment;
import personal.IPersonal;

/**
 *
 * @author ITS
 */
public interface IAppointment extends IPersonal<Integer, MAppointment> {
     Integer count();
}
