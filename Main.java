package com.yehia.plugin;
import java.net.http.WebSocket.Listener;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin  {
	
	@Override
	public void onEnable() {
		System.out.println("plugin enabled :) ");
		 
	}
	@Override
	public void onDisable() {
		System.out.println("plugin disabled :( ");
		}
	 
	
	
	
	

    
	public boolean onCommand (CommandSender sender, Command cmd, String label, String[] args) {
		
		if (cmd.getName().equals("hello")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				player.sendMessage(ChatColor.BLUE + "Hello" + ChatColor.AQUA +player.getName() + ChatColor.GREEN + "you are healed");
                player.setHealth(20);
             
               }
			else {
				System.out.println("Dis command not work on consol");
			}	
		}
			
		
		if  (cmd.getName().equals("hunger")) {
				if (sender instanceof Player) {
					Player player = (Player) sender;
					player.sendMessage(ChatColor.BLUE + "Hello" + ChatColor.AQUA +player.getName() + ChatColor.GREEN + "now you are full");
	                player.setFoodLevel(20);
	                
	               }
				else {
					System.out.println("Dis command not work on consol");
				}
		}
				
				
		
			
			
			
		
		
		

	

		return false; 
	}
	
}

		
	


