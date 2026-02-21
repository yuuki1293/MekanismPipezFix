package com.github.yuuki1293.mekpipezfix.mixins;

import com.github.yuuki1293.mekpipezfix.IValve;
import com.github.yuuki1293.mekpipezfix.dummy.Dummies;
import mekanism.common.capabilities.Capabilities;
import mekanism.common.registration.impl.TileEntityTypeRegistryObject;
import mekanism.common.tile.base.CapabilityTileEntity;
import mekanism.common.tile.multiblock.TileEntitySPSPort;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.common.util.LazyOptional;
import org.apache.commons.lang3.ArrayUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(value = TileEntitySPSPort.class)
public abstract class TileEntitySPSPortMixin extends CapabilityTileEntity implements IValve {
    @Unique
    private static final Capability<?>[] mekanismPipezFix$caps = {ForgeCapabilities.ENERGY, Capabilities.GAS_HANDLER};

    public TileEntitySPSPortMixin(TileEntityTypeRegistryObject<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }

    @NotNull
    @Override
    public <T> LazyOptional<T> getCapability(@NotNull Capability<T> capability, @Nullable Direction side) {
        var cap = super.getCapability(capability, side);
        if (!cap.isPresent() && ArrayUtils.contains(mekanismPipezFix$caps, capability)) {
            //noinspection unchecked
            return LazyOptional.of(() -> (T) Dummies.MAP.get(capability));
        }
        return cap;
    }
}
