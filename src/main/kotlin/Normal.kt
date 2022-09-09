class Normal(name: String, sellIn: Int, quality: Int) : ShopItem(name, sellIn, quality) {
    override fun updateQuality() {
        quality -= if (sellIn > 0) 1 else 2
        if (quality < 0) quality = 0
    }
}