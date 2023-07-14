/*
 * Copyright (C) 2023 Alonso del Arte
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package fake.java.lang;

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Alonso del Arte
 */
public class StringNGTest {
    
    public StringNGTest() {
    }

    /**
     * Test of the toString function, of the String class.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String instance = new String();
        java.lang.String expected = instance.getClass().getName() + '@' 
                + Integer.toString(instance.hashCode(), 12);
        java.lang.String actual = instance.toString();
        assertEquals(actual, expected);
    }
    
}
