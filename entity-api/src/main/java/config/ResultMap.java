package config;

import lombok.*;

/**
 * @author wRan
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultMap<T> {
    private String code;
    private String message;
    private T data;

    public ResultMap(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ResultMap<?> build(Status status) {
        return new ResultMap<>(status.getCode(), status.getReason());
    }

    public static <T> ResultMap<T> build(Status status, T data) {
        return new ResultMap<>(status.getCode(), status.getReason(), data);
    }

    public static <T> ResultMap<T> build(Status status, String message, T data) {
        return new ResultMap<>(status.getCode(), message, data);
    }

    @Getter
    @AllArgsConstructor
    @ToString
    public enum Status {
        /**
         * 100-200 : 成功状态码
         * 200+ : 失败状态码
         * {
         *     SUCCESS:未出现错误的唯一返回状态码
         *
         * }
         */
        SUCCESS("200", "成功！"),
        LOGIN_SUCCESS("201", "登录成功！"),
        FAIL("100", "失败！"),
        LOGIN_FAIL("101", "用户名或密码错误！"),
        SESSION_EXPIRED("102", "会话到期！"),
        INSUFFICIENT_PERMISSIONS("103", "权限不足！"),
        TOKEN_EXCEPTION("104", "Token异常！"),
        NOT_LOGGED_IN("105", "未登录！"),
        DUPLICATE_ACCOUNT("106", "账号重复！");

        private final String code;
        private final String reason;

    }
}