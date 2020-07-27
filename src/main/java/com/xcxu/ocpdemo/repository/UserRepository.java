package com.xcxu.ocpdemo.repository;

        import com.xcxu.ocpdemo.entity.User;
        import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
  User findByName(String emailAddress);
}