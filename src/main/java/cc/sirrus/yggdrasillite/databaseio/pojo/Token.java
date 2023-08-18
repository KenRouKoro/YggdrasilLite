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
    private String tid;
    private String uid; //! 对应目标用户的uid
    @ManyToOne
    @JoinColumn(name = "uid",referencedColumnName = "uid")
    private User user;
    private String access_token;
    private String client_token;

    public String getTid() {
        return tid;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getClient_token() {
        return client_token;
    }

    public void setClient_token(String client_token) {
        this.client_token = client_token;
    }
}
