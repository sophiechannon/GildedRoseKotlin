import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class AgedBrieTest {
    @Test
    fun testAgedBrieClassSellIn() {
        val cheese = AgedBrie("st michel de pompeepoo", 10, 10)
        cheese.updateSellIn()
        assertEquals("updates", cheese.sellIn, 9)
    }
}