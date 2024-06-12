package com.remote.RemoteNews.service;

import com.remote.RemoteNews.config.RestTemplateConfig;
import com.remote.RemoteNews.response.NewsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class NewsService {
    @Autowired
    RestTemplate restTemplate;

    public NewsResponse getNews(String country, String api){
        String url = "https://newsapi.org/v2/top-headlines?country=in&apiKey=d1d1789630474996aea7b0faa8896c47";
        return restTemplate.getForObject(url, NewsResponse.class);

    }



}
