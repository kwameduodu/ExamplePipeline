package com.revature.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.domain.Role;


public interface RoleRepo extends JpaRepository<Role, Long>{
	Role findByName(String name);

}
