package net.woniper.springboot.repository;

import net.woniper.springboot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by woniper on 14. 10. 25..
 */
public interface UserRepository extends JpaRepository<User, Long> {
}
