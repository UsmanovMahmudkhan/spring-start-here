package spring.springExercise.SqExrs.RestServices.SendingObjects_AsResponseBody.Country;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping("/france")
    public CountryDTO getOne(@RequestParam String name, @RequestParam int population){
        return CountryDTO.of(name,population);
    }
}
