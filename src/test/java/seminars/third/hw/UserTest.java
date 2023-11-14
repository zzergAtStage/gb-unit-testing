package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    //Since, we're trying to learn the TDD, it needs a some tests creation, before to develop the main code.
    // Added test for constructors
    String userName;
    String userRole;
    //new user
    User user;
    //To compare two users by their attributes, added an equals method to User class
    @BeforeEach
    void setUp(){
        user = new User("John", "Foo", true);
    }
    @Test
    @DisplayName("Test User constructor")
    void userCreationTest(){
        User user1 = new User("John", "Foo", true);
        assertNotNull(user1);
        assertEquals(user1,user);
    }
    @Test
    void authenticate() {
    }
}