package com.jeffcaijf.ibm.odm.rest.utils;

import org.apache.http.client.HttpClient;

/**
 * Created by jeff on 2/27/17.
 */
public class HttpUtils {

    private static HttpClient client = null;

    public static HttpClient getClient() {

        return client;
    }

}
