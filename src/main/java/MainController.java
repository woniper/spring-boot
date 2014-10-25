import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by woniper on 14. 10. 25..
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping
    public @ResponseBody String index() {
        return "Hello Woniper Spring Boot~";
    }
}
