import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

internal class GildedRoseTest {

    @Test
    fun testItemsAreAdded() {
        val normal = Normal("foo", 10, 10)
        val sulfuras = Sulfuras("weird thing", 10, 10)
        val pass = BackstagePass("westlife", 10, 10)
        val cheese = AgedBrie("gross cheese", 10, 10)
        val items = arrayOf<ShopItem>(normal, cheese, pass, sulfuras)
        val app = GildedRose(items)
        assertEquals("normal item", app.items[0].name, "foo")
        assertEquals("aged brie item", app.items[1].name, "gross cheese")
        assertEquals("backstage pass item", app.items[2].name, "westlife")
        assertEquals("normal item", app.items[3].name, "weird thing")
    }

//    @Test
//    fun testAgedBrieItemsQualityPreSellIn() {
//        val items = arrayOf<ShopItem>(AgedBrie("Aged Brie", 10, 10))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("aged brie item improve 1", app.items[0].quality, 11)
//    }
//
//    @Test
//    fun testAgedBrieItemsQualityPostSellIn() {
//        val items = arrayOf<Item>(Item("Aged Brie", 0, 10))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("aged brie item improve 1", app.items[0].quality, 12)
//    }
//
//    @Test
//    fun testAgedBrieItemsQuality50() {
//        val items = arrayOf<Item>(Item("Aged Brie", 10, 50))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("aged brie item improve 1", app.items[0].quality, 50)
//    }
//
//    @Test
//    fun testBackStagePassItemsQualityPreSellIn10Plus() {
//        val items = arrayOf<Item>(Item("Backstage passes to a TAFKAL80ETC concert", 11, 10))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("sulfuras item improve 1", app.items[0].quality, 11)
//    }
//
//    @Test
//    fun testBackStagePassItemsQualityPreSellInLessThan10() {
//        val items = arrayOf<Item>(Item("Backstage passes to a TAFKAL80ETC concert", 10, 10))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("sulfuras item improve 1", app.items[0].quality, 12)
//    }
//
//    @Test
//    fun testBackStagePassItemsQualityPreSellInLessThan5() {
//        val items = arrayOf<Item>(Item("Backstage passes to a TAFKAL80ETC concert", 5, 10))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("sulfuras item improve 1", app.items[0].quality, 13)
//    }
//
//    @Test
//    fun testBackStagePassItemsQualityPostSellIn() {
//        val items = arrayOf<Item>(Item("Backstage passes to a TAFKAL80ETC concert", 0, 10))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("sulfuras item improve 1", app.items[0].quality, 0)
//    }
//
//    @Test
//    fun testBackStagePassItemsQuality50() {
//        val items = arrayOf<Item>(Item("Backstage passes to a TAFKAL80ETC concert", 10, 50))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("sulfuras item improve 1", app.items[0].quality, 50)
//    }
//
//    @Test
//    fun testSulfurasItemsQuality() {
//        val items = arrayOf<Item>(Item("Sulfuras, Hand of Ragnaros", 11, 10))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("sulfuras item improve 1", app.items[0].quality, 10)
//    }
}