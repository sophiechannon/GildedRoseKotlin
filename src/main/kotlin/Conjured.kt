class Conjured(name: String, sellIn: Int, quality: Int): ShopItem(name, sellIn, quality) {
    override fun updateQuality() {
        quality -= if (sellIn > 0) 2 else 4
        if (quality < 0) quality = 0
    }
}