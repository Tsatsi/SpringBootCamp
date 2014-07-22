package com.thoughtworks.springbootproject.controllers;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HomePageControllerTest  {
    @Test
    public void testShouldDisplayHelloWorld() throws Exception {
        HomePageController homePageController = new HomePageController();
        assertThat(homePageController.home(),is("Hello world"));

    }
}
