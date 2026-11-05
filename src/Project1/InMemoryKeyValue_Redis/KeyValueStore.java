package Project1.InMemoryKeyValue_Redis;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class KeyValueStore {

    private final Map<String, valueofObject> store=new ConcurrentHashMap<>();

    public Map<String,Object> get(String key){
        if(store.containsKey(key)){
            return store.get(key).getAttributes();
        }
        return null;
    }

    public List<String> search(String attributesKey, String attributesValue){

    }

    public void put(String key,List<Pair<String ,String>> listofAttributes){

    }

    public void delete(String key){

    }

    public List<String> keys(){

    }
}
