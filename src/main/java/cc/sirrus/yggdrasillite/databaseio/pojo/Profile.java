package cc.sirrus.yggdrasillite.databaseio.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Profile {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String pid;
    private UUID uuid;  //! 游戏的uuid
    @ManyToOne
    private User users; // 与User的多对一关系
    private String name;
    private Long timestamp;
    private String model_type;
    // default  slim
    private Boolean uploadable_skin;
    private Boolean uploadable_cape;
    private String skin_url;
    private String cape_url;

    public void setUsers(User users) {
        this.users = users;
        if (!users.getProfiles().contains(this)) { // 防止无限循环
            users.getProfiles().add(this);
        }
    }
}
