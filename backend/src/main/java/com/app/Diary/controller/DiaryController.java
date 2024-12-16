package com.app.Diary.controller;

import com.app.Diary.model.Diary;
import com.app.Diary.service.DiaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diary")
public class DiaryController {
    @Autowired
    private DiaryService diaryService;

    @GetMapping
    public List<Diary> getDiaryPage() {
        return diaryService.getDiaryPage();
    }

    @PostMapping
    public Diary addDiaryPage(@RequestBody Diary diary) {
        return diaryService.addDiaryPage(diary);
    }

    @DeleteMapping("/{id}")
    public void deleteDiaryPage(@PathVariable String id) {
        diaryService.deleteDiaryPage(id);
    }

    @PutMapping
    public Diary updateDiaryPage(@RequestBody Diary diary) {
        return diaryService.updateDiaryPage(diary);
    }
}
