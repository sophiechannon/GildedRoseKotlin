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
//    fun testSulfurasItemsQuality() {
//        val items = arrayOf<Item>(Item("Sulfuras, Hand of Ragnaros", 11, 10))
//        val app = GildedRose(items)
//        app.updateQuality()
//        assertEquals("sulfuras item improve 1", app.items[0].quality, 10)
//    }
}