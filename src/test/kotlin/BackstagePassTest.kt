import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class BackstagePassTest {
    @Test
    fun testBackstagePassClassSellIn() {
        val pass = BackstagePass("cradle of filth", 10, 10)
        pass.updateSellIn()
        assertEquals("updates", pass.sellIn, 9)
    }
}