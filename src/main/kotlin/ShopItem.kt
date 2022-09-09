abstract class ShopItem(var name: String, var sellIn: Int, var quality: Int) {
    open fun updateSellIn() {
        sellIn -= 1
    }

    open fun updateQuality() {
        if (quality > 0) {
            quality -= if (sellIn > 0) 1 else 2
        }
    }
}