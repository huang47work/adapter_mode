package com.mason.adapter_mode.adapter;

import com.mason.adapter_mode.plugin.CnPlugin;
import com.mason.adapter_mode.plugin.EnPlugin;

/**
 * Created by huang_sq on 2017/8/10.
 */
public class PluginAdapter implements CnPlugin {

    private EnPlugin enPlugin;

    public PluginAdapter(EnPlugin enPlugin) {
        this.enPlugin = enPlugin;
    }

    public void chargeWith2Pin() {
        enPlugin.chargeWith3Pin();
    }
}
