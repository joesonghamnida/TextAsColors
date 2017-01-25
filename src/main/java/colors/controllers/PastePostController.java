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
    public String pasteText(HttpSession session, String document, String conversion) {
        session.setAttribute("rawText", document);

        if(conversion.isEmpty()){
            conversion="Decimal";
        }

        session.setAttribute("conversion",conversion);

        return "redirect:/displayResults";
    }
}


