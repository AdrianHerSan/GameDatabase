package com.Repository.User;

import com.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaUpdate;

@Repository
public class UserRepositoryCustomImplementation implements UserRepositoryCustom {

    @Autowired
    private EntityManager entityManager;

    @Override
    public boolean updateMatches(User user) {

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaUpdate<User> criteriaUpdate = criteriaBuilder.createCriteriaUpdate(User.class);

        criteriaUpdate.set("victories", user.getVictories());
        criteriaUpdate.set("totalmatches", user.getTotalmatches());

        this.entityManager.createQuery(criteriaUpdate).executeUpdate();

        return true;
    }
}
