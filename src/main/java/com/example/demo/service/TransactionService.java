package com.example.demo.service;


import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class TransactionService {

    private final WebClient webClient;

    public TransactionService(WebClient.Builder builder) {
        webClient = builder.baseUrl("http://localhost:8081").build();
    }


    public Mono<String> getTransactionInfo(String id) {
        return webClient
                .get()
                .uri( "/node-0/transactions/info/" + id)
                .retrieve()
                .bodyToMono(String.class);



    }


}
