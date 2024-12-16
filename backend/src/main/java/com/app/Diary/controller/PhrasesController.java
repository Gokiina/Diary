package com.app.Diary.controller;

import com.app.Diary.model.Phrases;
import com.app.Diary.repository.PhrasesRepository;
import com.app.Diary.service.PhrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/phrases")
public class PhrasesController {
    @Autowired
    private PhrasesService phrasesService;

    @Autowired
    private PhrasesRepository phrasesRepository;

    // Obtener todas las frases
    @GetMapping
    public List<Phrases> getPhrases() {
        return phrasesService.getPhrases();
    }

    // Añadir una frase
    @PostMapping
    public Phrases addPhrase(@RequestBody Phrases phrases) {
        return phrasesService.addPhrase(phrases);
    }

    // Actualizar una frase
    @PutMapping
    public Phrases updatePhrase(@RequestBody Phrases phrases) {
        return phrasesService.updatePhrase(phrases);
    }

    // Eliminar una frase
    @DeleteMapping("/{id}")
    public void deletePhrase(@PathVariable String id) {
        phrasesService.deletePhrase(id);
    }

    // Obtener frases favoritas
    @GetMapping("/favorites")
    public List<Phrases> getFavoritePhrases() {
        return phrasesService.getFavoritePhrases();
    }

    @PostMapping("/{id}/favorite")
    public Phrases addFavoritePhrase(@PathVariable String id) {
        Optional<Phrases> phraseOptional = phrasesRepository.findById(id);
        if (phraseOptional.isPresent()) {
            Phrases phrase = phraseOptional.get();
            phrase.setFavorite(true);
            return phrasesRepository.save(phrase);
        }
        return null; // Manejar adecuadamente en caso de no encontrar la frase
    }

    @DeleteMapping("/{id}/favorite")
    public Phrases removeFavoritePhrase(@PathVariable String id) {
        Optional<Phrases> phraseOptional = phrasesRepository.findById(id);
        if (phraseOptional.isPresent()) {
            Phrases phrase = phraseOptional.get();
            phrase.setFavorite(false);
            return phrasesRepository.save(phrase);
        }
        return null; // Manejar adecuadamente en caso de no encontrar la frase
    }
}

