package com.andreyplis.aggregatespringplugin;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@SpringBootApplication
public class AggregateSpringPluginApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AggregateSpringPluginApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
