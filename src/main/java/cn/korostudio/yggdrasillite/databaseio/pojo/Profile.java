package cn.korostudio.yggdrasillite.databaseio.pojo;

import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.List;
import java.util.UUID;

public class Profile {
    @Id
    private UUID uuid;
    @ManyToOne
    @JoinColumn()
    private User user;
    private String name;
    private List<String> uploadableTextures;
    private Long timestamp;
    private String model_type;
    private String skin_url;
    private String cape_url;
}
