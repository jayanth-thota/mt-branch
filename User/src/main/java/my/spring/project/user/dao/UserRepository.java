package my.spring.project.user.dao;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import my.spring.project.user.pojos.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	User findByUserNameAndPassword(String userName, String password);

	
	User findByUserNameAndPasswordAndConfirmed(String username, String password, String string);



	Optional<User> findByEmail(String emailId);
}
