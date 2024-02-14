package com.wanwan.management;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/management")
@AllArgsConstructor
public class ManagementController {
    private final ManagementService managementService;
    @PostMapping
    public void registerManagement(@RequestBody ManagementRegistrationRequest managementRegistrationRequest) {
        log.info("new user registration {}", managementRegistrationRequest );
        managementService.registerManagement(managementRegistrationRequest);
    }
}
