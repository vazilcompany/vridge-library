package com.vazil.notification.model.slack.composition;

import com.vazil.notification.model.slack.element.Element;

public abstract class TextObject implements Element {
    public abstract String getType();
    public abstract String getText();
}
