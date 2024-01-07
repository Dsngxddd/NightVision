package org.cengiz1.nightvision;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.jetbrains.annotations.NotNull;

import static org.bukkit.potion.PotionEffectType.*;

public final class NightVision extends JavaPlugin implements @NotNull Listener {


    private Player PotionEffect;

    @Override
    public void onEnable(){
        Bukkit.getPluginManager().registerEvents(new Events(), this);
        System.out.println("NightVision Eklentisi Aktif");
    }

    @EventHandler
    public void onDisable() {
    }

    @EventHandler
    public void PlayerJoinEvent(PlayerJoinEvent playerJoinEvent, Player PotionEffect) {
        Player player = // Oyuncunun nesnesi, bu örnekte varsayılan olarak alındı
                 PotionEffect;
        PotionEffect nightVision = new PotionEffect(NIGHT_VISION, Integer.MAX_VALUE, 1);
        player.addPotionEffect(nightVision);


    }
    @EventHandler
    public void PlayerRespawnEvent(PlayerRespawnEvent e) {

        Player player = // Oyuncunun nesnesi, bu örnekte varsayılan olarak alındı
                PotionEffect;
        PotionEffect nightVision = new PotionEffect(NIGHT_VISION, Integer.MAX_VALUE, 1);
        player.addPotionEffect(nightVision);

    }


}
