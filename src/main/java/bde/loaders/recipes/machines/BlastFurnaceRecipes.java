package bde.loaders.recipes.machines;

import static gregtech.api.recipe.RecipeMaps.blastFurnaceRecipes;
import static gregtech.api.recipe.RecipeMaps.primitiveBlastRecipes;
import static gregtech.api.util.GT_RecipeBuilder.MINUTES;
import static gregtech.api.util.GT_RecipeBuilder.SECONDS;
import static gregtech.api.util.GT_RecipeConstants.ADDITIVE_AMOUNT;
import static gregtech.api.util.GT_RecipeConstants.COIL_HEAT;

import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;

public class BlastFurnaceRecipes implements Runnable {

    @Override
    public void run() {
        registerBlastfurnaceRecipes();
        registerPrimitiveBlastFurnaceRecipes();
    }

    public void registerBlastfurnaceRecipes() {
        // BDE Changes
        // GT6.09-BDE Silicon Boule Changes requested by Bear989
        // Modified by DbpGaming, ChubbyTurtle101
        // Rebalanced silicon and materials required. Made all three boules similar in required materials and same
        // wafers.
        GT_Values.RA.stdBuilder()
            .itemInputs(
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 16),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Gallium, 1))
            .itemOutputs(ItemList.Circuit_Silicon_Ingot.get(1))
            .duration(7 * MINUTES + 30 * SECONDS)
            .eut(120)
            .metadata(COIL_HEAT, 1784)
            .addTo(blastFurnaceRecipes);

        GT_Values.RA.stdBuilder()
            .itemInputs(
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 32),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Glowstone, 1))
            .fluidInputs(Materials.Nitrogen.getGas(1000))
            .itemOutputs(ItemList.Circuit_Silicon_Ingot2.get(1))
            .duration(10 * MINUTES)
            .eut(480)
            .metadata(COIL_HEAT, 2484)
            .addTo(blastFurnaceRecipes);
        // Not sure if
        GT_Values.RA.stdBuilder()
            .itemInputs(
                GT_OreDictUnificator.get(OrePrefixes.dust, Materials.Silicon, 16),
                GT_OreDictUnificator.get(OrePrefixes.dustTiny, Materials.Naquadah, 1))
            .fluidInputs(Materials.Argon.getGas(1000))
            .itemOutputs(ItemList.Circuit_Silicon_Ingot3.get(1))
            .duration(1 * MINUTES + 30 * SECONDS)
            .eut(1920)
            .metadata(COIL_HEAT, 5400)
            .addTo(blastFurnaceRecipes);
    }

    public void registerPrimitiveBlastFurnaceRecipes() {

        // BDE Changes
        GT_Values.RA.stdBuilder()
            .itemInputs(Materials.BismuthBronze.getDust(1))
            .itemOutputs(Materials.BismuthBronze.getIngots(1))
            .duration(6 * MINUTES)
            .metadata(ADDITIVE_AMOUNT, 2)
            .addTo(primitiveBlastRecipes);
        GT_Values.RA.stdBuilder()
            .itemInputs(Materials.BlackBronze.getDust(1))
            .itemOutputs(Materials.BlackBronze.getIngots(1))
            .duration(6 * MINUTES)
            .metadata(ADDITIVE_AMOUNT, 2)
            .addTo(primitiveBlastRecipes);
        GT_Values.RA.stdBuilder()
            .itemInputs(Materials.SterlingSilver.getDust(1))
            .itemOutputs(Materials.SterlingSilver.getIngots(1))
            .duration(4 * MINUTES + 30 * SECONDS)
            .metadata(ADDITIVE_AMOUNT, 2)
            .addTo(primitiveBlastRecipes);
        GT_Values.RA.stdBuilder()
            .itemInputs(Materials.RoseGold.getDust(1))
            .itemOutputs(Materials.RoseGold.getIngots(1))
            .duration(4 * MINUTES + 30 * SECONDS)
            .metadata(ADDITIVE_AMOUNT, 2)
            .addTo(primitiveBlastRecipes);
        // TFC Steel
        GT_Values.RA.stdBuilder()
            .itemInputs(Materials.RedSteel.getDust(1))
            .itemOutputs(Materials.RedSteel.getIngots(1))
            .duration(10 * MINUTES)
            .metadata(ADDITIVE_AMOUNT, 2)
            .addTo(primitiveBlastRecipes);
        GT_Values.RA.stdBuilder()
            .itemInputs(Materials.BlackSteel.getDust(1))
            .itemOutputs(Materials.BlackSteel.getIngots(1))
            .duration(8 * MINUTES)
            .metadata(ADDITIVE_AMOUNT, 2)
            .addTo(primitiveBlastRecipes);
        GT_Values.RA.stdBuilder()
            .itemInputs(Materials.BlueSteel.getDust(1))
            .itemOutputs(Materials.BlueSteel.getIngots(1))
            .duration(10 * MINUTES)
            .metadata(ADDITIVE_AMOUNT, 2)
            .addTo(primitiveBlastRecipes);

    }

}
