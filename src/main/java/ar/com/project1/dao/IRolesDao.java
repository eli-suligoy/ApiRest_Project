package ar.com.project1.dao;

import ar.com.project1.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IRolesDao extends JpaRepository<Roles, Integer> {
    @Query("select c from Roles c where c.descrip like ?1")
    public List<Roles> findByDescrip(String name);
}
