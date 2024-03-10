package dev.potato.customcraftingrecipes;

import dev.potato.customcraftingrecipes.utilities.enumerations.RecipeKeys;
import dev.potato.customcraftingrecipes.utilities.enumerations.RecipeResults;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomCraftingRecipeExample extends JavaPlugin {
    private static CustomCraftingRecipeExample plugin;

    public static CustomCraftingRecipeExample getPlugin() {
        return plugin;
    }

    @Override
    public void onEnable() {
        // Initialization
        plugin = this;

        // Crafting Recipes
        registerRecipes();
    }

    private void registerRecipes() {
        // Super Potato - Crafting Table
        ShapedRecipe superPotatoRecipe = new ShapedRecipe(RecipeKeys.SUPER_POTATO.KEY, RecipeResults.SUPER_POTATO.ITEM);
        superPotatoRecipe.shape(" X ", " X ", " X ");
        superPotatoRecipe.setIngredient('X', Material.POTATO);
        Bukkit.addRecipe(superPotatoRecipe);

        // Super Duper Potato - Crafting Table
        ShapedRecipe superDuperPotatoRecipe = new ShapedRecipe(RecipeKeys.SUPER_DUPER_POTATO.KEY, RecipeResults.SUPER_DUPER_POTATO.ITEM);
        superDuperPotatoRecipe.shape("SKS", "SKS", "SKS");
        superDuperPotatoRecipe.setIngredient('S', Material.POTATO);
        superDuperPotatoRecipe.setIngredient('K', new RecipeChoice.ExactChoice(RecipeResults.SUPER_POTATO.ITEM));
        Bukkit.addRecipe(superDuperPotatoRecipe);

        // Spice - Furnace
        FurnaceRecipe spiceRecipe = new FurnaceRecipe(RecipeKeys.SPICE_FURNACE.KEY, RecipeResults.SPICE.ITEM, Material.RED_SAND, 1, 100);
        Bukkit.addRecipe(spiceRecipe);
        BlastingRecipe spiceRecipe2 = new BlastingRecipe(RecipeKeys.SPICE_BLASTING.KEY, RecipeResults.SPICE.ITEM, Material.RED_SAND, 1, 50);
        Bukkit.addRecipe(spiceRecipe2);

        // Potato Armor - Smithing Table
        SmithingTransformRecipe potatoArmorRecipe = new SmithingTransformRecipe(RecipeKeys.POTATO_ARMOR.KEY, RecipeResults.POTATO_ARMOR.ITEM,
                new RecipeChoice.MaterialChoice(Material.DUNE_ARMOR_TRIM_SMITHING_TEMPLATE),
                new RecipeChoice.MaterialChoice(Material.CHAINMAIL_HELMET),
                new RecipeChoice.ExactChoice(RecipeResults.SUPER_POTATO.ITEM));
        Bukkit.addRecipe(potatoArmorRecipe);
    }
}