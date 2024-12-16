package com.app.Diary.service;

import com.app.Diary.model.Notes;
import com.app.Diary.repository.NotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotesService {
    @Autowired
    private NotesRepository notesRepository;

    public List<Notes> getNotes(){
        return notesRepository.findAll();
    }

    public Notes addNote(Notes notes){
        return notesRepository.save(notes);
    }

    public void deleteNote(String id){
        notesRepository.deleteById(id);
    }
    public Notes updateNote(Notes notes){
        return notesRepository.save(notes);
    }

}
