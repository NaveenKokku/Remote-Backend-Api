package com.remote.RemoteNews.controller;

import com.remote.RemoteNews.response.NewsResponse;
import com.remote.RemoteNews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/news")
public class NewsController {
    @Autowired
    NewsService newsService;

    @GetMapping("/get")
    public NewsResponse getNews(@RequestParam("country") String country,
                                @RequestParam("apiKey") String apiKey){
        return newsService.getNews(country, apiKey);
    }

}
