package id.prestige;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

import static java.nio.charset.StandardCharsets.UTF_8;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("/v1/user/{id}")
    public Users show(@PathVariable String id) {
        int idUser = Integer.parseInt(id);
        return userRepository.findOne(idUser);
    }

    @PostMapping("/v1/user/create")
    public Users create(@RequestBody Map<String, String> body) throws NoSuchAlgorithmException {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date = myDateObj.format(myFormatObj);

        String username = body.get("username");
        String password = body.get("password");
        int status      = 1;

        return userRepository.save(new Users(username, hashPassword(password), status, date, date));
    }

    @PutMapping("user/{id}")
    public Users update(@PathVariable String id, @RequestBody Map<String, String> body) throws NoSuchAlgorithmException {
        int idUser = Integer.parseInt(id);
        Users users = userRepository.findOne(idUser);
        users.setUsername(body.get("username"));
        users.setPassword(hashPassword(body.get("password")));

        return userRepository.save(users);
    }

    public String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] hashInBytesPassword  = md.digest(password.getBytes(UTF_8));

        StringBuilder sbPassword = new StringBuilder();
        for (byte bP : hashInBytesPassword) {
            sbPassword.append(String.format("%02x", bP));
        }

        return sbPassword.toString();
    }
}
