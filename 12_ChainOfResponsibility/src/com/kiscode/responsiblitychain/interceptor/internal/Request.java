package com.kiscode.responsiblitychain.interceptor.internal;

import java.util.*;

/**
 * Description:
 * Author: keno
 * Date : 2021/7/20 13:55
 **/
public class Request {
    private String url;
    private Map<String, String> headers = new HashMap<>();

    public Request(String url) {
        this.url = url;
    }


    public void header(String key, String value) {
        headers.put(key, value);
    }

    @Override
    public String toString() {
        return "Request{" +
                "url='" + url + '\'' +
                ", headers=" + headers +
                '}';
    }
}
