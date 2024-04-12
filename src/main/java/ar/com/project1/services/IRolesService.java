package ar.com.project1.services;

import ar.com.project1.entities.Roles;

import java.util.List;

public interface IRolesService {
    List<Roles> getAll();
    List<Roles> findByDescrip(String descrip);
    Roles get(Integer id);
    void save(Roles entity);
    String delete(Roles entity);
}