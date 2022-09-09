class GildedRose(var items: Array<ShopItem>) {

    fun updateQuality() {
        for (item in items) {
            item.updateSellIn()
        }
    }

}
