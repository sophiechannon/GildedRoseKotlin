class BackstagePass(name: String, sellIn: Int, quality: Int) : ShopItem(name, sellIn, quality) {
    override fun updateQuality() {
        if (quality < 50) {
            if (sellIn > 10) {
                quality += 1
            } else if (sellIn <= 0) {
                quality = 0
            } else if (sellIn <= 5) {
                quality += 3
            } else {
                quality += 2
            }
        }
    }
}