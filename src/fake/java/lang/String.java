/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fake.java.lang;

/**
 *
 * @author Alonso del Arte
 */
public class String {
    
    @Override
    public java.lang.String toString() {
        return this.getClass().getName() + '@' 
                + Integer.toString(this.hashCode(), 13);
    }
    
}
