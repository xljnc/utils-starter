package com.wt.openfeign.util;

import java.net.URI;

/**
 * @author qiyu
 * @date 2021/1/4
 */
public class UriUtil {

    public static URI convert(String uri) {
        try {
            URI result = new URI(uri);
            return result;
        } catch (Exception e) {
            throw new RuntimeException(String.format("URI转换失败:%s", uri), e);
        }
    }
}
