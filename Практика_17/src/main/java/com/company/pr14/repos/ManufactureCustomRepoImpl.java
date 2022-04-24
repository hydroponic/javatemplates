package com.company.pr14.repos;

import com.company.pr14.domain.Manufacture;
import com.company.pr14.domain.Phone;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;

public class ManufactureCustomRepoImpl implements ManufactureCustomRepo{
    @Autowired
    private EntityManager em;
    @Override
    public List<Manufacture> findByName(String name, String param) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Manufacture> query = cb.createQuery(Manufacture.class);
        Root<Manufacture> from = query.from(Manufacture.class);
        Expression<String> exp = from.get(param);
        Predicate in = exp.in(name);
        query.where(in);
        CriteriaQuery<Manufacture> select = query.select(from);
        TypedQuery<Manufacture> query1 = em.createQuery(select);
        return query1.getResultList();
    }
}
