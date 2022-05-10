package tacos;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

public class HomeController {
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
//muốn import thư viện, trỏ chuột tại thư viện đó avf bấm ctrl + shift+ M
//muốn format code, bấm strl+shift+ F