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
        val result = service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 )).id
        assertEquals(1, result)
    }
}