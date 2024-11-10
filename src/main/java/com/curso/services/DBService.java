package com.curso.services;

import com.curso.domains.Autor;
import com.curso.domains.Editora;
import com.curso.domains.Livro;
import com.curso.domains.enums.Conservacao;
import com.curso.domains.enums.Status;
import com.curso.repositories.AutorRepository;
import com.curso.repositories.EditoraRepository;
import com.curso.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
@Service
public class DBService {

    @Autowired
    private AutorRepository autorRepo;

    @Autowired
    private EditoraRepository editoraRepo;

    @Autowired
    private LivroRepository livroRepo;

    public void initDB(){

        Editora editora01 = new Editora(null,"00023123123","A");
        Editora editora02 = new Editora(null,"30032132123","B");
        Editora editora03 = new Editora(null,"32130000123","C");

        Autor autor01 = new Autor(null,"Tião", "12090990987");
        Autor autor02 = new Autor(null,"Tonhão","986453667750");
        Autor autor03 = new Autor(null,"Tiãonhão","989999999920");

        Livro livro01 = new Livro(null,"Livro A","0001",1000,
                LocalDate.now(), new BigDecimal("454.00"), editora01, autor01, Status.LENDO,Conservacao.BOM);
        Livro livro02 = new Livro (null,"Livro B","0002", 3000,
                LocalDate.now(), new BigDecimal("455.00"), editora02, autor02,Status.LIDO, Conservacao.MARCADEUSO);
        Livro livro03 = new Livro (null,"Livro C","0003", 3200,
                LocalDate.now(), new BigDecimal("456.00"), editora02, autor02,Status.LIDO, Conservacao.MARCADEUSO);


        editoraRepo.save(editora01);
        editoraRepo.save(editora02);
        editoraRepo.save(editora03);
        autorRepo.save(autor01);
        autorRepo.save(autor02);
        autorRepo.save(autor03);
        livroRepo.save(livro01);
        livroRepo.save(livro02);
        livroRepo.save(livro03);
    }
}