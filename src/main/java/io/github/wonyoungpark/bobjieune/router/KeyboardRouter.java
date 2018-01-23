package io.github.wonyoungpark.bobjieune.router;

import io.github.wonyoungpark.bobjieune.domain.Keyboard;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import java.util.Arrays;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
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
//    private static final String URI_VERSION     = "/v1";
    private static final String URI_VERSION     = "";
    private static final String URI_PATH        = "/keyboard";

    @Bean
    public RouterFunction<ServerResponse> keboardRouterFunction() {
        return nest(path(URI_VERSION + URI_PATH),
                    nest(accept(MediaType.APPLICATION_JSON),
                        route(GET("").and(accept(MediaType.APPLICATION_JSON)), (request) -> ServerResponse.ok().syncBody(
                            new Keyboard("buttons", Arrays.asList("선택 1", "선택 2", "선택 3")))))
        );
    }

}
