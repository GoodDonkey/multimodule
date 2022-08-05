package com.donkey.multimodule.service1;


import com.donkey.core.events.SomeThingHappened;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Service1Service {
    void doThis() {
        new SomeThingHappened();
        log.info("happened");
    }
}
