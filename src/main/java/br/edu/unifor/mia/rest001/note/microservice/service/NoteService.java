package br.edu.unifor.mia.rest001.note.microservice.service;

import java.util.List;

import br.edu.unifor.mia.rest001.note.microservice.model.Note;

public interface NoteService {

	List<Note> getAllNotes();

	Note createNote(Note note);

	Note getNoteById(Long noteId);

	Note updateNote(Long noteId, Note noteDetails);

	void deleteNote(Long noteId);

}