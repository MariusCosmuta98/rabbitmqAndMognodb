package com.example.rabbitmq;


import com.example.rabbitmq.classes.User;
import com.example.rabbitmq.repository.UserRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;

@DataMongoTest
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    public void testSaveUser() {
        User user = new User();
        user.setName("John Doe");
        user.setEmail("john.doe@example.com");
        userRepository.save(user);

        User savedUser = userRepository.findById(user.getId()).get();
        assert (savedUser.getName()).equals("John Doe");
//        assertThat(savedUser.getName()).isEqualTo("John Doe");
//        assertThat(savedUser.getEmail()).isEqualTo("john.doe@example.com");
    }
}

