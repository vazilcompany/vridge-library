package com.vazil.notification.model.slack.block;

/**
 * See <a href="https://api.slack.com/reference/block-kit/blocks">Layout blocks</a>
 */
public interface Block {
    String getType();
    String getBlock_id();
}