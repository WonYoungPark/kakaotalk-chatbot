package io.github.wonyoungpark.bobjieune.handler;

import io.github.wonyoungpark.bobjieune.DTO.KeyboardDTO;
import io.github.wonyoungpark.bobjieune.vo.Keyboard;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Arrays;

/**
 * Created by One0 on 2018. 1. 24..
 */
@Component
@Slf4j
public class KeyboardHandler {
    public Mono<ServerResponse> get(ServerRequest request) {
        return ServerResponse.ok().body((body) ->
            new Keyboard("buttons", Arrays.asList("선택 1", "선택 2", "선택 3")), Keyboard.class).log();
    }
}
