package zcw.rgross;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ryan on 2/28/17.
 */
@RestController
public class LoginContoller {

    @RequestMapping(value = "/send", method="RequestMethod.POST", produces="text/plain")
    @ResponseBody
    public String login(String name, String password) {
        Login user = new Login(name, password);
        return user.isLegit();
    }

}
