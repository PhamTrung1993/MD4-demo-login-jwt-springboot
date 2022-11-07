package com.codegym.repository;

import com.codegym.model.AppUser;
import com.codegym.model.ICountRole;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface UserRepository extends PagingAndSortingRepository<AppUser, Long> {

    Optional<AppUser> findByName(String username);

    @Query(nativeQuery = true, value = "select r.name, count(app_user.name) as 'number' from app_user join user_roles ur on app_user.id = ur.user_id join role r on r.id = ur.role_id group by r.name;")
    Iterable<ICountRole> getRoleNumber();
}
