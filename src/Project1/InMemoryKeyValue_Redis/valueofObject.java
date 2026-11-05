package Project1.InMemoryKeyValue_Redis;

import java.util.HashMap;
import java.util.Map;

public class valueofObject {

        private final Map<String,Object> attributes;

    public valueofObject(Map<String, Object> attributes) {
        this.attributes = new HashMap<>(attributes);
    }

    public Map<String, Object> getAttributes() {
        return attributes;
    }
}
