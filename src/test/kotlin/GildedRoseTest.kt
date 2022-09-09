import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

internal class GildedRoseTest {

    @Test
    fun testClassInstantiates() {
        val normal = Normal("foo", 10, 10)
        val sulfuras = Sulfuras("weird thing", 10, 10)
        val pass = BackstagePass("westlife", 10, 10)
        val cheese = AgedBrie("gross cheese", 10, 10)
        val items = mutableListOf<ShopItem>(normal, cheese, pass, sulfuras)
        val app = GildedRose(items)
        assertEquals("normal item", app.items[0].name, "foo")
        assertEquals("aged brie item", app.items[1].name, "gross cheese")
        assertEquals("backstage pass item", app.items[2].name, "westlife")
        assertEquals("sulfuras item", app.items[3].name, "weird thing")
    }

    @Test
    fun testItemsCanBeAddedAfterInstantiation() {
        val normal = Normal("foo", 10, 10)
        val sulfuras = Sulfuras("weird thing", 10, 10)
        val pass = BackstagePass("westlife", 10, 10)
        val cheese = AgedBrie("gross cheese", 10, 10)
        val items = mutableListOf<ShopItem>(normal, cheese, pass)
        val app = GildedRose(items)
        app.add(sulfuras)
        assertEquals("sulfuras item", app.items[3].name, "weird thing")
    }
}