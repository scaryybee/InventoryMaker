package io.github.asr.invmaker

@InvMaker
enum class InventorySize(private val size: Int) {
    SLOT9(9),
    SLOT18(18),
    SLOT27(27),
    SLOT36(36),
    SLOT45(45),
    SLOT54(54);

    fun size() = size
}