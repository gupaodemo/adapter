package com.adapter.loginadapter.v2.adapters;

import com.adapter.loginadapter.ResultMsg;

/**
 * Created by Tom.
 */
public class LoginForTokenAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
