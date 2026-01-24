package maffile.co_tiktok.com.iot.tiktok.entity;

import lombok.Data;

@Data
public class commentsEntity {
    private String id;
    private String user_id;
    private String video_id;
    private String comments;
    private String created_at;
}
