
package de.krasosu.spring.data.es.controller;

import de.krasosu.spring.data.es.model.Author;

import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AuthorController {

    @RequestMapping(value = "/author", method = RequestMethod.GET)
    public @ResponseBody Author getAuthor() {

        return new Author();
    }

}
