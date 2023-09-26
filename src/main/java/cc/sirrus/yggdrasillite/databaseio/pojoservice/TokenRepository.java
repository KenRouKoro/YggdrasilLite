package cc.sirrus.yggdrasillite.databaseio.pojoservice;

import cc.sirrus.yggdrasillite.databaseio.pojo.Token;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, String> {
}
