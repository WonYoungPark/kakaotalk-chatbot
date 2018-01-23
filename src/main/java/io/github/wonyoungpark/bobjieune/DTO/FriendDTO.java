package io.github.wonyoungpark.bobjieune.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Created by One0 on 2018. 1. 23..
 */
public class FriendDTO {
    @Getter
    @Setter
    public static class Create {
        @NotNull
        private String user_key; // 유저 식별키
    }

    @Getter
    @Setter
    public static class Delete {
        @NotNull
        private String user_key; // 유저 식별키
    }
}
