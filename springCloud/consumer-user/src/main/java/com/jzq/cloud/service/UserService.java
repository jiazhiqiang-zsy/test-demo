package com.jzq.cloud.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient("PROVIDE-TICKET")
public interface UserService {
    @GetMapping("/ticket")
    public String getTicket();
}
