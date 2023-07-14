/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fake.java.lang;

/**
 * This class demonstrates that it is possible to give a class the same name as 
 * a class in the Java Development Kit (JDK). In this case, the JDK class is 
 * <code>java.lang.String</code>. A few trick questions about Java rely on the 
 * fact that <code>String</code> is not a primitive data type or the fact that 
 * "<code>String</code>" is not a reserved word.
 * @author Alonso del Arte
 */
public class String {
    
    @Override
    public java.lang.String toString() {
        return this.getClass().getName() + '@' 
                + Integer.toString(this.hashCode(), 12);
    }
    
}
