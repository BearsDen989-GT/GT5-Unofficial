package bde.loaders.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_ModHandler;
import ic2.core.Ic2Items;

public class BDE_CraftingRecipeLoader implements Runnable {

    private static final String aTextIron1 = "X X";
    private static final String aTextIron2 = "XXX";
    private static final long bits_no_remove_buffered = GT_ModHandler.RecipeBits.NOT_REMOVABLE
        | GT_ModHandler.RecipeBits.BUFFERED;
    private static final long bits = GT_ModHandler.RecipeBits.NOT_REMOVABLE | GT_ModHandler.RecipeBits.REVERSIBLE
        | GT_ModHandler.RecipeBits.BUFFERED;
    private static final String aTextPlateWrench = "PwP";

    @Override
    public void run() {
        // BDE Changes Torch Recipe from Lignite Coal
        GT_ModHandler.addCraftingRecipe(
            new ItemStack(Blocks.torch, 2),
            bits_no_remove_buffered,
            new Object[] { "C", "S", 'C', OrePrefixes.dust.get(Materials.Lignite), 'S',
                OrePrefixes.stick.get(Materials.Wood) });
        GT_ModHandler.addCraftingRecipe(
            new ItemStack(Blocks.torch, 2),
            bits_no_remove_buffered,
            new Object[] { "C", "S", 'C', OrePrefixes.dustImpure.get(Materials.Lignite), 'S',
                OrePrefixes.stick.get(Materials.Wood) });
        GT_ModHandler.addCraftingRecipe(
            new ItemStack(Blocks.torch, 2),
            bits_no_remove_buffered,
            new Object[] { "C", "S", 'C', OrePrefixes.crushed.get(Materials.Lignite), 'S',
                OrePrefixes.stick.get(Materials.Wood) });
        GT_ModHandler.addCraftingRecipe(
            new ItemStack(Blocks.torch, 2),
            bits_no_remove_buffered,
            new Object[] { "C", "S", 'C', OrePrefixes.gem.get(Materials.Lignite), 'S',
                OrePrefixes.stick.get(Materials.Wood) });
        // BDE Changes Torch from Coal dust and crushed Coal
        GT_ModHandler.addCraftingRecipe(
            new ItemStack(Blocks.torch, 4),
            bits_no_remove_buffered,
            new Object[] { "C", "S", 'C', OrePrefixes.dust.get(Materials.Coal), 'S',
                OrePrefixes.stick.get(Materials.Wood) });
        GT_ModHandler.addCraftingRecipe(
            new ItemStack(Blocks.torch, 4),
            bits_no_remove_buffered,
            new Object[] { "C", "S", 'C', OrePrefixes.dustImpure.get(Materials.Coal), 'S',
                OrePrefixes.stick.get(Materials.Wood) });
        GT_ModHandler.addCraftingRecipe(
            new ItemStack(Blocks.torch, 4),
            bits_no_remove_buffered,
            new Object[] { "C", "S", 'C', OrePrefixes.crushed.get(Materials.Coal), 'S',
                OrePrefixes.stick.get(Materials.Wood) });
        // BDE Changes Torch from Sulfur dust and crushed Sulfur
        GT_ModHandler.addCraftingRecipe(
            new ItemStack(Blocks.torch, 2),
            bits_no_remove_buffered,
            new Object[] { "C", "S", 'C', OrePrefixes.dustImpure.get(Materials.Sulfur), 'S',
                OrePrefixes.stick.get(Materials.Wood) });
        GT_ModHandler.addCraftingRecipe(
            new ItemStack(Blocks.torch, 2),
            bits_no_remove_buffered,
            new Object[] { "C", "S", 'C', OrePrefixes.crushed.get(Materials.Sulfur), 'S',
                OrePrefixes.stick.get(Materials.Wood) });
        // BDE Changes easy Drain Cover recipe (BDE08)
        GT_ModHandler.addCraftingRecipe(
            ItemList.Cover_Drain.get(1),
            bits_no_remove_buffered,
            new Object[] { "BBB", "BIB", "BBB", 'I', OrePrefixes.ingot.get(Materials.AnyIron), 'B',
                new ItemStack(Blocks.iron_bars, 1) });
        // BDE Changes Lapotron Crystal from Sapphire
        GT_ModHandler.addCraftingRecipe(
            Ic2Items.lapotronCrystal.copy(),
            bits_no_remove_buffered,
            new Object[] { "LCL", "LGL", "LCL", 'L', OrePrefixes.dust.get(Materials.Lapis), 'G',
                OrePrefixes.gem.get(Materials.Sapphire), 'C', OrePrefixes.circuit.get(Materials.Advanced) });
    }
}
