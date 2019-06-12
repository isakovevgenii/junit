package main.logic.jr;

import java.util.Map;
import java.util.stream.Collectors;

public class Where {
    public static String getQuery(Map<String, String> params){
        return params.entrySet().stream()
                .filter(p -> p.getValue() != null)
                .map(p -> p.getKey() + "=" + p.getValue())
                .collect(Collectors.joining(","));
    }
}
