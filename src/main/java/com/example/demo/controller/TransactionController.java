package com.example.demo.controller;



import com.example.demo.service.TransactionService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/transaction")
class TransactionController {

    private final TransactionService service;



    TransactionController(TransactionService service) {
        this.service = service;

    }


    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/info/{id}")
    Mono<String> getTransactionInfoById(@PathVariable String id) {
        return service.getTransactionInfo(id);
    }


}
