package bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import bookstore.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	User getByUserName(String username);
	User getByEmail(String email);
	
}
