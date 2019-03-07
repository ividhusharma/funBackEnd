package com.aarpee.startfun.microservice.mailer;

import com.aarpee.startfun.dto.MailDto;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name="mailer-service", url="localhost:8100")
@RibbonClient(name="mailer-service")
public interface MailerServiceProxy {
    @RequestMapping(method= RequestMethod.POST, path="/mail/sendMail/id/{id}")
    String sendMail(@PathVariable String id);
}
