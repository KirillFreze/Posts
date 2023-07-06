//class Comments(
//    val count: Int,
//    val canPost: Boolean,
//    val groupsCanPost: Boolean,
//    val canClose: Boolean,
//    val canOpen: Boolean
//)
//
//class Likes(
//    val count: Int,
//    val userLikes: Boolean,
//    val canLikes: Boolean,
//    val canPublish: Boolean
//)
//
//class Copyright(
//    val id: Int,
//    val link: String,
//    val name: String,
//    val type: String
//)
//
//class Reposts(
//    val count: Int,
//    val userReposted: Boolean
//)
//
//class Views(
//    count: Int
//)
//
//class Geo(
//    val type: String,
//    val coordinates: String,
//    val place: String
//)
//
//class Donut(
//    val isDonut: Int,
//    val paidDuration: Int,
//    val canPublishFreeCopy: Boolean,
//    val editMode: String
//)
//
//open class Anttachments(
//    val parentType: String
//
//)
//
//class AudioAnttachments(
//    type: String,
//    val audio: Audio
//
//) : Anttachments(type)
//
//class VideoAnttachments(
//    type: String,
//    val video: Video
//) : Anttachments(type)
//
//class Audio(
//    val id: Int,
//    val title: String
//)
//
//class Video(
//    val id: Int,
//    val title: String
//)
//
//data class Comment(
//    val id: Int,
//    val text: String
//)

class PostNotFoundExeption(message: String) : RuntimeException(message)
//data class Post(
//    val id: Int,
//    val onwerId: Int,
//    val fromId: Int,
//    val createdBy: Int,
//    val date: Int,
//    val text: String,
//    val replyOnwerId: Int,
//    val replyPostId: Int,
//    val friendsOnly: Boolean,
//    val comments: Comments,
//    val copyright: Copyright,
//    val likes: Likes?,
//    val reposts: Reposts,
//    val views: Views?,
//    val postType: String,
//    val anttachments: Anttachments,
//    val geo: Geo,
//    val signerId: Int,
//    val canPin: Boolean,
//    val canDelete: Boolean,
//    val canEdit: Boolean,
//    val isPinned: Boolean,
//    val markedAsAds: Boolean,
//    val isFavorite: Boolean,
//    val donut: Donut,
//    val postponedId: Int
//)
//
//object WallService {
//    public var unicId = 1
//    private var posts = emptyArray<Post>()
//    private var comments = emptyArray<Comment>()
//    fun add(post: Post): Post {
//        posts += post.copy(id = unicId++)
//        return posts.last()
//    }
//
//    fun createComment(postId: Int, comment: Comment): Comment {
//        for (i in 0..posts.size - 1) {
//            if (postId.equals(posts[i].id)) {
//                comments += comment
//                return comments.last()
//            }
//
//
//        }
//        throw PostNotFoundExeption("Not post whit $postId")
//        return comments.last()
//    }
//
//    fun update(post: Post): Boolean {
//        for (i in 0..posts.size - 1) {
//            if (post.id.equals(posts[i].id)) {
//                posts[i] = post
//                return true
//            }
//        }
//        return false
//    }
//
//    fun print() {
//        for (post in posts) {
//            print(post)
//            print(' ')
//        }
//        println()
//    }
//
//    fun printComment() {
//        for (comment in comments) {
//            print(comment)
//            print(' ')
//        }
//        println()
//    }
//
//    fun clear() {
//        posts = emptyArray()
//        unicId = 1
//    }
//}

class Note(
    val title: String,
    val text: String
)

data class NoteComment(
    val idNote: Int,
    var idComment: Int,
    val message: String
)

data class Notes(
    val id: Int,
    val note: Note


)

object CreateNotes {
    public var unicId = 1
    public var unicIdComment = 1
    var notes = mutableListOf<Notes>()
    var comments = mutableListOf<NoteComment>()
    var deleteComments = mutableListOf<NoteComment>()
    fun addNote(note: Notes): Notes {
        notes += note.copy(id = unicId++)
        return notes.last()


    }

    fun createComment(comment: NoteComment): NoteComment {
        for (i in 0..notes.size - 1) {
            if (comment.idNote.equals(notes[i].id)) {
                comments += comment.copy(idComment = unicIdComment++)
                return comments.last()
            }


        }
        throw PostNotFoundExeption("Not note")
        return comments.last()
    }

