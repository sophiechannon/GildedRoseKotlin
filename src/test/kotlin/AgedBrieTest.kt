import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class AgedBrieTest {
    @Test
    fun testAgedBrieClassSellIn() {
        val cheese = AgedBrie("st michel de pompeepoo", 10, 10)
        cheese.updateSellIn()
        assertEquals("updates", cheese.sellIn, 9)
    }

    @Test
    fun testAgedBrieItemsQualityPreSellIn() {
        val item = AgedBrie("Aged Brie", 10, 10)
        item.updateQuality()
        assertEquals("aged brie item improve 1", item.quality, 11)
    }

    @Test
    fun testAgedBrieItemsQualityPostSellIn() {
        val item = AgedBrie("Aged Brie", 0, 10)
        item.updateQuality()
        assertEquals("aged brie item improve 1", item.quality, 12)
    }

    @Test
    fun testAgedBrieItemsQuality50() {
        val item = AgedBrie("Aged Brie", 10, 50)
        item.updateQuality()
        assertEquals("aged brie item improve 1", item.quality, 50)
    }

}