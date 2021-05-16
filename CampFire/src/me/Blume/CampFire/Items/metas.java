package me.Blume.CampFire.Items;


import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class metas {
	public int seviye,dizindex;
	public Enchantment[] armorenchant = {Enchantment.PROTECTION_ENVIRONMENTAL,
									Enchantment.DURABILITY,
									Enchantment.THORNS,
									Enchantment.MENDING};
	public Enchantment[] pickaxeenchant = {Enchantment.DURABILITY,
			 							   Enchantment.MENDING,
			 							  Enchantment.DIG_SPEED,
			 							 Enchantment.LOOT_BONUS_BLOCKS};
	public Enchantment[] shovelenchant = {Enchantment.DURABILITY,
										  Enchantment.MENDING,
										  Enchantment.DIG_SPEED};
	public Enchantment[] axeenchant = {Enchantment.DURABILITY,
			 						   Enchantment.MENDING,
			 						  Enchantment.DIG_SPEED,
			 						 Enchantment.LOOT_BONUS_MOBS};
	public Enchantment[] swordenchant = {Enchantment.DURABILITY,
								  Enchantment.MENDING,
								  Enchantment.DAMAGE_ALL,
								  Enchantment.LOOT_BONUS_MOBS,
								  Enchantment.FIRE_ASPECT,
								  Enchantment.KNOCKBACK};
	public Enchantment[] bowenchant = {Enchantment.DURABILITY,
								Enchantment.MENDING,
								Enchantment.DIG_SPEED,
								Enchantment.ARROW_DAMAGE,
								Enchantment.ARROW_FIRE,
								Enchantment.ARROW_INFINITE};
	
	public void helmetmeta(ItemStack helmet) {
		ItemMeta meta = helmet.getItemMeta();
		meta.addEnchant(armorenchant[dizindex], seviye, true);
		helmet.setItemMeta(meta);
	}
	public void leggingsmeta(ItemStack leggings) {
		ItemMeta meta = leggings.getItemMeta();
		meta.addEnchant(armorenchant[dizindex], seviye, true);
		leggings.setItemMeta(meta);
	}
	public void chestplatemeta(ItemStack chestplate) {
		ItemMeta meta = chestplate.getItemMeta();
		meta.addEnchant(armorenchant[dizindex], seviye, true);
		chestplate.setItemMeta(meta);
	}
	public void bootsmeta(ItemStack boots) {
		ItemMeta meta = boots.getItemMeta();
		meta.addEnchant(armorenchant[dizindex], seviye, true);
		boots.setItemMeta(meta);
	}
	public void swordmeta(ItemStack sword) {
		ItemMeta meta = sword.getItemMeta();
		meta.addEnchant(swordenchant[dizindex], seviye, true);
		sword.setItemMeta(meta);
	}
	public void pickaxemeta(ItemStack pickaxe) {
		ItemMeta meta = pickaxe.getItemMeta();
		meta.addEnchant(pickaxeenchant[dizindex], seviye, true);
		pickaxe.setItemMeta(meta);
	}
	public void axemeta(ItemStack axe) {
		ItemMeta meta = axe.getItemMeta();
		meta.addEnchant(axeenchant[dizindex], seviye, true);
		axe.setItemMeta(meta);
	}
	public void shovelmeta(ItemStack shovel) {
		ItemMeta meta = shovel.getItemMeta();
		meta.addEnchant(shovelenchant[dizindex], seviye, true);
		shovel.setItemMeta(meta);
	}
	public void bowmeta(ItemStack bow) {
		ItemMeta meta = bow.getItemMeta();
		meta.addEnchant(bowenchant[dizindex], seviye, true);
		bow.setItemMeta(meta);
	}
}
