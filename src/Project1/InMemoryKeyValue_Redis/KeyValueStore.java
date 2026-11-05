package Project1.InMemoryKeyValue_Redis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class KeyValueStore {

    private final Map<String, valueofObject> store=new ConcurrentHashMap<>();
    private final Map<String, Class<?>> attributeTypeRegistry = new ConcurrentHashMap<>();


    public Map<String,Object> get(String key){
        if(store.containsKey(key)){
            return store.get(key).getAttributes();
        }
        return null;
    }

    public List<String> search(String attributesKey, String attributesValue){
        List<String> matchingKeys = new ArrayList<>();
        for(Map.Entry<String ,valueofObject> entry: store.entrySet()) {
            Object value = entry.getValue().getAttributes().get(attributesKey);
            if(value != null && attributesValue.equals(value.toString())){
                matchingKeys.add(entry.getKey());
            }
        }
        return matchingKeys;
    }

    public void put(String key,List<Pair<String ,String>> listofAttributes){
        Map<String,Object> attributes=new HashMap<>();
        for(Pair<String,String> pair:listofAttributes){
            String attributeskey=pair.getK();
            String attributevalue=pair.getV();

            attributes.put(attributeskey,determineTypeOfAttributeValue(attributeskey,attributevalue));
        }
        store.put(key,new valueofObject(attributes));
    }

    private Object determineTypeOfAttributeValue(String attributeKey,String attributeValue) {
        // regular expression
        // try -> Integer.parseInt(attributeValue); , Double.parseDouble
        Object attributeTypeValue;
        if(attributeValue.matches("-?\\d+")) {
            attributeTypeValue =  Integer.parseInt(attributeValue);
        } else if(attributeValue.matches("-?\\d+\\.\\d+")) {
            attributeTypeValue =  Double.parseDouble(attributeValue);
        } else if ("true".equalsIgnoreCase(attributeValue) ||  "false".equalsIgnoreCase(attributeValue)) {
            attributeTypeValue =  Boolean.parseBoolean(attributeValue);
        } else {
            attributeTypeValue = attributeValue;
        }

        Class<?> currentClass = attributeTypeValue.getClass();
        Class<?>  instertedClass = attributeTypeRegistry.putIfAbsent(attributeKey, currentClass);

        if(instertedClass!= null && !instertedClass.equals(currentClass)) {
            throw new IllegalArgumentException(
                    "Attribute Key "+ attributeKey +" is conflict as already different type indexed for this. Expected is"+ instertedClass.getSimpleName() + "But got :"+ currentClass.getSimpleName()
            );
        }

        return attributeTypeValue;
    }

    public void delete(String key){
        store.remove(key);

    }

    public List<String> keys(){
    return new ArrayList<>(store.keySet());
    }
}
