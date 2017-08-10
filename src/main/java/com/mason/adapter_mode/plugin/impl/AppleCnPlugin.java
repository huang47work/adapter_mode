package com.mason.adapter_mode.plugin.impl;

import com.mason.adapter_mode.plugin.CnPlugin;

/**
 * Created by huang_sq on 2017/8/10.
 */
public class AppleCnPlugin implements CnPlugin {
    public void chargeWith2Pin() {
        System.out.println("在用国标两头充电");
    }
}
