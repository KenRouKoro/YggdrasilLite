package cc.sirrus.yggdrasillite.databaseio.pojo;


import jakarta.persistence.*;
import lombok.Getter;

@Getter
@Entity
public class Token {
    public Token(){

    }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tid;
    private Integer uid; //! 对应目标用户的uid
    @ManyToOne(targetEntity = User.class)
    //JoinColumn(name = "uid",referencedColumnName = "uid")
    private User user;
    private String access_token;
    private String client_token;

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public void setClient_token(String client_token) {
        this.client_token = client_token;
    }
}
