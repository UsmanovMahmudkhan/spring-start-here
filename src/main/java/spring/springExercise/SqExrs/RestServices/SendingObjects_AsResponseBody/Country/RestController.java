package spring.springExercise.SqExrs.RestServices.SendingObjects_AsResponseBody.Country;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @PostMapping("/france")
    public CountryDTO getOne(@RequestParam String name, @RequestParam int population){
        return CountryDTO.of(name,population);
    }

    @GetMapping("/all")
    public List<CountryDTO> getAll(){
        var c1=CountryDTO.of("Uzbekistan",35_000_000);
        var c2=CountryDTO.of("South Korea",56_000_000);
        return List.of(c1,c2);
    }

    @GetMapping("/custom")
    public ResponseEntity<CountryDTO>responseEntity(){
        var c1=CountryDTO.of("Russia",150_000_000);
        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("continent","western+MiddleEast")
                .header("something","someotherthing")
                .body(c1);
    }
}
