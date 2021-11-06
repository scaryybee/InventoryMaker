package io.github.asr.invmaker

import org.bukkit.inventory.Inventory
import org.bukkit.inventory.ItemStack

@InvMaker
class InventorySettings(private val inventory: Inventory) {
    fun slot(slotNumber: Int, stack: ItemStack) {
        inventory.setItem(slotNumber, stack)
    }

    fun returnInventory() = inventory
}