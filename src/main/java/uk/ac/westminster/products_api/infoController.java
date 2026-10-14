package uk.ac.westminster.products_api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class infoController{
        @GetMapping("/info")
        public String getInfo(){
            return "MY first Sprint application";


        }

}
