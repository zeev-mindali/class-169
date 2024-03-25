package com.jb.msservicea.web;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;


@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class MyController {


    @Value("${service.b.url}")
    private String bUrl;

    private final RestTemplate restTemplate;

    private static final String A_INFO = "aInformation";
    private int count = 1;

    @RateLimiter(name = A_INFO,fallbackMethod ="kokorikoFallbackRateLimiter")
    @Retry(name = A_INFO, fallbackMethod = "kokorikoFallbackRetry")
    @CircuitBreaker(name = A_INFO, fallbackMethod = "kokorikoFallbackCircuitBreaker")
    @GetMapping("service/a")
    public String whoAmI() {
        System.out.println("Retry method called " + count++ + " times at " + new Date());
        String bStr = restTemplate.getForObject(bUrl, String.class);
        return "This is A!!! calling for " + bStr;
    }


    public String kokorikoFallbackCircuitBreaker(Exception e) {
        return "Kokoriko Tarengol (THIS IS FALLBACK) form service a";
    }

    public String kokorikoFallbackRetry(Exception e) {
        return "Kokoriko Tarengol (THIS IS RETRY) form service a";
    }

    public String kokorikoFallbackRateLimiter(Exception e) {
        return "Kokoriko Tarengol (THIS IS RATE LIMITER) form service a";
    }
}
