import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class SulfurasTest {
    @Test
    fun testSulfurasClass() {
        val sulfuras = Sulfuras("crazy mad shit", 10, 10)
        sulfuras.updateSellIn()
        assertEquals("sulfuras class works", sulfuras.sellIn,  10)
    }
}