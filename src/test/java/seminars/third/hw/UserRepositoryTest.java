package seminars.third.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {
    UserRepository userRepository;
    User user1; //Maybe there is possible to use the Mockito?
    User user2;
    User userAdmin;

    List<User> dataTestWithoutAdmins;
    @BeforeEach
    void setUp(){
        userRepository = new UserRepository();
        userAdmin = new User("John", "Foo", true);
        user1 = new User("Funky", "Monkey#1", false);
        user2 = new User("Sad", "Monkey#2", false);
        dataTestWithoutAdmins = new ArrayList<>(Collections.singletonList(userAdmin));
    }


    @Test
    @DisplayName("Test adding the user")
    void addUser() {
        userRepository.addUser(user1);
        assertEquals(1, userRepository.data.size());
    }

    @Test
    @DisplayName("Test is present user or not")
    void findByName() {
        userRepository.addUser(userAdmin);
        assertTrue( userRepository.findByName("John"),"The user is presented");
    }
    //Adding a new feature - users logout by role
    //Should do log off users, that don't have administrative permissions
    @Test
    @DisplayName("Test result of log off non-administrator users")
    void ordinaryUsersLogOff(){
        //User should to have an attribute - isAdmin
        //Method can log off users with non admin role.
        userRepository.addUser(user1);
        userRepository.addUser(user2);
        userRepository.addUser(userAdmin);
        userRepository.logOffNonAdminUsers();
        assertArrayEquals(dataTestWithoutAdmins.toArray(),userRepository.data.toArray());
           }

}