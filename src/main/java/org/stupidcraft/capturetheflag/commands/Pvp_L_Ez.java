package org.stupidcraft.capturetheflag.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import net.md_5.bungee.api.ChatColor;
import org.stupidcraft.capturetheflag.Main;

public class Pvp_L_Ez {

    public static boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (args.length < 2) {
            sender.sendMessage(ChatColor.RED + "Invalid arguments: /teams pvp true/false");
            return true;
        }

        if (args[1].equalsIgnoreCase("true")) {
            Main.pvpEnabled = true;
            sender.sendMessage(ChatColor.GREEN + "Enabled PvP (Kill those SC children).");
        } else if (args[1].equalsIgnoreCase("false")) {
            Main.pvpEnabled = false;
            sender.sendMessage(ChatColor.GREEN + "Disabled PvP (Nooooo you can't kill any more kids).");
        } else {
            sender.sendMessage(ChatColor.RED + "Invalid arguments: /teams pvp true/false");
        }

        return true;
    }
}
