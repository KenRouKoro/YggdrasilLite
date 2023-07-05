package cn.korostudio.yggdrasillite.yggdrasapi;

import java.nio.charset.StandardCharsets;
import java.util.UUID;

public class YggdrasUUID {
    public static UUID generateOfflineUUID(String characterName){
        return UUID.nameUUIDFromBytes(("OfflinePlayer:" + characterName).getBytes(StandardCharsets.UTF_8));
    }
    public static UUID generateNormalUUID(){
        long time = System.currentTimeMillis();
        int random = (int) (Math.random() * Integer.MAX_VALUE);
        String uuid = new UUID(time, random).toString();
        return UUID.fromString(uuid.substring(0, uuid.length () - 6) + "000000");
    }
}
