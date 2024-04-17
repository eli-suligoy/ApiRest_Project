package ar.com.project1.dao;


import ar.com.project1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserDao extends JpaRepository<User, Integer> {
    @Query("select c from User c where c.usuario like ?1")
    public List<User> findByUsuario(String name);
}
