class GildedRose(var items: Array<Item>) {

    fun updateQuality() {
        for (item in items) {
            if (item !is Sulfuras) {item.sellIn -= 1}
        }
    }

}
