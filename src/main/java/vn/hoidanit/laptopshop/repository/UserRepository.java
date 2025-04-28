package vn.hoidanit.laptopshop.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.hoidanit.laptopshop.domain.User;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
    User save(User lsb);
    Optional<User> findById(Long id);

    List<User> findAll();
    User findById(long id);
    void deleteById(Long id);

    

}
