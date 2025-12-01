package com.github.yuuki1293.mekpipezfix;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MekPipezFix.MODID)
public class MekPipezFix {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "mekpipezfix";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public MekPipezFix(IEventBus modEventBus, ModContainer modContainer) {
        // Register ourselves for server and other game events we are interested in
        // NeoForge.EVENT_BUS.register(this);

        // Register our mod's ModConfigSpec so that FML can create and load the config file for us
        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }
}
