package cc.sirrus.yggdrasillite.databaseio.pojoservice;

import cc.sirrus.yggdrasillite.databaseio.pojo.Token;
import cc.sirrus.yggdrasillite.databaseio.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
