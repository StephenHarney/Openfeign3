package ie.atu.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.HashMap;
import java.util.Map;

public class UserController {


    private RegistrationServiceClient registrationServiceClient;
    private final AcknowledgeService acknowledgeService;


    @Autowired
    public UserController(AcknowledgeService acknowledgeService, RegistrationServiceClient registrationServiceClient){
        this.acknowledgeService =acknowledgeService;
        this.registrationServiceClient =registrationServiceClient;

    }

    @PostMapping("/confirm-and-register")
    public Map<String, String> confirmRegister(@RequestBody UserDetails userDetails){
        String confirm = registrationServiceClient.someDetails(userDetails);
        Map<String,String> responseMessage = new HashMap<>();
        responseMessage.put("Message",confirm);
        return responseMessage;
    }



}
