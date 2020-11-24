package com.kiscode.proxy;

import java.util.Map;

/****
 * Description:
 * Author:  keno
 * CreateDate: 2020/11/24 21:48
 */
public class VolleyRequest implements IHttpRequest {
    private static final String TAG = "Volley";

    @Override
    public void get(String url) {
        System.out.println(TAG + "\t" + "GET");

    }

    @Override
    public void post(String url, Map<String, String> param) {
        System.out.println(TAG + "\t" + "POST");

    }

    @Override
    public void put(String url, Map<String, String> param) {
        System.out.println(TAG + "\t" + "PUT");

    }

    @Override
    public void delete(String url) {
        System.out.println(TAG + "\t" + "DELETE");
    }
}
