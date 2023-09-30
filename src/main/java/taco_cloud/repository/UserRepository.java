package taco_cloud.repository;

import org.springframework.data.repository.CrudRepository;
import taco_cloud.entity.User;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUserName(String userName);
}
