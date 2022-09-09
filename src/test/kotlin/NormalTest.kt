import org.junit.jupiter.api.Test
import kotlin.test.DefaultAsserter.assertEquals

class NormalTest {
    @Test
    fun testNormalClass() {
        val normal = Normal("foo", 10, 10)
        assertEquals("normal class works", normal.toString(), "foo, 10, 10")
    }
}