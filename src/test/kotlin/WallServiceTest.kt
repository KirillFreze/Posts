import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {
    @Before
    fun clearBeforeTest(){
        WallService.clear()
    }
    @Test
    fun add() {
        val service = WallService
        val result = service.add(Post(0, 12, 12,12,12, Comments(1, true, true,true,true), Likes(12,true,true,true))).id
        assertEquals(1, result)
    }
}