package com.adapter.loginadapter.v2.adapters;

import com.adapter.loginadapter.ResultMsg;

/**
 * Created by Tom on 2019/3/16.
 */
public class RegistForQQAdapter implements RegistAdapter,LoginAdapter {
    public boolean support(Object adapter) {
        return false;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
