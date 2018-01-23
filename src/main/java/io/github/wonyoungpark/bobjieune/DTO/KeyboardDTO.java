package io.github.wonyoungpark.bobjieune.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by One0 on 2018. 1. 23..
 */
public class KeyboardDTO {
    @Getter
    @Setter
    public static class Response {
        @NotBlank
        private String type;
        @NotNull
        private List<String> buttons;
    }
}
