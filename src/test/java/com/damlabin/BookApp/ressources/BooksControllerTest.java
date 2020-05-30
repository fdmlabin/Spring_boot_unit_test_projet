package com.damlabin.BookApp.ressources;

import com.damlabin.BookApp.BookAppApplication;
import com.damlabin.BookApp.domain.Books;
import com.damlabin.BookApp.repository.BooksRepository;
import com.damlabin.BookApp.services.BooksServices;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.time.LocalDate;

import static org.hamcrest.Matchers.is;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by francis on 5/30/20.
 */
@RunWith(SpringRunner.class)
@WebMvcTest(controllers = BooksController.class)
@ContextConfiguration(classes = BookAppApplication.class)
public class BooksControllerTest {


    @Autowired
    protected MockMvc mockMvc;

    @MockBean
    protected BooksServices booksServices;

    @MockBean
    protected BooksRepository booksRepository;

    protected Books book;
    protected LocalDate creationDate;


    @Before
    public void setup() {

        // given
        creationDate = LocalDate.of(2020, 5, 30);
        book = new Books("Sous la cendre le feu", "Œuvre de Eveline Mpoudi Ngole", creationDate);
        Mockito.reset(booksServices);
    }

    @Test
    public void shouldReturnFoundBooks() throws Exception{

        // when
        when(this.booksServices.findBookById(1L)).thenReturn(book);

        // then
        mockMvc.perform(get("/api/book/1").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.nom", is("Sous la cendre le feu")))
                .andExpect(jsonPath("$.description", is("Œuvre de Eveline Mpoudi Ngole")))
                .andExpect(jsonPath("$.datePublication", is(creationDate.toString())))
                .andDo(print());
    }
}