package com.app.Diary.controller;

import com.app.Diary.model.Reminders;
import com.app.Diary.service.RemindersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reminders")
public class RemindersController {
    @Autowired
    private RemindersService remindersService;

    @GetMapping
    public List<Reminders> getReminders(){
        return remindersService.getReminders();
    }
    @PostMapping
    public Reminders addReminder(@RequestBody Reminders reminders){
        return remindersService.addReminder(reminders);
    }
    @DeleteMapping("/{id}")
    public void deleteReminder(@PathVariable String id){
        remindersService.deleteReminder(id);
    }
    @PutMapping
    public Reminders updateReminder(@RequestBody Reminders reminders){
        return remindersService.updateReminder(reminders);
    }
}
