package cc.sirrus.yggdrasillite.databaseio.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "users")
public class User {
    @OneToMany(targetEntity = Profile.class, mappedBy = "users")
    List<Profile> profiles;
    @OneToMany(targetEntity = Token.class, mappedBy = "users")
    List<Token> tokens;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String uid;
    private String password_hash;
    private String name;
    private String preferredLanguage;

    public void appendProfile(Profile profile) {
        this.profiles.add(profile);
    }

}
