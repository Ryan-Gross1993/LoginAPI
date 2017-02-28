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

    Login newLogin = new Login();

    @RequestMapping(value = "/send",
    method = {RequestMethod.POST},
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseStatus(value = HttpStatus.OK)
    public void place(@RequestBody JSONObject object) {


        newLogin.setActualName(object.getString("username"));
        newLogin.setActualPassword(object.getString("password"));

    }
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public boolean getAuth() {
        return newLogin.isLegit();
    }

}
