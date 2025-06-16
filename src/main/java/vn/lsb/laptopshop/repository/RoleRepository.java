package vn.lsb.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vn.lsb.laptopshop.domain.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
