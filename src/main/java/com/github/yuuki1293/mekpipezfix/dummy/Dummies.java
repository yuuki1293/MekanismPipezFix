package com.github.yuuki1293.mekpipezfix.dummy;

import de.maxhenkel.pipez.utils.DummyFluidHandler;
import de.maxhenkel.pipez.utils.DummyItemHandler;
import net.neoforged.neoforge.capabilities.BlockCapability;
import mekanism.common.capabilities.Capabilities;

import java.util.HashMap;
import java.util.Map;

public class Dummies {
    public static Map<BlockCapability<?, ?>, Object> MAP = new HashMap<>();

    static {
        MAP.put(Capabilities.ITEM.block(), DummyItemHandler.INSTANCE);
        MAP.put(Capabilities.FLUID.block(), DummyFluidHandler.INSTANCE);
        MAP.put(Capabilities.ENERGY.block(), DummyEnergyStorage.INSTANCE);
        MAP.put(Capabilities.CHEMICAL.block(), DummyChemicalHandler.INSTANCE);
    }
}
