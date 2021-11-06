package io.github.asr.invmaker

import net.kyori.adventure.text.Component
import org.bukkit.Bukkit

annotation class InvMaker

@InvMaker
fun inventory(name: String, size: InventorySize, action: InventorySettings.() -> Unit) =
    InventorySettings(Bukkit.createInventory(null, size.size(), Component.text(name))).apply(action).returnInventory()