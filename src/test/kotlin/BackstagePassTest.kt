import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class BackstagePassTest {
    @Test
    fun testBackstagePassClassSellIn() {
        val pass = BackstagePass("cradle of filth", 10, 10)
        pass.updateSellIn()
        assertEquals("updates", pass.sellIn, 9)
    }

    @Test
    fun testBackStagePassItemsQualityPreSellIn10Plus() {
        val item = BackstagePass("Backstage passes to a TAFKAL80ETC concert", 11, 10)
        item.updateQuality()
        assertEquals("pass item improve 1", item.quality, 11)
    }

    @Test
    fun testBackStagePassItemsQualityPreSellInLessThan10() {
        val item = BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 10)
        item.updateQuality()
        assertEquals("pass item improve 1", item.quality, 12)
    }

    @Test
    fun testBackStagePassItemsQualityPreSellInLessThan5() {
        val item = BackstagePass("Backstage passes to a TAFKAL80ETC concert", 5, 10)
        item.updateQuality()
        assertEquals("pass item improve 1", item.quality, 13)
    }

    @Test
    fun testBackStagePassItemsQualityPostSellIn() {
        val item = BackstagePass("Backstage passes to a TAFKAL80ETC concert", 0, 10)
        item.updateQuality()
        assertEquals("pass item is 0", item.quality, 0)
    }

    @Test
    fun testBackStagePassItemsQuality50() {
        val item = BackstagePass("Backstage passes to a TAFKAL80ETC concert", 10, 50)
        item.updateQuality()
        assertEquals("pass item improve 1", item.quality, 50)
    }

}