class GildedRose(var items: MutableList<ShopItem>) {
    fun updateQuality() {
        for (item in items) {
            item.updateSellIn()
            item.updateQuality()
        }
    }

    fun add(item: ShopItem) {
        items.add(item)
    }
}
