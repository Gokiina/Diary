package com.app.Diary.service;

import com.app.Diary.model.Reminders;
import com.app.Diary.repository.RemindersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RemindersService {
    @Autowired
    private RemindersRepository remindersRepository;

    public List<Reminders> getReminders(){
        return remindersRepository.findAll();
    }

    public Reminders addReminder(Reminders reminders){
        return remindersRepository.save(reminders);
    }
    public void deleteReminder(String id){
        remindersRepository.deleteById(id);
    }
    public Reminders updateReminder(Reminders reminders){
        return remindersRepository.save(reminders);
    }
}
