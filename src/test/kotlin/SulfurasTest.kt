import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class SulfurasTest {
    @Test
    fun testSulfurasClass() {
        val sulfuras = Sulfuras("crazy mad shit", 10, 10)
        sulfuras.updateSellIn()
        assertEquals("sulfuras class works", sulfuras.sellIn,  10)
    }

    @Test
    fun testSulfurasItemsQuality() {
        val item = Sulfuras("Sulfuras, Hand of Ragnaros", 11, 10)
        item.updateQuality()
        assertEquals("sulfuras item improve 1", item.quality, 10)
    }
}