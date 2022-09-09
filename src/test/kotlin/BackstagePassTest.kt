import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class BackstagePassTest {
    @Test
    fun testBackstagePassClass() {
        val normal = BackstagePass("backstage pass: cradle of filth", 10, 10)
        assertEquals("backstage pass class works", normal.toString(), "backstage pass: cradle of filth, 10, 10")
    }
}