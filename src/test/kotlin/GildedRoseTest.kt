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



}