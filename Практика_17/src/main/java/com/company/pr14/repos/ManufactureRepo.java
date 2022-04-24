package com.company.pr14.repos;

import com.company.pr14.domain.Manufacture;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManufactureRepo extends CrudRepository<Manufacture, Integer>, ManufactureCustomRepo {


}
