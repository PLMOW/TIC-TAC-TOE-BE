package TICTACTOE.TICTACTOE.Controller;

import TICTACTOE.TICTACTOE.Service.MusicParserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/music")
public class MusicParserController {

    private final MusicParserService musicParserService;

    public MusicParserController(MusicParserService musicParserService){
        this.musicParserService = musicParserService;
    }

    @GetMapping
    public JSONArray getName(@RequestParam("query") String query) throws ParseException, JsonProcessingException {
        return musicParserService.getList(query);
    }

}
