package com.vazil.notification.model.mattermost;

import lombok.Builder;
import lombok.Data;

/**
 * An array of message attachments that can be included in the Mattermost notification payload.
 * <p>
 * See also <a href="https://developers.mattermost.com/integrate/plugins/interactive-messages/">Mattermost Interactive messages</a>
 * </p>
 */
@Data
@Builder
public class Actions {
    private String id;
    private String name;
    private String text;
    private Integration integration;
    /**
     * The type of action. Possible values are:
     * <ul>
     *     <li>button</li>
     *     <li>select</li>
     * </ul>
     *
     * Note more value can be exist.
     */
    private String type;
    /**
     * The style of the action. Possible values are:
     * <ul>
     * <li>default</li>
     * <li>primary</li>
     * <li>warning</li>
     * <li>success</li>
     * <li>danger</li>
     * </ul>
     */
    private String style;
    private Confirm confirm;
    private String data_source;
    private Options[] options;
}