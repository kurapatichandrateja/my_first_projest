import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.st.Demo;

@CrossOrigin("*")
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Hello World - I am working!";
    }
    @RequestMapping("/chandu")
    String myhome() {
    	Demo demo=new Demo();
    	return demo.getString("Anil");
    }
    
    @RequestMapping("/getCredentials")
    String getCredentials(@RequestParam(name = "userName") String userName, @RequestParam(name = "password") String passWord) {
    	System.out.println("User name "+userName);
    	System.out.println("Pass word "+passWord);
    	return "Success";
    }
    
    

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }

}
