package com.github.yuuki1293.mekpipezfix.mixins;

import com.github.yuuki1293.mekpipezfix.IValve;
import com.github.yuuki1293.mekpipezfix.dummy.Dummies;
import mekanism.common.registration.impl.TileEntityTypeRegistryObject;
import mekanism.common.tile.base.CapabilityTileEntity;
import mekanism.generators.common.tile.fusion.TileEntityFusionReactorPort;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(value = TileEntityFusionReactorPort.class)
public abstract class TileEntityFusionReactorPortMixin extends CapabilityTileEntity implements IValve {
    public TileEntityFusionReactorPortMixin(TileEntityTypeRegistryObject<?> type, BlockPos pos, BlockState state) {
        super(type, pos, state);
    }
}
