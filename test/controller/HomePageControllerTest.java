package controller;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class HomePageControllerTest {

    @Test
    public void shouldDisplayHello() {
        HomePageController homePageController = new HomePageController();
        assertThat(homePageController.home(),is("Hello World!"));

    }

    @Test
    public void shouldKnowDisplayHelloDoesNotDisplayStrangeMessage(){
        HomePageController homePageController = new HomePageController();
        assertThat(homePageController.home(), is(not("Blah Blah Blah")));
    }
}
