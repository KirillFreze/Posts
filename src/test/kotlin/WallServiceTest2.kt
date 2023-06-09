import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

class WallServiceTest2 {
//    @Before
//    fun clearBeforeTest(){
//        WallService.clear()
//    }
    @Test
    fun updateTrue() {
        val service = WallService
        service.add(Post(unicId, 12, 12,12,12, comments(1, true, true,true,true), likes(12,true,true,true)))
        service.add(Post(unicId, 12, 12,12,12, comments(1, true, true,true,true), likes(12,true,true,true)))
        service.add(Post(unicId, 12, 12,12,12, comments(1, true, true,true,true), likes(12,true,true,true)))
        val result = service.update(Post(1, 12, 12,12,12, comments(1, true, true,true,true), likes(12,true,true,true)))
        assertTrue(result)
    }
    @Test
    fun updateFalse() {
        val service = WallService
        service.add(Post(unicId, 12, 12,12,12, comments(1, true, true,true,true), likes(12,true,true,true)))
        val result = service.update(Post(30, 12, 12,12,12, comments(1, true, true,true,true), likes(12,true,true,true)))
        assertFalse(result)
    }
}