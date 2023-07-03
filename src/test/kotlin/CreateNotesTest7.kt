import org.junit.Test

import org.junit.Assert.*

class CreateNotesTest7 {

    @Test
    fun restoreComment() {
        val createNotes = CreateNotes
        createNotes.addNote(Notes(1, Note("Hello", "World")))
        createNotes.addNote(Notes(1, Note("Hello", "World")))
        createNotes.createComment(NoteComment(1,1,"Hello"))
        createNotes.createComment(NoteComment(1,1,"Hello"))
        createNotes.createComment(NoteComment(1,1,"Hello"))
        createNotes.deleteComment(1,2)
        val result = createNotes.restoreComment(1,2)
        assertTrue(result)
    }
    @Test(expected = PostNotFoundExeption::class)
    fun shouldThrow() {
        val createNotes = CreateNotes
        createNotes.addNote(Notes(1, Note("Hello", "World")))
        createNotes.addNote(Notes(1, Note("Hello", "World")))
        createNotes.createComment(NoteComment(1,1,"Hello"))
        createNotes.createComment(NoteComment(1,1,"Hello"))
        createNotes.createComment(NoteComment(1,1,"Hello"))
        createNotes.deleteComment(1,2)
        val result = createNotes.restoreComment(3,5)
        assertFalse(result)

    }
}