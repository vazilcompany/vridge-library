package com.vazil.notification;

import com.vazil.notification.model.mattermost.Attachments;
import com.vazil.notification.model.mattermost.Fields;
import com.vazil.notification.model.mattermost.MattermostPayload;
import com.vazil.notification.model.slack.SlackAttachments;
import com.vazil.notification.model.slack.SlackPayload;
import com.vazil.notification.model.slack.block.Block;
import com.vazil.notification.model.slack.block.ContextBlock;
import com.vazil.notification.model.slack.block.HeaderBlock;
import com.vazil.notification.model.slack.block.SectionBlock;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Component
@Data
public class VridgeTemplate {

    private static final String username = "브릿지 봇";
    private static final String iconUrl = "https://cf.channel.io/pub-file/85296/6385bee201c87b30b8a6/vbotface.png";
    private static final String footer = "Vridge";
    private static final String footerIcon = "https://vridge.vazil.me/logo_v2/s01.png";
    private static final Long ts = LocalDateTime.now(ZoneId.of("Asia/Seoul")).toInstant(ZoneOffset.of("+09:00")).toEpochMilli();
    private static final String ts2 = "Vridge | " + LocalDateTime.now(ZoneId.of("Asia/Seoul")).format(DateTimeFormatter.ofPattern("a hh:mm"));

    /*
    Mattermost
     */
    public static String mattermostTemplate(String fallback, String title, String color, List<Fields> fields) {
        Attachments attachments = Attachments.vridgeTemplate(fallback, color, title, fields != null ? fields.toArray(new Fields[0]) : null, footer, footerIcon, ts);
        return MattermostPayload.vridgeTemplate(username, iconUrl, null, new Attachments[]{attachments});
    }

    public static String mattermostInfo(String fallback, String title, List<Fields> fields) {
        return mattermostTemplate(fallback, title, "#009944", fields);
    }

    public static String mattermostError(String fallback, String title, List<Fields> fields) {
        return mattermostTemplate(fallback, title, "#cf000f", fields);
    }

    public static String mattermostWarning(String fallback, String title, List<Fields> fields) {
        return mattermostTemplate(fallback, title, "#f0541e", fields);
    }

    /*
    Slack
     */
    public static String slackTemplate(String text, String header, String color, List<SectionBlock> sectionBlocks) {
        HeaderBlock headerBlock = HeaderBlock.header(header);
        ContextBlock footerBlock = ContextBlock.footer(footerIcon, footer, ts2);
        List<Block> attachBlock = new ArrayList<>();
        if (sectionBlocks != null) {
            for (SectionBlock section : sectionBlocks) {
                attachBlock.add(section);
            }
        }
        attachBlock.add(footerBlock);

        SlackAttachments attachments = SlackAttachments.vridgeTemplate(color, attachBlock.toArray(new Block[0]));
        return SlackPayload.vridgeTemplate(username, iconUrl, text, new Block[]{headerBlock}, new SlackAttachments[]{attachments});
    }

    public static String slackInfo(String text, String header, List<SectionBlock> sectionBlocks) {
        return slackTemplate(text, header, "#009944", sectionBlocks);
    }

    public static String slackError(String text, String header, List<SectionBlock> sectionBlocks) {
        return slackTemplate(text, header, "#cf000f", sectionBlocks);
    }

    public static String slackWarning(String text, String header, List<SectionBlock> sectionBlocks) {
        return slackTemplate(text, header, "#f0541e", sectionBlocks);
    }

}
