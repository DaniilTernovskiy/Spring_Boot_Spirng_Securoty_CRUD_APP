package ru.itmentor.spring.boot_security.demo.service;



import ru.itmentor.spring.boot_security.demo.models.Role;
import ru.itmentor.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User getUser(long id);
    void deleteUser(long id);
    List<User> getAllUsers();
    List<Role> getAllRoles();
    void updateUserWithRoles(User user, List<Long> roleIds);
}
