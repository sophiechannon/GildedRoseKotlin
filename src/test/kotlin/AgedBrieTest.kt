import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class AgedBrieTest {
    @Test
    fun testAgedBrieClass() {
        val normal = AgedBrie("st michel de pompeepoo", 10, 10)
        assertEquals("aged brie class works", normal.toString(), "st michel de pompeepoo, 10, 10")
    }
}