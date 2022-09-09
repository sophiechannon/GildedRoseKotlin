import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class ConjuredTest {
    @Test
    fun testConjuredClassSellIn() {
        val item = Conjured("magical item", 10, 10)
        item.updateSellIn()
        assertEquals("updates", item.sellIn, 9)
    }

    @Test
    fun testConjuredItemsQualityPreSellIn() {
        val item = Conjured("wow", 10, 10)
        item.updateQuality()
        assertEquals("conjured item degrades 2", item.quality, 8)
    }

    @Test
    fun testConjuredItemsQualityPostSellIn() {
        val item = Conjured("cool", 0, 10)
        item.updateQuality()
        assertEquals("conjured item degrades 2", item.quality, 6)
    }

    @Test
    fun testConjuredItems0() {
        val item = Conjured("cool", 10, 1)
        item.updateQuality()
        assertEquals("conjured item cant have negative quality", item.quality, 0)
    }

}