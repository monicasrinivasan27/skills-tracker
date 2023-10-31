package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {

    @GetMapping
    @ResponseBody
      public String SkillsList() {
        return "<h1> Skills Tracker </h1>"
                + "<h2> We have a few skills we would like to learn.Here is the list.</h2>"
                +"<ol> "
                + "<li>Java</li>"
                +"<li> JavaScript</li>"
                +"<li> Python </li>"
                +"</ol>";
    }
    @GetMapping("/form")
    @ResponseBody
    public String skillsForm(){
        return "<form method ='post'>"+
                "<br> Name:"+
                "<input type='text' name ='name'/>"+
                "<br> My favorite language <br>"+
                "<select name='firstChoice'>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "</select>"+
                "<br> My Second favorite language <br>"+
                "<select name='secondChoice'>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "</select>"+
                "<br> My third favorite language <br>"+
                "<select name='thirdChoice'>"+
                "<option value='Java'>Java</option>"+
                "<option value='Javascript'>Javascript</option>"+
                "<option value='Python'>Python</option>"+
                "</select><br>"+
                "<input type='submit' value='Submit' />"+
                "</form>"
                ;
    }
    @PostMapping("/form")
    @ResponseBody
    public String skillsHandleForm(@RequestParam String name,
                                   @RequestParam String firstChoice,
                                   @RequestParam String secondChoice,
                                   @RequestParam String thirdChoice){
        return "<h1>"+ name+ "</h1>"+
                "<ol>"+
                "<li>"+firstChoice+ "</li>"+
                "<li>"+secondChoice+ "</li>"+
                "<li>"+thirdChoice+ "</li>"+
                "</ol>";
    }
}