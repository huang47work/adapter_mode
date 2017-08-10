package com.mason.adapter_mode.plugin.impl;

import com.mason.adapter_mode.plugin.EnPlugin;

/**
 * Created by huang_sq on 2017/8/10.
 */
public class AppleEnPlugin implements EnPlugin {
    public void chargeWith3Pin() {
        System.out.println("在用英标3头充电");
    }
}
