

class Comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

class Likes(
    val count: Int,
    val userLikes: Boolean,
    val canLikes: Boolean,
    val canPublish: Boolean
)

data class Post(
    val id: Int,
    val onwerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val comments: Comments,
    val likes: Likes,

)

object WallService {
    public var unicId = 1
    private var posts = emptyArray<Post>()
    fun add(post: Post): Post {
        posts += post.copy(id = unicId++)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for (i in 0..posts.size-1) {
            if (post.id.equals(posts[i].id)) {
                posts[i] = post
                return true
            }
        }
        return false
    }
    fun print(){
        for (post in posts){
            print(post)
            print(' ')
        }
        println()
    }
    fun clear(){
        posts = emptyArray()
        unicId = 1
    }
}


fun main(args: Array<String>) {
    var service = WallService
    service.add(Post(0, 12, 12, 12, 12, Comments(12, true, true, true, true), Likes(1, true, true,true)))
    service.add(Post(0, 12, 12, 12, 12, Comments(12, true, true, true, true), Likes(1, true, true,true)))
    service.print()
}