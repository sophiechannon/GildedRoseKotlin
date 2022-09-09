class Normal(name: String, sellIn: Int, quality: Int) : ShopItem(name, sellIn, quality) {
    override fun updateQuality() {
        if (quality > 0) {
            quality -= if (sellIn > 0) 1 else 2
        }
    }
}