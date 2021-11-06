# InventoryMaker
- Make Inventory Easily
- Not Hard!

## Not Tested Version
- TODO Test

```kotlin
class Sample : JavaPlugin() {
    override fun onEnable() {
        events {
            onChat {
                sender().openInventory(
                        inventory("test", InventorySize.SLOT9) {
                        slot(0, ItemStack(Material.DIAMOND).apply {
                                editMeta {
                                    it.displayName(Component.text("다이아 아니고 금임"))
                                }
                            }
                        )
                    }
                )
            }
        }
    }
}
```