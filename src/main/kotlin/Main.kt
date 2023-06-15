

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
class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String
)
class Reposts(
    val count: Int,
    val userReposted: Boolean
)
class Views(
    count: Int
)

class Geo(
    val type: String,
    val coordinates: String,
    val place: String
)
class Donut(
    val isDonut: Int,
    val paidDuration: Int,
    val canPublishFreeCopy: Boolean,
    val editMode: String
)
open class Anttachments(
    val parentType: String

)
class AudioAnttachments(
    type: String,
    val audio: Audio

) : Anttachments(type)
class VideoAnttachments(
    type: String,
    val video: Video
) : Anttachments(type)
class Audio(
    val id: Int,
    val title: String
)
class Video(
    val id: Int,
    val title: String
)
data class Post(
    val id: Int,
    val onwerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOnwerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes?,
    val reposts: Reposts,
    val views: Views?,
    val postType: String,
    val anttachments: Anttachments,
    val geo: Geo,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Int
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
    service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
    service.add(Post(0, 12, 12, 12, 12, "Hello", 1, 1, true, Comments(1, true,true,true,true), Copyright(1,"w","e","t"), Likes(1,true,true,true), Reposts(1, true), Views(1), "r", AudioAnttachments("Audio", Audio(1, "Song")), Geo("e","t","y"), 1, true, true, true, true, true, true, Donut(1, 1, true, "r"), 1 ))
    service.print()
}