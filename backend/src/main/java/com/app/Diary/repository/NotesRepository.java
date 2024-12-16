package com.app.Diary.repository;

import com.app.Diary.model.Notes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NotesRepository extends MongoRepository<Notes, String> {
}
