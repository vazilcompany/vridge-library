package com.vazil.notification.model.mattermost;


import com.google.gson.annotations.SerializedName;
import lombok.Builder;
import lombok.Data;

/**
 * An array of message attachments that can be included in the Mattermost notification payload.
 * <p>
 * See also <a href="https://developers.mattermost.com/integrate/reference/message-attachments/">Mattermost message attachments</a>
 * </p>
 */
@Data
@Builder
public class Attachments {
    private String fallback;
    /**
     * Recommended colors for displaying information:
     * <li>SUCCESS: GREEN (#009944)</li>
     * <li>ERROR: RED (#cf000f)</li>
     * <li>WARNING: ORANGE (#f0541e)</li>
     * <li>INFO: LIGHT BLUE (#63c0df)</li>
     * <li>WHITE: WHITE (#ffffff)</li>
     */
    private String color;
    private String pretext;
    private String author_name;
    private String author_link;
    private String author_icon;
    private String title;
    private String title_link;
    private String text;
    private Fields[] fields;
    private Actions[] actions;
    private String image_url;
    private String thumb_url;
    private String footer;
    private String footer_icon;
    @SerializedName("ts")
    private Long time_stamp;

    public static Attachments vridgeTemplate(String fallback, String color, String title, Fields[] fields, String footer, String footer_icon, Long time_stamp) {
        return Attachments.builder()
                .fallback(fallback)
                .color(color)
                .title(title)
                .fields(fields)
                .footer(footer)
                .footer_icon(footer_icon)
                .time_stamp(time_stamp)
                .build();
    }
}
