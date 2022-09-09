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



}