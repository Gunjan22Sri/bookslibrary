package com.project.library.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.project.library.Model.Books;

public interface Librarydao extends JpaRepository<Books, Integer> {

}
