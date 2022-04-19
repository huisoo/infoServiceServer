package be.infoService;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@Component
public class CustomHandler {

    public Mono<ServerResponse> someRequestMethod(ServerRequest request){

        Map<String, String> retMap = new HashMap<String,String>();
        retMap.put("job", "");

        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(retMap);
    }
}
