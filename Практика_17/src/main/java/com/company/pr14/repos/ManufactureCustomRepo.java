package com.company.pr14.repos;


import com.company.pr14.domain.Manufacture;

import java.util.List;

public interface ManufactureCustomRepo {
    List<Manufacture> findByName(String name, String param);
}
