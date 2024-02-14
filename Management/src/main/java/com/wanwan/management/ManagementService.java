package com.wanwan.management;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ManagementService {
    private final ManagementRepository managementRepository;
    public void registerManagement(ManagementRegistrationRequest request) {
        Management management = Management.builder()
                .username(request.username())
                .email(request.email())
                .password_hash(request.password_hash())
                .build();
        // todo:check if email valid
        // todo:check if email not taken
        managementRepository.save(management);

    }
}
