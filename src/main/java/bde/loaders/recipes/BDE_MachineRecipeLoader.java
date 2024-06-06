package bde.loaders.recipes;

import bde.loaders.recipes.machines.BlastFurnaceRecipes;
import bde.loaders.recipes.machines.CircuitAssemblerRecipes;
import bde.loaders.recipes.machines.CuttingRecipes;
import bde.loaders.recipes.machines.RoasterRecipes;
import gregtech.api.enums.Materials;

public class BDE_MachineRecipeLoader implements Runnable {

    public static final Materials[] solderingMats = new Materials[] { Materials.Lead, Materials.SolderingAlloy,
        Materials.Tin };

    @Override
    public void run() {
        new BlastFurnaceRecipes().run();
        new CuttingRecipes().run();
        new CircuitAssemblerRecipes().run();
        new RoasterRecipes().run();
    }
}
