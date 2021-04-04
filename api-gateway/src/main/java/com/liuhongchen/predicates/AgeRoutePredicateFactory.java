package com.liuhongchen.predicates;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cloud.gateway.handler.predicate.AbstractRoutePredicateFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ServerWebExchange;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Component
public class AgeRoutePredicateFactory extends AbstractRoutePredicateFactory<AgeRoutePredicateFactory.Config> {

    public AgeRoutePredicateFactory() {
        super(AgeRoutePredicateFactory.Config.class);
    }

    public List<String> shortcutFieldOrder() {
        return Arrays.asList("minAge","maxAge");
    }

    public Predicate<ServerWebExchange> apply(AgeRoutePredicateFactory.Config config) {
        return new Predicate<ServerWebExchange>() {
            @Override
            public boolean test(ServerWebExchange serverWebExchange) {
                return true;
//                MultiValueMap<String, String> queryParams = serverWebExchange.getRequest().getQueryParams();
//                String ageStr = queryParams.getFirst("age");
//                if (StringUtils.isEmpty(ageStr))return false;
//                int age = Integer.parseInt(ageStr);
//                return age>=config.getMinAge()&&age<=config.getMaxAge();
            }
        };
    }

    @Data
    @NoArgsConstructor
    public static class Config {
        private int minAge;
        private int maxAge;
    }
}
