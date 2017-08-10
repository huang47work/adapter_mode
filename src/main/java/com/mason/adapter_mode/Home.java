package com.mason.adapter_mode;

import com.mason.adapter_mode.plugin.CnPlugin;

/**
 * Created by huang_sq on 2017/8/10.
 *
 */
public class Home {

    private CnPlugin cnPlugin;

    public Home(CnPlugin cnPlugin) {
        this.cnPlugin = cnPlugin;
    }

    public void chargeWith2Pin() {
        cnPlugin.chargeWith2Pin();
    }


}
