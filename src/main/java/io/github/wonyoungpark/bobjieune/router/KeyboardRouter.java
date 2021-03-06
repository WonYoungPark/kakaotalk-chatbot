package io.github.wonyoungpark.bobjieune.router;

import io.github.wonyoungpark.bobjieune.handler.KeyboardHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.nest;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * Package : io.github.wonyoungpark.bobjieune.router
 * Developer Team : Mrblue WebPlatform Developer Team
 * Developer: wyparks2
 * Date : 2018. 1. 23.
 * Time : PM 4:19
 * Created by IntelliJ IDEA.
 */
@Configuration
public class KeyboardRouter {
    private static final String URI_PATH = "/keyboard";

    @Bean
    public RouterFunction<?> keyboardRouterFunction(KeyboardHandler handler) {
        return nest(path(URI_PATH),
                    nest(accept(MediaType.APPLICATION_JSON),
                        route(GET("").and(contentType(MediaType.APPLICATION_JSON)), handler::get))
        );
    }

}
