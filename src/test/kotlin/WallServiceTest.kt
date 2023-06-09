import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val service = WallService
        val result = service.add(Post(unicId, 12, 12,12,12, comments(1, true, true,true,true), likes(12,true,true,true))).id
        assertEquals(1, result)
    }
}