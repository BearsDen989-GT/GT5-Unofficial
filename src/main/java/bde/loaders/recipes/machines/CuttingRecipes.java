package bde.loaders.recipes.machines;

import static gregtech.api.util.GT_RecipeBuilder.MINUTES;
import static gregtech.api.util.GT_RecipeBuilder.SECONDS;

import net.minecraft.item.ItemStack;

import gregtech.api.enums.ItemList;

public class CuttingRecipes extends gregtech.loaders.postload.recipes.CuttingRecipes {

    @Override
    public void run() {
        BouleCutting();
        WaferCutting();
    }

    public void BouleCutting() {
        // BDE Changes
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Silicon_Ingot.get(1) },
            new ItemStack[] { ItemList.Circuit_Silicon_Wafer.get(16), },
            10 * SECONDS,
            8,
            false);

        // BDE Changes
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Silicon_Ingot2.get(1) },
            new ItemStack[] { ItemList.Circuit_Silicon_Wafer2.get(16), },
            20 * SECONDS,
            65,
            true);
        // BDE Changes
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Silicon_Ingot3.get(1) },
            new ItemStack[] { ItemList.Circuit_Silicon_Wafer3.get(16), },
            40 * SECONDS,
            384,
            true);
    }

    public void WaferCutting() {
        CircuitComponentCutting();
        SoCCutting();
        PICCutting();
    }

    public void CircuitComponentCutting() {
        // Integrated Logic Circuit (ILC)
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_ILC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_ILC.get(8), },
            1 * MINUTES + 30 * SECONDS,
            64,
            false);
        // Ram
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_Ram.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_Ram.get(32), },
            1 * MINUTES + 30 * SECONDS,
            96,
            false);
        // NAND
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_NAND.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_NAND.get(32), },
            1 * MINUTES + 30 * SECONDS,
            192,
            true);
        // NOR
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_NOR.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_NOR.get(32), },
            1 * MINUTES + 30 * SECONDS,
            192,
            true);
        // CPU
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_CPU.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_CPU.get(8), },
            1 * MINUTES + 30 * SECONDS,
            120,
            false);
        // NanoCPU
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_NanoCPU.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_NanoCPU.get(8), },
            1 * MINUTES + 30 * SECONDS,
            480,
            true);
        // QBit
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_QuantumCPU.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_QuantumCPU.get(4), },
            1 * MINUTES + 30 * SECONDS,
            1_920,
            true);
    }

    public void SoCCutting() {
        // Simple SoC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_Simple_SoC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_Simple_SoC.get(6), },
            1 * MINUTES + 30 * SECONDS,
            64,
            false);
        // SoC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_SoC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_SoC.get(6), },
            1 * MINUTES + 30 * SECONDS,
            480,
            true);
        // ASoC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_SoC2.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_SoC2.get(6), },
            1 * MINUTES + 30 * SECONDS,
            1_024,
            true);
    }

    public void PICCutting() {
        // ULPIC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_ULPIC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_ULPIC.get(6), },
            1 * MINUTES + 30 * SECONDS,
            120,
            false);
        // LPIC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_LPIC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_LPIC.get(4), },
            1 * MINUTES + 30 * SECONDS,
            480,
            false);
        // PIC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_PIC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_PIC.get(4), },
            1 * MINUTES + 30 * SECONDS,
            1_920,
            true);
        // HPIC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_HPIC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_HPIC.get(2), },
            1 * MINUTES + 30 * SECONDS,
            7_680,
            true);
        // UHPIC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_UHPIC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_UHPIC.get(2), },
            1 * MINUTES + 30 * SECONDS,
            30_720,
            true);
        // NPIC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_NPIC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_NPIC.get(2), },
            1 * MINUTES + 30 * SECONDS,
            122_880,
            true);
        // PPIC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_PPIC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_PPIC.get(2), },
            1 * MINUTES + 30 * SECONDS,
            491_520,
            true);
        // QPIC
        recipeWithClassicFluids(
            new ItemStack[] { ItemList.Circuit_Wafer_QPIC.get(1) },
            new ItemStack[] { ItemList.Circuit_Chip_QPIC.get(2), },
            1 * MINUTES + 30 * SECONDS,
            1_966_080,
            true);
    }

}
