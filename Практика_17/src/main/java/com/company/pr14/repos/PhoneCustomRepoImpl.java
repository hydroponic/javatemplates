package com.company.pr14.repos;

import com.company.pr14.domain.Phone;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class PhoneCustomRepoImpl implements PhoneCustomRepo{
    @Autowired
    private EntityManager em;
    @Override
    public List<Phone> findByName(String name, String param) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Phone> query = cb.createQuery(Phone.class);
        Root<Phone> from = query.from(Phone.class);
        Expression<String> exp = from.get(param);
        Predicate in = exp.in(name);
        query.where(in);
        CriteriaQuery<Phone> select = query.select(from);
        TypedQuery<Phone> query1 = em.createQuery(select);
        return query1.getResultList();
    }
}
