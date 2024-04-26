package org.launchcode.skillstrackerstudio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String showLanguages() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Languages you can learn: </h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>Python</li>" +
                "<li>C#</li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @GetMapping("form")
    @ResponseBody
    public String createForm() {
        return "<html>" +
                "<body>" +
                "<form method='post'>" + // tells the form to submit a request to /ranking (which already works with helloWithQueryParam
                "<h1>Name: </h1>" +
                "<input type='text' name='name'>" +
                "<br />" +
                "<br />" +
                "<label>My Favorite Language:<br /><select name='firstChoice'>" +
                "<option value=''>--Please choose a language--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C#'>C#</option>" +
                "</select><br />" +
                "<label>My Second Favorite Language:<br />" +
                "<select name='secondChoice'>" +
                "<option value=''>--Please choose a language--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C#'>C#</option>" +
                "</select><br />" +
                "<label>My Third Favorite Language:<br />" +
                "<select name='thirdChoice'>" +
                "<option value=''>--Please choose a language--</option>" +
                "<option value='Java'>Java</option>" +
                "<option value='Python'>Python</option>" +
                "<option value='C#'>C#</option>" +
                "</select><br />" +
                "<br />" +

                "<input type='submit' value='Submit choices!'><br />" +
                "</form>" +
                "</body>" +
                "</html>";
    }

    @PostMapping(value="form")
    @ResponseBody
    public String ranking(@RequestParam String name, @RequestParam String firstChoice, @RequestParam String secondChoice, @RequestParam String thirdChoice) {
        return "<html>" +
                "<h1>" + name + "'s Preferred Coding Languages: </h1>" +
                "<ol>" +
                "<li>" + firstChoice + "</li>" +
                "<li>" + secondChoice + "</li>" +
                "<li>" + thirdChoice + "</li>" +
                "</ol>" +
                "</html>";
    }
}
