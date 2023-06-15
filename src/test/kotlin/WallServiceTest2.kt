import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest2 {
    @Before
    fun clearBeforeTest(){
        WallService.clear()
    }
    @Test
    fun updateTrue() {
        val service = WallService
        service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
        service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
        service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
        val result = service.update(Post(1, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
        assertTrue(result)
    }
    @Test
    fun updateFalse() {
        val service = WallService
        service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
        val result = service.update(Post(30, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
        assertFalse(result)
    }
}