package com.github.yuuki1293.mekpipezfix;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import org.slf4j.Logger;

@Mod(MekPipezFix.MODID)
public class MekPipezFix {
    public static final String MODID = "mekpipezfix";
    private static final Logger LOGGER = LogUtils.getLogger();

    public MekPipezFix(IEventBus modEventBus, ModContainer modContainer) {
    }
}
