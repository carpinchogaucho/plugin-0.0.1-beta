package me.lexo.bingo.bingo;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class onInventoryClick {
    @EventHandler
public void onInventoryClick(InventoryClickEvent event) {
ItemStack item = event.getCurrentItem();
if (item != null && item.hasItemMeta()) {
    ItemMeta meta = item.getItemMeta();
    if (((ItemMeta) meta).hasCustomModelData() && meta.getCustomModelData() == 100) {
        event.getClickedInventory().setItem(event.getSlot(), new ItemStack(Material.BARRIER));
    }
}
}

}
