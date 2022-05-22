package com.micropos.carts;

import com.micropos.carts.model.Cart;
import com.micropos.carts.model.Order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;


@SpringBootApplication
@EnableEurekaClient
public class CartsApplication {
    private static final Logger log = LoggerFactory.getLogger(CartsApplication.class);
    public static void main(String args[]) {
        SpringApplication.run(CartsApplication.class, args);

    }

//    @Bean
//    public Supplier<Loan> supplyLoan() {
//
//        Supplier<Loan> loanSupplier = () -> {
//            Loan loan = new Loan(UUID.randomUUID().toString(),
//                    names.get(new Random().nextInt(names.size())),
//                    amounts.get(new Random().nextInt(amounts.size())));
//            log.info("{} {} for ${} for {}", loan.getStatus(), loan.getUuid(), loan.getAmount(), loan.getName());
//            return loan;
//        };
//
//        return loanSupplier;
//    }


}
