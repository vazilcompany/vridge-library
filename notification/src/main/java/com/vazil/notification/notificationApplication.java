package com.vazil.notification;

import com.vazil.notification.model.slack.block.LayoutBlock;
import com.vazil.notification.model.slack.SlackPayload;
import com.vazil.notification.model.slack.block.ActionBlock;
import com.vazil.notification.model.slack.block.SectionBlock;
import com.vazil.notification.model.slack.composition.MarkdownObject;
import com.vazil.notification.model.slack.element.BlockElement;
import com.vazil.notification.model.slack.element.ButtonElement;
import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Log4j2
public class notificationApplication {
    public static void main(String[] args) {
        SpringApplication.run(notificationApplication.class, args);

        SlackPayload payload = SlackPayload.builder()
                .blocks(new LayoutBlock[]{ActionBlock.builder().build()})
                .build();

        SectionBlock sectionBlock = SectionBlock.builder()
                .block_id("example_block_id")
                .text(MarkdownObject.builder()
                        .text("*This* is some example text.")
                        .build())
                .build();


        ActionBlock actionBlock = ActionBlock.builder()
                        .elements(new BlockElement[] {ButtonElement.builder().build()})
                                .build();



        log.info(payload.getBlocks().toString());
    }

}
