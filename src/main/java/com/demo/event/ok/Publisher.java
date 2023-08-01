package com.demo.event.ok;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
    @Autowired
    ApplicationEventPublisher applicationEventPublisher;

    public void happenedEvent(){
        applicationEventPublisher.publishEvent(new Event(this));
    }
}
