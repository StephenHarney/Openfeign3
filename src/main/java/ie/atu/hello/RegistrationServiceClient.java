package ie.atu.hello;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "Confirmation-Service",url = "/localhost:8080")
public interface RegistrationServiceClient {

    @PostMapping("/Confirm")
        String someDetails(@RequestBody UserDetails userDetails);




}
