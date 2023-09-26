package cc.sirrus.yggdrasillite.databaseio.pojo;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Token {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String tid;
    @ManyToOne
    private User users; // 与User的多对一关系
    private String access_token;
    private String client_token;

    public void setUsers(User users) {
        this.users = users;
        if (!users.getTokens().contains(this)) { // 防止无限循环
            users.getTokens().add(this);
        }
    }
}
