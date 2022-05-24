package com.improving;


import io.micronaut.context.annotation.Property;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import jakarta.inject.Inject;

@Controller("/hello")
public class HelloController {

        @Inject // required to inject into private variables when natively compiled
        @Property(name = "app.greeting")
        private String greeting;

        private final String baseText;

        public HelloController(@Property(name = "app.basetext") String txt) {
            this.baseText = txt;
        }

        @Get
        @Produces(MediaType.TEXT_PLAIN)
        public String index() {
            return baseText + " " + greeting;
        }
}
