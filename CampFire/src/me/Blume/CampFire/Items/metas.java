package me.Blume.CampFire.Items;

import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class metas {
	public void helmetmeta(ItemStack helmet) {
		ItemMeta meta = helmet.getItemMeta();
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
		helmet.setItemMeta(meta);
	}
	public void leggingsmeta(ItemStack leggings) {
		ItemMeta meta = leggings.getItemMeta();
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
		leggings.setItemMeta(meta);
	}
	public void chestplatemeta(ItemStack chestplate) {
		ItemMeta meta = chestplate.getItemMeta();
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
		chestplate.setItemMeta(meta);
	}
	public void bootsmeta(ItemStack boots) {
		ItemMeta meta = boots.getItemMeta();
		meta.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 100, true);
		boots.setItemMeta(meta);
	}
	public void swordmeta(ItemStack sword) {
		ItemMeta meta = sword.getItemMeta();
		meta.addEnchant(Enchantment.DAMAGE_ALL, 100, true);
		sword.setItemMeta(meta);
	}
	public void pickaxemeta(ItemStack pickaxe) {
		ItemMeta meta = pickaxe.getItemMeta();
		meta.addEnchant(Enchantment.DIG_SPEED, 100, true);
		pickaxe.setItemMeta(meta);
	}
	public void axemeta(ItemStack axe) {
		ItemMeta meta = axe.getItemMeta();
		meta.addEnchant(Enchantment.DIG_SPEED, 100, true);
		meta.addEnchant(Enchantment.DAMAGE_ALL, 100, true);
		axe.setItemMeta(meta);
	}
	public void shovelmeta(ItemStack shovel) {
		ItemMeta meta = shovel.getItemMeta();
		meta.addEnchant(Enchantment.DIG_SPEED, 100, true);
		shovel.setItemMeta(meta);
	}
	public void bowmeta(ItemStack bow) {
		ItemMeta meta = bow.getItemMeta();
		meta.addEnchant(Enchantment.ARROW_DAMAGE, 50, true);
		meta.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		bow.setItemMeta(meta);
	}
}
