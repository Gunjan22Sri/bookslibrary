package com.project.library.Repository;

import java.util.List;

import com.project.library.Model.Books;


public interface LibraryService {
    public void addBooks(Books books);
    public List<Books> showBooks();

}
