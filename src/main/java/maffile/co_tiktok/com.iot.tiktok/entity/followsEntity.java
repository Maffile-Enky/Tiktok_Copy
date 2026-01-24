package maffile.co_tiktok.com.iot.tiktok.entity;

import lombok.Data;

@Data
public class followsEntity {
    private String id;
    private String user_id;
    private String follower_id;
    private String followee_id;
    private String created_at;
}
