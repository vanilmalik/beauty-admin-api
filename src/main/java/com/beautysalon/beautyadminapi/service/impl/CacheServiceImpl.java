package com.beautysalon.beautyadminapi.service.impl;

import com.beautysalon.beautyadminapi.exception.CacheNotFoundException;
import com.beautysalon.beautyadminapi.service.CacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Service;

import java.util.Objects;

import static java.util.Objects.isNull;

@Service
public class CacheServiceImpl implements CacheService {

    @Autowired
    private CacheManager cacheManager;

    @Override
    public void doClearAllCaches() {
        cacheManager.getCacheNames().forEach(cacheName -> Objects.requireNonNull(cacheManager.getCache(cacheName)).clear());
    }

    @Override
    public void doClearCacheBy(String cacheName) {
        Cache cache = cacheManager.getCache(cacheName);
        if (isNull(cache)) {
            throw new CacheNotFoundException();
        }
        cache.clear();
    }

}
