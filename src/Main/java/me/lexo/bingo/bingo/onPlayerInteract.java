package me.lexo.bingo.bingo;

import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class onPlayerInteract {

    @EventHandler
    public void onPlayerInteract(PlayerInteractEvent event) {
    ItemStack item = event.getItem();
    if (item != null && item.hasItemMeta()) {
        ItemMeta meta = item.getItemMeta();
        if (((ItemMeta) meta).hasCustomModelData() && meta.getCustomModelData() == 6) {
            meta.setCustomModelData(100);
            item.setItemMeta(meta);
             // Tu código aquí
        }
    }
    }
    
}
