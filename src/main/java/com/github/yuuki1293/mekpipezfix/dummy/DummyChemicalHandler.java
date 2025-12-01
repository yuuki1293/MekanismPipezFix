package com.github.yuuki1293.mekpipezfix.dummy;

import mekanism.api.Action;
import mekanism.api.chemical.ChemicalStack;
import mekanism.api.chemical.IChemicalHandler;
import org.jetbrains.annotations.NotNull;

public class DummyChemicalHandler implements IChemicalHandler {
    public static final DummyChemicalHandler INSTANCE = new DummyChemicalHandler();

    @Override
    public int getChemicalTanks() {
        return 0;
    }

    @Override
    public @NotNull ChemicalStack getChemicalInTank(int tank) {
        return ChemicalStack.EMPTY;
    }

    @Override
    public void setChemicalInTank(int tank, @NotNull ChemicalStack stack) {

    }

    @Override
    public long getChemicalTankCapacity(int tank) {
        return 0;
    }

    @Override
    public boolean isValid(int tank, @NotNull ChemicalStack stack) {
        return false;
    }

    @Override
    public @NotNull ChemicalStack insertChemical(int tank, @NotNull ChemicalStack stack, @NotNull Action action) {
        return stack;
    }

    @Override
    public @NotNull ChemicalStack extractChemical(int tank, long amount, @NotNull Action action) {
        return ChemicalStack.EMPTY;
    }
}
