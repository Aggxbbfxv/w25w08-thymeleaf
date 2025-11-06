package kr.ac.kumoh.s20220300.w25w08_thymeleaf.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class SongController {
    @GetMapping("/songs/random")
    fun getRandomSong(model: Model): String {
        model.addAttribute("SongTitle", "Soda pop")
        return "random"
    }
}