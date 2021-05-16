package me.Blume.CampFire.Listeners;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

import me.Blume.CampFire.Main;
import me.Blume.CampFire.Items.metas;

public class duplicate implements Listener{
	@SuppressWarnings("unused")
	private Main plugin;
	public duplicate(Main plugin) {
		this.plugin=plugin;
	}
	metas meta = new metas();

	@EventHandler
	public void doubletheitem(PlayerDropItemEvent event) {
		Player player = event.getPlayer();
		Item doubleitem = event.getItemDrop();
		Random rand = new Random();
		if(!(doubleitem.getItemStack().getType().toString().toLowerCase().contains("helmet")) &&
				!(doubleitem.getItemStack().getType().toString().toLowerCase().contains("leggings")) &&
				!(doubleitem.getItemStack().getType().toString().toLowerCase().contains("chestplate")) &&
				!(doubleitem.getItemStack().getType().toString().toLowerCase().contains("boots")) &&
				!(doubleitem.getItemStack().getType().toString().toLowerCase().contains("pickaxe")) &&
				!(doubleitem.getItemStack().getType().toString().toLowerCase().contains("axe")) &&
				!(doubleitem.getItemStack().getType().toString().toLowerCase().contains("sword")) &&
				!(doubleitem.getItemStack().getType().toString().toLowerCase().contains("shovel")) &&
				!(doubleitem.getItemStack().getType().toString().toLowerCase().contains("bow"))) {
			World world=player.getWorld();

			if(doubleitem.getLocation().getBlock().getRelative(0, 1, 0).getType()==Material.CAMPFIRE) {
		
				double speed =0.5;
				Vector direction = player.getLocation().toVector().subtract(doubleitem.getLocation().toVector());
				doubleitem.setVelocity(direction.multiply(speed));
			}

			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				@Override
				public void run() {
					if(doubleitem.getLocation().getBlock().getRelative(0, 0, 0).getType()==Material.CAMPFIRE) {
						
						world.dropItemNaturally(doubleitem.getLocation().clone().add(0, 1, 0), doubleitem.getItemStack());

						/*double speed =1;
						Vector direction = player.getLocation().toVector().subtract(doubleitem.getLocation().toVector());
						doubleitem.setVelocity(direction.multiply(speed));*/
					}
				}
			}, 2*20L);
		}
		if(doubleitem!=null) {
		if((doubleitem.getItemStack().getType().toString().toLowerCase().contains("helmet"))){
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				@Override
				public void run() {
					if(doubleitem.getLocation().getBlock().getRelative(0, 0, 0).getType()==Material.CAMPFIRE) {
						meta.seviye= rand.nextInt(7)+1;
						meta.dizindex = rand.nextInt(4);
						ItemStack newhelmet = doubleitem.getItemStack();
						meta.helmetmeta(newhelmet);
						World world=player.getWorld();
						world.dropItemNaturally(doubleitem.getLocation().clone().add(0, 0, 0), newhelmet);
						doubleitem.remove();
					}
				}
			}, 2*20L);
		}
		if((doubleitem.getItemStack().getType().toString().toLowerCase().contains("chestplate"))){
		
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				@Override
				public void run() {
					if(doubleitem.getLocation().getBlock().getRelative(0, 0, 0).getType()==Material.CAMPFIRE) {
						meta.seviye= rand.nextInt(7)+1;
						meta.dizindex = rand.nextInt(4);
						ItemStack newchestplate = doubleitem.getItemStack();
						meta.chestplatemeta(newchestplate);
						World world=player.getWorld();
						world.dropItemNaturally(doubleitem.getLocation().clone().add(0, 0, 0), newchestplate);
						doubleitem.remove();
					}
				}
			}, 2*20L);
		}
		
		if((doubleitem.getItemStack().getType().toString().toLowerCase().contains("leggings"))){
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				@Override
				public void run() {
					if(doubleitem.getLocation().getBlock().getRelative(0, 0, 0).getType()==Material.CAMPFIRE) {
						meta.seviye= rand.nextInt(7)+1;
						meta.dizindex = rand.nextInt(4);
						ItemStack newleggings = doubleitem.getItemStack();
						meta.chestplatemeta(newleggings);
						World world=player.getWorld();
						world.dropItemNaturally(doubleitem.getLocation().clone().add(0, 0, 0), newleggings);
						doubleitem.remove();
					}
				}
			}, 2*20L);
		}
		if((doubleitem.getItemStack().getType().toString().toLowerCase().contains("boots"))){
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				@Override
				public void run() {
					if(doubleitem.getLocation().getBlock().getRelative(0, 0, 0).getType()==Material.CAMPFIRE) {
						meta.seviye= rand.nextInt(7)+1;
						meta.dizindex = rand.nextInt(4);
						ItemStack newboots = doubleitem.getItemStack();
						meta.chestplatemeta(newboots);
						World world=player.getWorld();
						world.dropItemNaturally(doubleitem.getLocation().clone().add(0, 0, 0), newboots);
						doubleitem.remove();
					}
				}
			}, 2*20L);
		}
		
		
		
		if(doubleitem.getItemStack().getType()==Material.WOODEN_PICKAXE ||
				doubleitem.getItemStack().getType()==Material.STONE_PICKAXE ||
				doubleitem.getItemStack().getType()==Material.GOLDEN_PICKAXE ||
						doubleitem.getItemStack().getType()==Material.IRON_PICKAXE ||
				doubleitem.getItemStack().getType()==Material.DIAMOND_PICKAXE ||
				doubleitem.getItemStack().getType()==Material.NETHERITE_PICKAXE){
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				@Override
				public void run() {
					if(doubleitem.getLocation().getBlock().getRelative(0, 0, 0).getType()==Material.CAMPFIRE) {
						meta.seviye= rand.nextInt(7)+1;
						meta.dizindex = rand.nextInt(4);
						ItemStack newpickaxe = doubleitem.getItemStack();
						meta.pickaxemeta(newpickaxe);
						World world=player.getWorld();
						
						world.dropItemNaturally(doubleitem.getLocation().clone().add(0, 0, 0), newpickaxe);
						doubleitem.remove();
					}
				}
			}, 2*20L);
		}
		if((doubleitem.getItemStack().getType().toString().toLowerCase().contains("sword"))){
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				@Override
				public void run() {
					if(doubleitem.getLocation().getBlock().getRelative(0, 0, 0).getType()==Material.CAMPFIRE) {
						meta.seviye= rand.nextInt(7)+1;
						meta.dizindex = rand.nextInt(6);
						ItemStack newsword = doubleitem.getItemStack();
						meta.swordmeta(newsword);
						World world=player.getWorld();
						world.dropItemNaturally(doubleitem.getLocation().clone().add(0, 0, 0), newsword);
						doubleitem.remove();
					}
				}
			}, 2*20L);
		}
		if(doubleitem.getItemStack().getType()==Material.WOODEN_AXE ||
				doubleitem.getItemStack().getType()==Material.STONE_AXE ||
				doubleitem.getItemStack().getType()==Material.GOLDEN_AXE ||
				doubleitem.getItemStack().getType()==Material.IRON_AXE ||
				doubleitem.getItemStack().getType()==Material.DIAMOND_AXE ||
				doubleitem.getItemStack().getType()==Material.NETHERITE_AXE){
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				@Override
				public void run() {
					if(doubleitem.getLocation().getBlock().getRelative(0, 0, 0).getType()==Material.CAMPFIRE) {
						meta.seviye= rand.nextInt(7)+1;
						meta.dizindex = rand.nextInt(4);
						ItemStack newaxe = doubleitem.getItemStack();
						meta.axemeta(newaxe);
						World world=player.getWorld();
						world.dropItemNaturally(doubleitem.getLocation().clone().add(0, 0, 0), newaxe);
						doubleitem.remove();
					}
				}
			}, 2*20L);
		}
		if((doubleitem.getItemStack().getType().toString().toLowerCase().contains("shovel"))){
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				@Override
				public void run() {
					if(doubleitem.getLocation().getBlock().getRelative(0, 0, 0).getType()==Material.CAMPFIRE) {
						meta.seviye= rand.nextInt(7)+1;
						meta.dizindex = rand.nextInt(3);
						ItemStack newshovel = doubleitem.getItemStack();
						meta.shovelmeta(newshovel);
						World world=player.getWorld();
						world.dropItemNaturally(doubleitem.getLocation().clone().add(0, 0, 0), newshovel);
						doubleitem.remove();
					}
				}
			}, 2*20L);
		}
if((doubleitem.getItemStack().getType().toString().toLowerCase().contains("bow"))){
			
			Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
				@Override
				public void run() {
					if(doubleitem.getLocation().getBlock().getRelative(0, 0, 0).getType()==Material.CAMPFIRE) {
						meta.seviye= rand.nextInt(7)+1;
						meta.dizindex = rand.nextInt(6);
						ItemStack newbow = doubleitem.getItemStack();
						meta.bowmeta(newbow);
						World world=player.getWorld();
						world.dropItemNaturally(doubleitem.getLocation().clone().add(0, 0, 0), newbow);
						doubleitem.remove();
					}
				}
			}, 2*20L);
		}
		
		}
	}
}
