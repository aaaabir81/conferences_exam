package ma.xproce.conf.web;

import ma.xproce.conf.dao.entities.Speaker;
import ma.xproce.conf.dao.repositories.SpeakerRepository;
import ma.xproce.conf.dto.ConferenceDto;
import ma.xproce.conf.mapper.ConferenceMapper;
import ma.xproce.conf.service.IConferenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/conferences")
public class ConferenceController {

    @Autowired
    private IConferenceService conferenceService;

    @Autowired
    private SpeakerRepository  speakerRepository;

    private final ConferenceMapper conferenceMapper;

    public ConferenceController(ConferenceMapper conferenceMapper) {
        this.conferenceMapper = conferenceMapper;
    }

    @GetMapping
    public String Listconferences(Model model,
                                  @RequestParam(name = "search", defaultValue = "") String keyword) {
        List<ConferenceDto> conferences = conferenceService.getConferences();
        model.addAttribute("conferences", conferences);
        model.addAttribute("search", keyword);
        return "conferences";
    }


    @GetMapping("/speaker")
    public String consulterConferencesParSpeaker(@RequestParam("speaker") String sp, Model model) {
        Speaker speaker = speakerRepository.findByNom(sp);
        if (speaker == null) {
            model.addAttribute("message", "Speaker not found");
            return "conferences";
        }

        Integer id = speaker.getId();
        List<ConferenceDto> conferences = conferenceService.trouverConferencesParSpeaker(id);
        model.addAttribute("conferences", conferences);
        return "conferences";
    }

}
