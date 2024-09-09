package com.example.gift.infrastructure.retrofit;

import com.example.gift.infrastructure.gift.order.RetrofitOrderApi;
import lombok.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RetrofitServiceRegistry {

    @Value("${example.order.base-url}")
    private String baseUrl;

    @Bean
    public RetrofitOrderApi retrofitOrderApi() {
        var retrofit = RetrofitUtils.initRetrofit(baseUrl);
        return retrofit.create(RetrofitOrderApi.class);
    }
}
