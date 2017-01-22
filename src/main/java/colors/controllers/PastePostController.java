package colors.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

/**
 * Created by joe on 1/21/17.
 */

@Controller
public class PastePostController {

    @RequestMapping(path = "/paste", method = RequestMethod.POST)
    public String pasteText(HttpSession session, String document) {
        session.setAttribute("rawText", document);

        return "redirect:/displayResults";
    }
}


