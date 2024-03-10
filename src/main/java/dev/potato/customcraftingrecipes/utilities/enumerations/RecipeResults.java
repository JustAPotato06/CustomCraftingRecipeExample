package dev.potato.customcraftingrecipes.utilities.enumerations;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.format.TextDecoration;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.List;

public enum RecipeResults {
    SUPER_POTATO(getSuperPotato()),
    SUPER_DUPER_POTATO(getSuperDuperPotato()),
    SPICE(getSpice()),
    POTATO_ARMOR(getPotatoArmor());

    public final ItemStack ITEM;

    RecipeResults(ItemStack ITEM) {
        this.ITEM = ITEM;
    }

    private static ItemStack getSuperPotato() {
        ItemStack superPotato = new ItemStack(Material.POISONOUS_POTATO);
        ItemMeta superPotatoMeta = superPotato.getItemMeta();
        superPotatoMeta.displayName(Component.text("Super Potato!", NamedTextColor.GREEN).decorate(TextDecoration.BOLD));
        superPotatoMeta.lore(List.of(Component.text("This potato will"), Component.text("give you superpowers.")));
        superPotato.setItemMeta(superPotatoMeta);
        return superPotato;
    }

    private static ItemStack getSuperDuperPotato() {
        ItemStack superDuperPotato = new ItemStack(Material.POISONOUS_POTATO);
        ItemMeta superDuperPotatoMeta = superDuperPotato.getItemMeta();
        superDuperPotatoMeta.addEnchant(Enchantment.CHANNELING, 1, false);
        superDuperPotatoMeta.displayName(Component.text("Super Duper Potato!", NamedTextColor.AQUA).decorate(TextDecoration.BOLD));
        superDuperPotatoMeta.lore(List.of(Component.text("This potato will"), Component.text("give you superduperpowers.")));
        superDuperPotato.setItemMeta(superDuperPotatoMeta);
        return superDuperPotato;
    }

    private static ItemStack getSpice() {
        ItemStack spice = new ItemStack(Material.GLOWSTONE_DUST);
        ItemMeta spiceMeta = spice.getItemMeta();
        spiceMeta.displayName(Component.text("Spice", NamedTextColor.RED));
        spice.setItemMeta(spiceMeta);
        return spice;
    }

    private static ItemStack getPotatoArmor() {
        ItemStack potatoArmor = new ItemStack(Material.CHAINMAIL_HELMET);
        ItemMeta potatoArmorMeta = potatoArmor.getItemMeta();
        potatoArmorMeta.displayName(Component.text("Potato Helmet"));
        potatoArmor.setItemMeta(potatoArmorMeta);
        return potatoArmor;
    }
}