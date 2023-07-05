package cn.korostudio.yggdrasillite.databaseio.pojo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import java.util.List;

public class User {
    private String id;
    private String name;
    private String preferredLanguage;
    @OneToMany(mappedBy = "User", cascade = CascadeType.PERSIST)
    List profile;
}
