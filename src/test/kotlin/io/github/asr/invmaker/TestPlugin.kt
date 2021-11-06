package io.github.asr.invmaker

import io.github.asr.mafp.listener.events
import net.kyori.adventure.text.Component
import org.bukkit.Material
import org.bukkit.event.Listener
import org.bukkit.inventory.ItemStack
import org.bukkit.plugin.java.JavaPlugin

class TestPlugin : JavaPlugin(), Listener {
    override fun onEnable() {
        this.server.pluginManager.registerEvents(this, this)

        events {
            onChat {
                val inventory = inventory("test", InventorySize.SLOT9) {
                    slot(0, ItemStack(Material.DIAMOND).apply {
                        editMeta {
                            it.displayName(Component.text("다이아 아니고 금임"))
                        }
                    })
                }
                sender().openInventory(inventory)
            }
        }
    }
}