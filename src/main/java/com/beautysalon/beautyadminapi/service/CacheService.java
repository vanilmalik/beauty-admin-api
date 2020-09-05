package com.beautysalon.beautyadminapi.service;

public interface CacheService {

    void doClearAllCaches();

    void doClearCacheBy(String cacheName);
}
