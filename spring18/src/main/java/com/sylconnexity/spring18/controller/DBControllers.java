package com.sylconnexity.spring18.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sylconnexity.spring18.dbschema.*;

@Controller
@RequestMapping(path="/click")
class ClickController {
    @Autowired
    private ClickRepository clickRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Click> getAllClicks() {
        return clickRepository.findAll();
    }
}

@Controller
@RequestMapping(path="/link")
class LinkController {
    @Autowired
    private LinkRepository linkRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Link> getAllLinks() {
        return linkRepository.findAll();
    }
}

@Controller
@RequestMapping(path="/merchant")
class MerchantController {
    @Autowired
    private MerchantRepository merchantRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Merchant> getAllMerchants() {
        return merchantRepository.findAll();
    }
}

@Controller
@RequestMapping(path="/publisher")
class PublisherController {
    @Autowired
    private PublisherRepository publisherRepository;

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }
}

/*@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
class DBController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private LinkRepository linkRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Link> getAllUsers() {
        // This returns a JSON or XML with the users
        return linkRepository.findAll();
    }
}*/