package br.com.joao.linguagens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LanguageController {

    @Autowired
    private LanguageRepository repository;

    @GetMapping(value="/languages")
    public List<Language> obtainLanguages(){
        List<Language> languages = repository.findAll();
        return languages;
    }

    @PostMapping(value="/languages")
    public Language newLanguage(@RequestBody Language language){
        Language saveLanguage = repository.save(language);
        return saveLanguage;
    }

    @DeleteMapping(value="/languages/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteLanguage(@RequestParam String id){
        repository.deleteById(id);
        return new ResponseEntity<String>("Linguagem deletada com sucesso", HttpStatus.OK);
    }

}
