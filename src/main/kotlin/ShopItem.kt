abstract class ShopItem(var name: String, var sellIn: Int, var quality: Int) {
    open fun updateSellIn() {
        sellIn -= 1
    }
}