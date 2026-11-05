package Project1.InMemoryKeyValue_Redis;

import java.util.HashMap;
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
        Map<String,Object> attributes=new HashMap<>();
        for(Pair<String,String> pair:listofAttributes){
            String attributeskey=pair.getK();
            String attributevalue=pair.getV();

            attributes.put(attributeskey,determineTypeOfAttributeValue(attributevalue));
        }
        store.put(key,new valueofObject(attributes));
    }

    private Object determineTypeOfAttributeValue(String attributevalue) {
        return attributevalue;
    }

    public void delete(String key){

    }

    public List<String> keys(){

    }
}
