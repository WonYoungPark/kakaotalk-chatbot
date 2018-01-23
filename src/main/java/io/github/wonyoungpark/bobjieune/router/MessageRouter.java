package io.github.wonyoungpark.bobjieune.router;

import io.github.wonyoungpark.bobjieune.vo.Keyboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Arrays;

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
public class MessageRouter {
    private static final String URI_PATH = "/message";

    @Bean
    public RouterFunction<ServerResponse> messageRouterFunction() {
        return nest(path(URI_PATH),
                    nest(accept(MediaType.APPLICATION_JSON),
                        route(GET("").and(accept(MediaType.APPLICATION_JSON)), (request) ->
                                ServerResponse.ok().contentType(MediaType.APPLICATION_JSON_UTF8)
                                        .syncBody(new Keyboard("buttons", Arrays.asList("선택 1", "선택 2", "선택 3")))))
        );
    }

}
