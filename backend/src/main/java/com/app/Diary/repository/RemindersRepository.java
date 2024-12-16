package com.app.Diary.repository;

import com.app.Diary.model.Reminders;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RemindersRepository extends MongoRepository<Reminders, String> {
}
