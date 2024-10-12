package spring.consumer.repository;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import spring.consumer.entities.UserInfo;
import spring.consumer.entities.UserInfoDto;

import java.util.Optional;

@Repository
@EnableJpaRepositories
public interface UserRepository extends CrudRepository<UserInfo, String> {

    Optional<UserInfo> findByUserId(String userId);
}
