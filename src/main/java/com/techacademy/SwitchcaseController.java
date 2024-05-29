//多項分岐（th:switch / th:case）3つ以上の値を表示したいとき。
package com.techacademy;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SwitchcaseController {

	@GetMapping("/switchcase/{val}/")
	public String getSwitchcase(@PathVariable int val, Model model) {
		model.addAttribute("val", val);
		return "switchcase";
	}
}