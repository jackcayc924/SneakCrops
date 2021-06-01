package me.huawind.sneakcrops;

import me.huawind.sneakcrops.listeners.events;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + " ___               _    ___                 ");
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "/ __|_ _  ___ __ _| |__/ __|_ _ ___ _ __ ___");
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "\\__ \\ ' \\/ -_) _` | / / (__| '_/ _ \\ '_ (_-<");
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "|___/_||_\\___\\__,_|_\\_\\\\___|_| \\___/ .__/__/");
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "                                   |_|      ");
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "      By: Huawind");
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + " ");
		getServer().getConsoleSender().sendMessage(ChatColor.YELLOW + "Sneak Crops: Successfully Enabled!");
		getServer().getPluginManager().registerEvents(new events(), this);
	}

	@Override
	public void onDisable() {
		getServer().getConsoleSender().sendMessage(ChatColor.RED + "Sneak Crops: Disabled");
	}
}
