package com.h1ggsk.eflyplusplus;

import com.h1ggsk.eflyplusplus.modules.ElytraFlyPlusPlus;
import com.mojang.logging.LogUtils;
import meteordevelopment.meteorclient.addons.GithubRepo;
import meteordevelopment.meteorclient.addons.MeteorAddon;
import meteordevelopment.meteorclient.systems.modules.Category;
import meteordevelopment.meteorclient.systems.modules.Modules;
import org.slf4j.Logger;

public class EFlyPlusPlus extends MeteorAddon {
    public static final Logger LOG = LogUtils.getLogger();
    
    @Override
    public void onInitialize() {
        LOG.info("Initializing EFlyPlusPlus Meteor Addon");

        // Modules
        Modules.get().add(new ElytraFlyPlusPlus());
    }

    @Override
    public void onRegisterCategories() {
    }

    @Override
    public String getPackage() {
        return "com.h1ggsk.eflyplusplus";
    }

    @Override
    public GithubRepo getRepo() {
        return new GithubRepo("H1ggsK", "efly-plus-plus");
    }
}
