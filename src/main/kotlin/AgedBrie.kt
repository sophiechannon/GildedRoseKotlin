class AgedBrie(name: String, sellIn: Int, quality: Int) : ShopItem(name, sellIn, quality) {
    override fun updateQuality() {
        if (quality < 50) {
            quality += if (sellIn > 0) 1 else 2
        }
    }
}