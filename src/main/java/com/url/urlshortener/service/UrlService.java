package com.url.urlshortener.service;

import com.url.urlshortener.model.Url;
import com.url.urlshortener.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UrlService {

    @Autowired
    private UrlRepository urlRepository;

    public Url shortenUrl(String originalUrl) {
        Url url = new Url();
        url.setOriginalUrl(originalUrl);
        url.setShortUrl(UUID.randomUUID().toString().substring(0, 6));
        url.setClicks(0);
        return urlRepository.save(url);
    }

    public Url getByShortUrl(String shortUrl) {
        return urlRepository.findByShortUrl(shortUrl);
    }

    public void save(Url url) {
        urlRepository.save(url);
    }
}