    fun delete(noteId: Int): Boolean {
        for (i in 0..notes.size - 1) {
            if (noteId.equals(notes[i].id)) {
                notes.removeAt(i)
                return true
            }
        }
        throw PostNotFoundExeption("Not note")
        return false
    }

    fun deleteComment(noteId: Int, commentId: Int): Boolean {
        for (i in 0..comments.size - 1) {
            if (noteId.equals(comments[i].idNote) && commentId.equals((comments[i].idComment))) {
                deleteComments += comments[i]
                comments.removeAt(i)
                return true
            }
        }
        throw PostNotFoundExeption("Not comment")
        return false
    }

    fun updateNote(note: Notes): Boolean {
        for (i in 0..notes.size - 1) {
            if (note.id.equals(notes[i].id)) {
                notes[i] = note
                return true
            }
        }
        throw PostNotFoundExeption("Not note")
        return false
    }

    fun updateComments(comment: NoteComment): Boolean {
        for (i in 0..comments.size - 1) {
            if (comment.idNote.equals(comments[i].idNote) && comment.idComment.equals(comments[i].idComment)) {
                comments[i] = comment
                return true
            }
        }
        throw PostNotFoundExeption("Not comment")
        return false
    }

    fun get(): MutableList<Notes> {
        return notes
    }

    fun getById(noteId: Int): Notes {

        return notes[noteId - 1]

    }

    fun getComments(noteId: Int): MutableList<NoteComment> {
        var listComment = mutableListOf<NoteComment>()
        for (i in 0..comments.size - 1) {
            if (noteId.equals(comments[i].idNote)) {
                listComment += comments[i]
            }

        }
        return listComment
    }

    fun restoreComment(noteId: Int, commentId: Int): Boolean {
        for (i in 0..deleteComments.size - 1) {
            if (noteId.equals(deleteComments[i].idNote) || commentId.equals((deleteComments[i].idComment))) {
                comments += comments[i]
                deleteComments.removeAt(i)
                return true
            }
        }
        throw PostNotFoundExeption("Not comment")
        return false
    }
}

fun main(args: Array<String>) {
    var userNotes = CreateNotes
    userNotes.addNote(Notes(1, Note("Hello", "World")))
    userNotes.addNote(Notes(1, Note("Dark", "Side")))
    userNotes.addNote(Notes(1, Note("Tonny", "Stark")))
    userNotes.get()
    userNotes.createComment(NoteComment(1, 1, "Hello"))
    userNotes.createComment(NoteComment(1, 1, "Hello"))
    userNotes.createComment(NoteComment(1, 1, "Hello"))
    userNotes.createComment(NoteComment(2, 1, "Hello"))
    userNotes.createComment(NoteComment(2, 1, "Hello"))
    userNotes.getComments(1)
    userNotes.deleteComment(1, 2)
    userNotes.getComments(1)
    userNotes.getById(2)
//    var service = WallService
//    service.add(
//        Post(
//            0,
//            12,
//            12,
//            12,
//            12,
//            "Hello",
//            1,
//            1,
//            true,
//            Comments(1, true, true, true, true),
//            Copyright(1, "w", "e", "t"),
//            Likes(1, true, true, true),
//            Reposts(1, true),
//            Views(1),
//            "r",
//            AudioAnttachments("Audio", Audio(1, "Song")),
//            Geo("e", "t", "y"),
//            1,
//            true,
//            true,
//            true,
//            true,
//            true,
//            true,
//            Donut(1, 1, true, "r"),
//            1
//        )
//    )
//    service.add(
//        Post(
//            0,
//            12,
//            12,
//            12,
//            12,
//            "Hello",
//            1,
//            1,
//            true,
//            Comments(1, true, true, true, true),
//            Copyright(1, "w", "e", "t"),
//            Likes(1, true, true, true),
//            Reposts(1, true),
//            Views(1),
//            "r",
//            AudioAnttachments("Audio", Audio(1, "Song")),
//            Geo("e", "t", "y"),
//            1,
//            true,
//            true,
//            true,
//            true,
//            true,
//            true,
//            Donut(1, 1, true, "r"),
//            1
//        )
//    )
//    service.print()
}