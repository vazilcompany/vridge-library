package com.vazil.notification.model.slack;

import com.google.gson.annotations.SerializedName;
import com.vazil.notification.model.slack.block.Block;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SlackAttachments {
    private String fallback;
    private String callback_id;

    /**
     * Recommended colors for displaying information:
     * <ul>
     * <li>SUCCESS: GREEN (#009944)</li>
     * <li>ERROR: RED (#cf000f)</li>
     * <li>WARNING: ORANGE (#f0541e)</li>
     * <li>INFO: LIGHT BLUE (#63c0df)</li>
     * <li>WHITE: WHITE (#ffffff)</li>
     * </ul>
     */
    private String color;

    private String author_id;
    private String author_name;
    private String author_link;
    private String author_icon;

    private String channel_id;
    private String channel_name;

    private Integer id;

    private String title;
    private String title_link;

    private String text;
    private SlackFields fields;

    private String image_url;
    private Integer image_width;
    private Integer image_height;
    private Integer image_bytes;

    private String thumb_url;
    private Integer thumb_width;
    private Integer thumb_height;

    private String footer;
    private String footer_icon;
    @SerializedName("ts")
    private String time_stamp;

    private Block[] blocks;

    public static SlackAttachments vridgeTemplate(String color, Block[] blocks) {
        return SlackAttachments.builder()
                .color(color)
                .blocks(blocks)
                .build();
    }
}
