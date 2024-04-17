package ar.com.project1.controller;


import ar.com.project1.entities.Roles;
import ar.com.project1.entities.User;
import ar.com.project1.services.IRolesService;
import ar.com.project1.services.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    IUserService entityService;

    @GetMapping(path = "/user")
    public List<User> getAll() {return entityService.getAll();}

    @GetMapping(path = "/user/{id}")
    public User get(@PathVariable Integer id) {return entityService.get(id);}

    @GetMapping(path = "/user/search/{expresion}")
    public List<User> getListUser(@PathVariable String expresion) {return entityService.findByUsuario(expresion);}

    @PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
    public User save(@RequestBody User entity) {
        entityService.save(entity);
        return entity;
    }

    @GetMapping (path = "/user/delete/{id}")
    public String delete(@PathVariable Integer id) {
        User entity = null;
        try {
            entity = entityService.get(id);
            entityService.delete(entity);
            return null;
        } catch (Exception e) {
            return e.getMessage().toString();
        }
    }
}
