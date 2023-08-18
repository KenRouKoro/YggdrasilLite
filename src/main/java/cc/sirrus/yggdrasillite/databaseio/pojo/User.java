package cc.sirrus.yggdrasillite.databaseio.pojo;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Getter
@Entity
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String uid;
    private String password_hash;
    private String name;
    private String preferredLanguage;
    @OneToMany
    @JoinColumn(name = "uid", referencedColumnName = "uid")
    List<Profile> profiles;
    @Getter
    @OneToMany
    @JoinColumn(name = "uid", referencedColumnName = "uid")
    List<Token> tokens;

    public User() {

    }
    public void init(
            String name,
            String preferredLanguage,
            String password_hash
        ) {
        this.name = name;
        this.preferredLanguage = preferredLanguage;
        this.password_hash = password_hash;
    }


    public void setUid(String id) {
        this.uid = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPreferredLanguage(String preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
    }

    public void setProfiles(List<Profile> profile) {
        this.profiles = profile;
    }

    public void setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
    }
    public void appendProfile(Profile profile){
        this.profiles.add(profile);
    }

    public void setTokens(List<Token> tokens) {
        this.tokens = tokens;
    }
}
