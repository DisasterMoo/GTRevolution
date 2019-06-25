package gtrevolution.jei;

import com.google.common.collect.Lists;
import gregtech.integration.jei.multiblock.MultiblockInfoRecipeWrapper;
import gtrevolution.GTRevolution;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.IModRegistry;
import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.gui.IRecipeLayout;
import mezz.jei.api.ingredients.IIngredients;
import mezz.jei.api.recipe.IRecipeCategory;
import mezz.jei.gui.recipes.RecipeLayout;
import net.minecraft.client.resources.I18n;

public class MultiblockInfoCategory implements IRecipeCategory<MultiblockInfoRecipeWrapper> {
	private final IDrawable background;

    public MultiblockInfoCategory(IJeiHelpers helpers) {
        this.background = helpers.getGuiHelper().createBlankDrawable(176, 166);
    }

    public static void registerRecipes(IModRegistry registry) {
    	registry.addRecipes(Lists.newArrayList(
                new MultiblockInfoRecipeWrapper(new IndustrialMaceratorInfo()),
                new MultiblockInfoRecipeWrapper(new IndustrialOreWasherInfo()),
                new MultiblockInfoRecipeWrapper(new IndustrialThermalCentrifugeInfo()),
                new MultiblockInfoRecipeWrapper(new IndustrialCentrifugeInfo()),
                new MultiblockInfoRecipeWrapper(new IndustrialChemicalReactorInfo()),
                new MultiblockInfoRecipeWrapper(new IndustrialElectrolyzerInfo()),
                new MultiblockInfoRecipeWrapper(new IndustrialFisherInfo()),
                new MultiblockInfoRecipeWrapper(new ImprovedBlastFurnaceInfo()),
                new MultiblockInfoRecipeWrapper(new IndustrialWiremillInfo()),
                new MultiblockInfoRecipeWrapper(new OilRigInfo()),
                new MultiblockInfoRecipeWrapper(new IndustrialSifterInfo())
        ), "gtrevolution:multiblock_info");
    }

    @Override
    public String getUid() {
        return "gtrevolution:multiblock_info";
    }

    @Override
    public String getTitle() {
        return I18n.format("gregtech.multiblock.title");
    }

    @Override
    public String getModName() {
        return GTRevolution.MODID;
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public void setRecipe(IRecipeLayout recipeLayout, MultiblockInfoRecipeWrapper recipeWrapper, IIngredients ingredients) {
        recipeWrapper.setRecipeLayout((RecipeLayout) recipeLayout);
    }
}

