package com.vazil.notification.model.slack.composition;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ConfirmObject {
    private PlainTextObject title;
    private TextObject text;
    private PlainTextObject confirm;
    private PlainTextObject deny;
    /**
     * Defines the color scheme applied to the confirm button
     * <ul>
     *     <li>primary : default value,  display the button with a green background on desktop, or blue text on mobile </li>
     *     <li>danger : display the button with a red background on desktop, or red text on mobile</li>
     * </ul>
     */
    private String style;
}
