class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        for (item in items) {
            item.sellIn -= 1
        }
    }

}
