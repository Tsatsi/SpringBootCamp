package controller;

import org.junit.Test;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HomePageControllerTest {

    @Test
    public void shouldDisplayHello() {
        HomePageController homePageController = new HomePageController();
        assertThat(homePageController.home(),is("Hello World!"));

    }
}
