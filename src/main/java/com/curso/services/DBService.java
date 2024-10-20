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

        Editora editora01 = new Editora(0,"166178653123","A");
        Editora editora02 = new Editora(0,"321326678123","B");
        Editora editora03 = new Editora(0,"323333338123","C");

        Autor autor01 = new Autor(0,"Tiao", "18888812-90");
        Autor autor02 = new Autor(0,"Jotta","98799999920");
        Autor autor03 = new Autor(0,"Pedro","98700000020");

        Livro livro01 = new Livro(0,"Livro A","12345",500,
                LocalDate.now(), new BigDecimal("150.00"), editora01, autor01,Status.LENDO,Conservacao.BOM);
        Livro livro02 = new Livro (0,"Livro B","54321", 300,
                LocalDate.now(), new BigDecimal("90.00"), editora02, autor02,Status.LIDO, Conservacao.MARCADEUSO);
        Livro livro03 = new Livro (0,"Livro C","12355", 300,
                LocalDate.now(), new BigDecimal("500.00"), editora03, autor03,Status.LIDO, Conservacao.BOM);


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
