/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exception;

import javax.management.BadAttributeValueExpException;
/**
 *
 * @author nicolocarello, CarloFerraro, StefanoSpada
 */
public class VoidStringUnexpectedException extends BadAttributeValueExpException{
    public VoidStringUnexpectedException(String message) {
        super(message);
    }
}
