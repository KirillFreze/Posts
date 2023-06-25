import org.junit.Test

import org.junit.Assert.*

class CreateNotesTest6 {

    @Test
    fun updateComments() {
        val createNotes = CreateNotes
        createNotes.addNote(Notes(1, Note("Hello", "World")))
        createNotes.addNote(Notes(1, Note("Hello", "World")))
        createNotes.createComment(NoteComment(1,1,"Hello"))
        createNotes.createComment(NoteComment(1,1,"Hello"))
        createNotes.createComment(NoteComment(1,1,"Hello"))
        val result = createNotes.updateComments(NoteComment(1,2,"dfff"))
        assertTrue(result)
    }
}