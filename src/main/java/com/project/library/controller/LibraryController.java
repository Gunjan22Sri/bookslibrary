package com.project.library.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.library.Model.Books;
import com.project.library.Model.Cart;
import com.project.library.Repository.LibraryService;


@Controller
public class LibraryController {

  @Autowired
  LibraryService libraryService;

  @GetMapping("/")
  public String getBook() {
    return "index";
  }

  @GetMapping("/index")
  public String getHome() {
    return "index";
  }

  // To open addbook page
  @GetMapping("/addbook")
  public String addBookPage() {
    return "addbook";
  }

  // To add a new nook
  @PostMapping("/addbook/register")
  public String bookRegister(@ModelAttribute Books books) {
    libraryService.addBooks(books);
    return "addbook";
  }

  // To get details of single book
  @GetMapping("/showdetail/book/{value}")
  public String getBooks(@PathVariable("value") String value, Model model) {
    model.addAttribute("item", value);

    // return "pathvariables/view";
    return "Books";
  }

  // To display the list of all books
  @GetMapping("/showdetail")
  public String showDetails(Model model) {
    model.addAttribute("all_books", libraryService.showBooks());
    model.addAttribute("cart", new Cart());
    return "booksdetail";
  }

  // @GetMapping("/getbookslist")
  // public String getBooks(Model model) {

  // return "booksdetail";
  // }

  // @GetMapping("/edit")
  // public String showEditForm(Model model) {
  // List<Books> books = new ArrayList<>();
  // libraryService.findAll().iterator().forEachRemaining(books::add);

  // model.addAttribute("form", new BooksCreationDto(books));
  // return "books/editBooksForm";
  // }

}
