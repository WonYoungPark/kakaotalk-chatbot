package io.github.wonyoungpark.bobjieune.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Package : io.github.wonyoungpark.bobjieune.domain
 * Developer Team : Mrblue WebPlatform Developer Team
 * Developer: wyparks2
 * Date : 2018. 1. 23.
 * Time : PM 4:24
 * Created by IntelliJ IDEA.
 */
@Getter
@Setter
@AllArgsConstructor
public class Keyboard {
    private String type;
    private List<String> buttons;
}
