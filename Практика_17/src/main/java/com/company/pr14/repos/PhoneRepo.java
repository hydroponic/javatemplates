package com.company.pr14.repos;

import com.company.pr14.domain.Phone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneRepo extends CrudRepository<Phone, Integer>, PhoneCustomRepo {

}
