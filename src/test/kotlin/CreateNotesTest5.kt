import org.junit.Test

import org.junit.Assert.*

class CreateNotesTest5 {

    @Test
    fun updateNote() {
        val createNotes = CreateNotes
        createNotes.addNote(Notes(1, Note("Hello", "World")))
        createNotes.addNote(Notes(1, Note("Hello", "World")))
        val result = createNotes.updateNote(Notes(2, Note("Hello", "Worms")))
        assertTrue(result)
    }
}