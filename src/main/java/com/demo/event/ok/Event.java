package com.demo.event.ok;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class Event extends ApplicationEvent {
    public Event(Object source) {
        super(source);
    }
}
