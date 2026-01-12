package com.url.urlshortener.controller;

import com.url.urlshortener.model.Url;
import com.url.urlshortener.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UrlController {

    @Autowired
    private UrlService urlService;

    // CREATE SHORT URL
    @GetMapping("/shorten")

    public Url shorten(@RequestParam String url) {
        return urlService.shortenUrl(url);
    }

    // REDIRECT SHORT URL
    @GetMapping("/{shortUrl}")
    public ResponseEntity<?> redirect(@PathVariable String shortUrl) {

        Url url = urlService.getByShortUrl(shortUrl);

        if (url == null) {
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body("Invalid short URL");
        }

        url.setClicks(url.getClicks() + 1);
        urlService.save(url);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Location", url.getOriginalUrl());

        return new ResponseEntity<>(headers, HttpStatus.FOUND);
    }
}

