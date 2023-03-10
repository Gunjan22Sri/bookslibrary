package com.project.library.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.library.Dao.Librarydao;
import com.project.library.Model.Books;

@Service
public class LibraryServiceImpl implements LibraryService {

    @Autowired
    Librarydao librarydao;

    @Override
    public void addBooks(Books books) {
        librarydao.save(books);
    }

    @Override
    public List<Books> showBooks() {
        return librarydao.findAll();
    }

}
