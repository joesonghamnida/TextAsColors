package colors.controllers;

import colors.Word;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import colors.converters.*;
import colors.consoleColors.*;

@Controller
public class DisplayGetController {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home() {
        return ("home");
    }

    @RequestMapping(path = "/displayResults", method = RequestMethod.GET)
    public String displayResults(HttpSession session, Model model) throws FileNotFoundException {
        String rawText = (String) session.getAttribute("rawText");

        ArrayList<Word> bytes = TextToByte.textToByte(rawText);

        PrintConsoleColors.printConsoleColors(bytes);

        model.addAttribute("results", bytes);
        return ("home");
    }
}
