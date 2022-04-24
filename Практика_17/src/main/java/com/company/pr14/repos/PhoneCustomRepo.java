package com.company.pr14.repos;

import com.company.pr14.domain.Phone;

import java.util.List;

public interface PhoneCustomRepo {
    List<Phone> findByName(String name, String param);
}
