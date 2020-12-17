package com.Mitsuki1159.Message_Sender;

import com.Mitsuki1159.Message_Sender.events.MessageEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Message_Sender extends JavaPlugin {

    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new MessageEvents(), this);

        getServer().getConsoleSender().sendMessage(ChatColor.BLUE + "[Message_Sender]: Plugin enabled");
    }

    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Message_Sender]: Plugin disabled");
    }
}
