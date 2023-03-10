// package com.project.library;

// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// import org.junit.Before;
// import org.junit.Test;
// import org.junit.runner.RunWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.Mockito;
// import org.mockito.MockitoAnnotations;
// import org.mockito.junit.MockitoJUnitRunner;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.setup.MockMvcBuilders;

// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.fasterxml.jackson.databind.ObjectWriter;
// import com.project.library.Dao.Librarydao;
// import com.project.library.Model.Books;
// import com.project.library.controller.LibraryController;

// @RunWith(MockitoJUnitRunner.class)
// public class ControllerTest {
//     private MockMvc mockMvc;

//     ObjectMapper objectMapper = new ObjectMapper();
//     ObjectWriter objectWriter = objectMapper.writer();

//     @Mock
//     private Librarydao librarydao;

//     @InjectMocks
//     private LibraryController libraryController;

//     Books book1 = new Books(1, "abc1", "gunjan");
//     Books book2 = new Books(2, "abc2", "aashi");
//     Books book3 = new Books(3, "abc3", "saurav");

//     @Before
//     public void setUp() {
//         MockitoAnnotations.initMocks(this);
//         this.mockMvc = MockMvcBuilders.standaloneSetup(libraryController).build();
//     }

//     @Test
//     public void getRecords() {
//         List<Books> records = new ArrayList(Arrays.asList(book1, book2, book3));
// Mockito.when(librarydao.findAll()).thenReturn(records);
// mockMvc.perform(null)

//     }
// }
