package com.example.practice.DAO;

import com.example.practice.Model.UserPojo;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Repository
public class UserDAO {
    @PersistenceContext
    EntityManager entityManager;
    public void setMpin(UserPojo user) {
        entityManager.persist(user);
    }
}
