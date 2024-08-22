package com.secure.notes.services;

import com.secure.notes.models.Note;

import java.util.List;

public interface NoteService {

    Note createNoteForUser(String username, String content);

    Note updateNoteForUser(Long noteId, String content, String username);

    void deleteNoteForUser(Long noteId);

    List<Note> getNotesForUser(String username);
}
