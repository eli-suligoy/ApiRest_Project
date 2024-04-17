package ar.com.project1.services;

import ar.com.project1.entities.User;

import java.util.List;

public interface IUserService {
    List<User> getAll();
    List<User> findByUsuario(String usuario);
    User get(Integer id);
    void save(User entity);
    String delete(User entity);
}
