/*
 * Copyright (C) 2016 Xor
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
package org.clyde4rog.database.security.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xor
 */
public class UserTest {
    
    public UserTest() {
    }

    @Test
    public void testGeneralMethods() {
        final String testUsername = "testusername";
        final String testPassword = "testpassword";
        final String testToString = "org.clyde4rog.database.security.model.User[ id=" + testUsername + " ]";
        final Role testRole1 = new Role();
        final Role testRole2 = new Role();
        final List<Role> testRoles = new ArrayList<>();
        testRoles.add(testRole1);
        testRoles.add(testRole2);
        
        User user = new User();
        user.setUsername(testUsername);
        assertEquals(testUsername, user.getUsername());
        user.setPassword(testPassword);
        assertEquals(testPassword, user.getPassword());
        assertEquals(testToString, user.toString());
        user.setRoles(testRoles);
        assertEquals(testRoles, user.getRoles());
        
        user = new User(testUsername, testPassword);
        assertEquals(testUsername, user.getUsername());
        assertEquals(testPassword, user.getPassword());
        assertEquals(testToString, user.toString());
        
        user = new User(testUsername, testPassword, testRoles);
        assertEquals(testUsername, user.getUsername());
        assertEquals(testPassword, user.getPassword());
        assertEquals(testToString, user.toString());
        assertEquals(testRoles, user.getRoles());
    }
    
}
