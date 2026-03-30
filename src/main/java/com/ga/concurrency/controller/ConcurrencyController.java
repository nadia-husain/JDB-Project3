package com.ga.concurrency.controller;

import com.ga.concurrency.service.ConcurrencyService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/concurrency")
public class ConcurrencyController {
    private final ConcurrencyService concurrencyService;

    public ConcurrencyController(ConcurrencyService concurrencyService) {
        this.concurrencyService = concurrencyService;
    }
}
