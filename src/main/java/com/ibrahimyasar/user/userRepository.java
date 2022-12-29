package com.ibrahimyasar.user;

import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<User, Integer> {
    public Long countById(Integer id);
}
