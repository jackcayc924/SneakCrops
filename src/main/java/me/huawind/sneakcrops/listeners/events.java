package me.huawind.sneakcrops.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.Ageable;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

import java.util.Arrays;
import java.util.List;

public class events implements Listener {
	List<Material> crops = Arrays.asList(Material.WHEAT, Material.CARROTS, Material.POTATOES, Material.NETHER_WART, Material.PUMPKIN_STEM, Material.MELON_STEM);

	@EventHandler
	public void sneakFarmGrow(PlayerMoveEvent event) {
		Block block = event.getPlayer().getLocation().getBlock().getRelative(BlockFace.UP);

		if (event.getPlayer().isSneaking()) {
			if (event.getPlayer().hasPermission("sneak.crops") || event.getPlayer().isOp()) {
					if (crops.contains(block.getType())) {
						Ageable ageable = (Ageable) block.getBlockData();
						if (ageable.getAge() != ageable.getMaximumAge()) {
							ageable.setAge(ageable.getAge() + 1);
							block.setBlockData(ageable);
					}
				}
			}
		}
	}
}

