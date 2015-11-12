/*
 * Copyright 2015 Sam Sun <me@samczsun.com>
 *
 * This file is part of Skype4J.
 *
 * Skype4J is free software: you can redistribute it and/or modify it under the terms of the GNU General Public
 * License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any later
 * version.
 *
 * Skype4J is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the
 * implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public
 * License for more details.
 *
 * You should have received a copy of the GNU General Public License along with Skype4J.
 * If not, see http://www.gnu.org/licenses/.
 */

package com.samczsun.skype4j.events.chat;

import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.events.Event;

/**
 * Represents an event which involves a particular chat
 */
public abstract class ChatEvent extends Event {
    private final Chat chat;

    public ChatEvent(Chat c) {
        this.chat = c;
    }

    /**
     * Get the chat associated with this event
     *
     * @return The chat
     */
    public Chat getChat() {
        return chat;
    }
}
