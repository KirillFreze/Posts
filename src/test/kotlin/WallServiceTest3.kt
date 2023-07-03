import org.junit.Test

import org.junit.Assert.*
import org.junit.Before

//class WallServiceTest3 {
//    @Before
//    fun clearBeforeTest(){
//        WallService.clear()
//    }
//
//    @Test
//    fun createComment() {
//        val service = WallService
//        service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
//        service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
//        service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
//        val result = service.createComment(2, Comment(1,"Hello"))
//        assertEquals(Comment(1,"Hello"), result)
//    }
//
//    @Test(expected = PostNotFoundExeption::class)
//    fun shouldThrow() {
//        val service = WallService
//        service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
//        service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
//        service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
//        val result = service.createComment(5, Comment(1,"Hello"))
//
//    }

//}