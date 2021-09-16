package com.example.demo;

import org.junit.Test;
import org.junit.runner.Request;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(EndpointsController.class)

public class EndpointsControllerTest {

    @Autowired
    MockMvc mvc;

    @Test
    public void testEndpoints() throws Exception {
        RequestBuilder request = MockMvcRequestBuilders.get("/");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Get to index route"));
    }

    @Test
    public void testGetTasks() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.get("/tasks");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("These are tasks"));
    }

    @Test
    public void testPostTasks() throws Exception{
        RequestBuilder request = MockMvcRequestBuilders.post("/tasks");

        this.mvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("You just POSTed to /tasks"));
    }
}
