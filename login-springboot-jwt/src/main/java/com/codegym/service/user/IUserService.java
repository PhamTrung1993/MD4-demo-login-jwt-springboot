package com.codegym.service.user;

import com.codegym.model.AppUser;
import com.codegym.model.ICountRole;
import com.codegym.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<AppUser>, UserDetailsService {
    AppUser findByName(String name);
    Iterable<ICountRole> getRoleNumber();

}
