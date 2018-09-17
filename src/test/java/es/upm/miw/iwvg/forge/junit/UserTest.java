package es.upm.miw.iwvg.forge.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class UserTest {

    private User user;

    @BeforeEach
    void before() {
        user = new User(1, "Jesús", "Bernal");
    }

    @Test
    void testFullName(){
        assertEquals("Jesús Bernal", this.user.fullName());
    }

    @Test
    void testInitials(){
        assertEquals("J.", this.user.initials());
    }

    @Test
    void testNumber(){
        assertEquals(1, this.user.getNumber());
    }

    @Test
    void testName(){
        assertEquals("Jesús", this.user.getName());
    }

    @Test
    void testFamilyName(){
        assertNotEquals("García", this.user.getFamilyName());
    }
}
