package com.donkey.multimodule.service1;


import com.donkey.multimodule.core.events.SomeThingHappened;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Service1Service implements IService1Service{
    void doThis() {
        new SomeThingHappened();
        new PackagePrivateDTO(); // 같은 모듈에 있으므로 임포트 가능 (com.donkey.multimodule.service1)
        log.info("happened");
    }
}
