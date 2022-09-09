import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

internal class GildedRoseTest {

    @Test
    fun testNormalItemsSellInDate() {
        val items = arrayOf<Item>(Item("foo", 10, 10))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals("normal item sell in", app.items[0].sellIn, 9)
    }

    @Test
    fun testAgedBrieItemsSellInDate() {
        val items = arrayOf<Item>(Item("Aged Brie", 10, 10))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals("Aged Brie item sell in", app.items[0].sellIn, 9)
    }

    @Test
    fun testBackStagePassItemsSellInDate() {
        val items = arrayOf<Item>(Item("Backstage passes to a TAFKAL80ETC concert", 10, 10))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals("Backstage Pass item sell in", app.items[0].sellIn, 9)
    }

    @Test
    fun testSulfurasItemsSellInDate() {
        val items = arrayOf<Item>(Item("Sulfuras, Hand of Ragnaros", 10, 10))
        val app = GildedRose(items)
        app.updateQuality()
        assertEquals("Sulfuras item sell in", app.items[0].sellIn, 10)
    }
//
//    @Test
//    fun testNormalItemsQualityPreSellIn() {
//        val items = arrayOf<Item>(Item("foo", 10, 10))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("normal item degrade 1", app.items[0].quality, 9)
//    }
//
//    @Test
//    fun testNormalItemsQualityPostSellIn() {
//        val items = arrayOf<Item>(Item("foo", 0, 10))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("normal item degrade 2", app.items[0].quality, 8)
//    }
//
//    @Test
//    fun testNormalItemsQuality0() {
//        val items = arrayOf<Item>(Item("foo", 10, 0))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("normal item degrade 2", app.items[0].quality, 0)
//    }
//
//    @Test
//    fun testAgedBrieItemsQualityPreSellIn() {
//        val items = arrayOf<Item>(Item("Aged Brie", 10, 10))
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