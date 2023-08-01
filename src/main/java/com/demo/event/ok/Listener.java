package com.demo.event.ok;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @EventListener
    public void eventListener(Event event) throws InterruptedException {
        Thread.sleep(1000L);

        System.out.println(Thread.currentThread().getName() + " Phát hiện Event!!");
        System.out.println(String.format("Đang xử lý tác vụ sau khi phát hiện event",
                Thread.currentThread().getName()));
    }
}
