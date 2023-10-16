package ie.atu.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.Map;


@RestController
public class UserController {


    private RegistrationServiceClient registrationServiceClient;
    //private final AcknowledgeService acknowledgeService;


    @Autowired
    public UserController(RegistrationServiceClient registrationServiceClient){
        //this.acknowledgeService = acknowledgeService;
        this.registrationServiceClient = registrationServiceClient;

    }

    @PostMapping("/confirm-and-register")
    public Map<String, String> confirmAndController(@RequestBody UserDetails userDetails){
        //return registrationServiceClient.someDetails(userDetails);
        String confirm = registrationServiceClient.someDetails(userDetails);
         //String confirm = "Test;
         Map<String, String> responseMessage = new HashMap<>();
         responseMessage.put("Registration", confirm);
         return responseMessage;
    }



}
