package io.github.wonyoungpark.bobjieune.DTO;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.security.Key;
import java.util.List;

/**
 * Created by One0 on 2018. 1. 23..
 */
public class MessageDTO {
    @Getter
    @Setter
    public static class Request {
        @NotBlank
        private String user_key; // 메시지를 발송한 유저 식별 키
        @NotBlank
        private String type; // text, photo
        @NotBlank
        private String content; // 자동응답 명령어의 메시지 텍스트 혹은 미디어 파일 uri
    }

    @Getter
    @Setter
    public static class Response {
        @NotNull
        private Message message; // 자동응답 명령어에 대한 응답 메시지의 내용
        private Keyboard keyboard; // 키보드 영역에 표현될 명령어 버튼에 대한 정보. 생략시 text 타입(주관식 답변 키보드)이 선택된다.

        @Getter
        @Setter
        public static class Message {
            private String text;
        }

        @Getter
        @Setter
        public static class Keyboard {
            @NotBlank
            private String type;
            @NotNull
            private List<String> buttons;
        }
    }
}
