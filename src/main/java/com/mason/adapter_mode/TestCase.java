package com.mason.adapter_mode;

import com.mason.adapter_mode.adapter.PluginAdapter;
import com.mason.adapter_mode.plugin.EnPlugin;
import com.mason.adapter_mode.plugin.impl.AppleEnPlugin;

/**
 * Created by huang_sq on 2017/8/10.
 */
public class TestCase {

    public static void main(String[] args) {
        EnPlugin enPlugin = new AppleEnPlugin();

        //我有一个英标的插头 在家里没法用哦
//        Home home = new Home(enPlugin);

        //适配器在这里充当转接头的角色
        PluginAdapter pluginAdapter = new PluginAdapter(enPlugin);

        Home home = new Home(pluginAdapter);

        home.chargeWith2Pin();
    }



}
