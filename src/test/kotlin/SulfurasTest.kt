import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class SulfurasTest {
    @Test
    fun testSulfurasClass() {
        val normal = Sulfuras("crazy mad shit", 10, 10)
        assertEquals("sulfuras class works", normal.toString(), "crazy mad shit, 10, 10")
    }
}