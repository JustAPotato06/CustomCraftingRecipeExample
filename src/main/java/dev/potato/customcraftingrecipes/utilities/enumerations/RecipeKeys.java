package dev.potato.customcraftingrecipes.utilities.enumerations;

import dev.potato.customcraftingrecipes.CustomCraftingRecipeExample;
import org.bukkit.NamespacedKey;

public enum RecipeKeys {
    SUPER_POTATO(new NamespacedKey(CustomCraftingRecipeExample.getPlugin(), "super-potato")),
    SUPER_DUPER_POTATO(new NamespacedKey(CustomCraftingRecipeExample.getPlugin(), "super-duper-potato")),
    SPICE_FURNACE(new NamespacedKey(CustomCraftingRecipeExample.getPlugin(), "spice-furnace")),
    SPICE_BLASTING(new NamespacedKey(CustomCraftingRecipeExample.getPlugin(), "spice-blasting")),
    POTATO_ARMOR(new NamespacedKey(CustomCraftingRecipeExample.getPlugin(), "potato-armor"));

    public final NamespacedKey KEY;

    RecipeKeys(NamespacedKey KEY) {
        this.KEY = KEY;
    }
}