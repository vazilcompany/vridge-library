package com.vazil.notification.model.slack.composition;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class OptionGroupObject {
    private PlainTextObject label;
    private OptionObject[] options;
}
