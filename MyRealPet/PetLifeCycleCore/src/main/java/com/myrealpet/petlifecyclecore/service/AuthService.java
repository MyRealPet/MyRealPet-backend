package com.myrealpet.petlifecyclecore.service;

public interface AuthService {
    Long getAccountIdFromToken(String authorizedHeader);
}
