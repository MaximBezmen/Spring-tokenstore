package com.tokenstore.Spring.tokenstore.controllers;

import com.tokenstore.Spring.tokenstore.entites.RandomCity;
import com.tokenstore.Spring.tokenstore.entites.User;
import com.tokenstore.Spring.tokenstore.service.GenericService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jwttest")
public class ResourceController {

    private final GenericService userService;

    private final ConsumerTokenServices tokenServices;

    public ResourceController(GenericService userService, ConsumerTokenServices tokenServices) {
        this.userService = userService;
        this.tokenServices = tokenServices;
    }

    @GetMapping(value ="/cities")
    //@PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public List<RandomCity> getUser(){
        return userService.findAllRandomCities();
    }

    @GetMapping(value ="/users")
    //@PreAuthorize("hasAuthority('ADMIN_USER')")
    @Secured("ADMIN_USER")
    public List<User> getUsers(){
        return userService.findAllUsers();
    }



    @PostMapping(value = "/tokens/revoke/{tokenId}")
    @PreAuthorize("hasAuthority('ADMIN_USER') or hasAuthority('STANDARD_USER')")
    public String revokeToken(@PathVariable String tokenId) {
        tokenServices.revokeToken(tokenId);
        return tokenId;
    }

}