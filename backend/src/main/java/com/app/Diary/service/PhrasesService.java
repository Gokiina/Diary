package com.app.Diary.service;

import com.app.Diary.model.Phrases;
import com.app.Diary.repository.PhrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhrasesService {
    @Autowired
    private PhrasesRepository phrasesRepository;

    // Obtener todas las frases
    public List<Phrases> getPhrases() {
        return phrasesRepository.findAll();
    }

    // Añadir una frase
    public Phrases addPhrase(Phrases phrases) {
        return phrasesRepository.save(phrases);
    }

    // Actualizar una frase
    public Phrases updatePhrase(Phrases phrases) {
        return phrasesRepository.save(phrases);
    }

    // Eliminar una frase
    public void deletePhrase(String id) {
        phrasesRepository.deleteById(id);
    }

    // Obtener frases favoritas
    public List<Phrases> getFavoritePhrases() {
        return phrasesRepository.findByIsFavoriteTrue();
    }

    // Añadir una frase a favoritos
    public Phrases addFavoritePhrase(String id) {
        Phrases phrase = phrasesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Frase no encontrada"));
        phrase.setFavorite(true); // Marcar como favorita
        return phrasesRepository.save(phrase);
    }

    // Eliminar una frase de favoritos
    public Phrases removeFavoritePhrase(String id) {
        Phrases phrase = phrasesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Frase no encontrada"));
        phrase.setFavorite(false); // Quitar de favoritos
        return phrasesRepository.save(phrase);
    }
}
