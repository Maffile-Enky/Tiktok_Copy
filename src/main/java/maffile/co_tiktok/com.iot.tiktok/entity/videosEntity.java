package maffile.co_tiktok.com.iot.tiktok.entity;

import lombok.Data;

@Data
public class videosEntity {
    private String id;
    private String user_id;
    private String video_url;
    private String cover_url;
    private String title;
    private String description;
    private Integer play_count;
    private Integer like_count;
    private String created_at;
}
