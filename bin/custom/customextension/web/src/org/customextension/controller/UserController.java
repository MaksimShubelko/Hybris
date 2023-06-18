package org.customextension.controller;

import de.hybris.platform.core.model.user.UserModel;
import de.hybris.platform.servicelayer.user.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Objects;

@RequestMapping("/user")
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping
    public String showUser(@RequestParam(required = false) String uid, Model model) {
        UserModel userModel;

        if (Objects.isNull(uid)) {
            userModel = userService.getCurrentUser();
        } else {
            userModel = userService.getUserForUID(uid);
        }

        model.addAttribute("user", userModel);

        return "user";
    }
}
