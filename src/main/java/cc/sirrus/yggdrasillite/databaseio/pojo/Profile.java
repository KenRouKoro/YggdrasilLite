package cc.sirrus.yggdrasillite.databaseio.pojo;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.UUID;

@Getter
@Entity
@Table(name = "profile")
public class Profile {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String pid;
    private UUID uuid;  //! 游戏的uuid
    private String uid; //! 对应目标用户的uid
    @ManyToOne
    @JoinColumn(name = "uid",referencedColumnName = "uid")
    private User user;
    private String name;
    private Long timestamp;
    private String model_type;
    // default  slim
    private Boolean uploadable_skin;
    private Boolean uploadable_cape;
    private String skin_url;
    private String cape_url;


        public Profile() {

    }
        public void init(
            UUID uuid,
            User user,
            String name,
            Long timestamp,
            String model_type,
            Boolean uploadable_skin,
            Boolean uploadable_cape,
            String skin_url,
            String cape_url
        ) {
        this.uuid = uuid;
        this.user = user;
        this.name = name;
        this.timestamp = timestamp;
        this.model_type = model_type;
        this.uploadable_skin = uploadable_skin;
        this.uploadable_cape = uploadable_cape;
        this.skin_url = skin_url;
        this.cape_url = cape_url;
    }




    public void setUser(User user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel_type(String model_type) {
        this.model_type = model_type;
    }

    public void setUploadable_skin(Boolean uploadable_skin) {
        this.uploadable_skin = uploadable_skin;
    }

    public void setUploadable_cape(Boolean uploadable_cape) {
        this.uploadable_cape = uploadable_cape;
    }

    public void setSkin_url(String skin_url) {
        this.skin_url = skin_url;
    }

    public void setCape_url(String cape_url) {
        this.cape_url = cape_url;
    }

    public static class Token {
    }
}
