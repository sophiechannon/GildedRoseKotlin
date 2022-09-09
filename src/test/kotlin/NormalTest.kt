import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class NormalTest {
    @Test
    fun testNormalClassSellIn() {
        val normal = Normal("foo", 10, 10)
        normal.updateSellIn()
        assertEquals("normal class works", normal.sellIn, 9)
    }

    @Test
    fun testNormalItemsQualityPreSellIn() {
        val normal = Normal("foo", 10, 10)
        normal.updateQuality()
        assertEquals("normal item degrade 1", normal.quality, 9)
    }

    @Test
    fun testNormalItemsQualityPostSellIn() {
        val normal = Normal("foo", 0, 10)
        normal.updateQuality()
        assertEquals("normal item degrade 2", normal.quality, 8)
    }

    @Test
    fun testNormalItemsQuality0() {
        val normal = Normal("foo", 10, 0)
        normal.updateQuality()
        assertEquals("normal item degrade 2", normal.quality, 0)
    }
}