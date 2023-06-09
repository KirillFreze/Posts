public var unicId = 1

class comments(
    val count: Int,
    val canPost: Boolean,
    val groupsCanPost: Boolean,
    val canClose: Boolean,
    val canOpen: Boolean
)

class likes(
    val count: Int,
    val userLikes: Boolean,
    val canLikes: Boolean,
    val canPublish: Boolean
)

data class Post(
    val id: Int = unicId,
    val onwerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val comments: comments,
    val likes: likes,

)

object WallService {
    private var posts = emptyArray<Post>()
    fun add(post: Post): Post {
        posts += post
        unicId++
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var count = 0
        for (i in 0..posts.size-1) {
            if (post.id.equals(posts[i].id)) {
                posts[i] = post
                count++
            }
        }
        if (count === 1)
            return true
        else
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
    service.add(Post(unicId, 12, 12, 12, 12, comments(12, true, true, true, true), likes(1, true, true,true)))
    service.add(Post(unicId, 12, 12, 12, 12, comments(12, true, true, true, true), likes(1, true, true,true)))
    service.print()
}