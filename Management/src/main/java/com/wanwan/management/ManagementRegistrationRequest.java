package com.wanwan.management;

public record ManagementRegistrationRequest(
        String username,
        String email,
        String password_hash) {
}
