package Project1.InMemoryKeyValue_Redis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class KeyValueStore {

    private final Map<String, valueofObject> store=new ConcurrentHashMap<>();
    private final Map<String, Class<?>> attributeTypeRegistry = new ConcurrentHashMap<>();

    private final ReentrantReadWriteLock reentrantLock=new ReentrantReadWriteLock();

    public Map<String,Object> get(String key){
        reentrantLock.readLock().lock();
        try {
            if(store.containsKey(key)){
                return store.get(key).getAttributes();
            }
            return null;
        }finally {
            reentrantLock.readLock().unlock();

        }

    }

    public List<String> search(String attributesKey, String attributesValue){
        reentrantLock.readLock().lock();
       try {
           List<String> matchingKeys = new ArrayList<>();
           for(Map.Entry<String ,valueofObject> entry: store.entrySet()) {
               Object value = entry.getValue().getAttributes().get(attributesKey);
               if(value != null && attributesValue.equals(value.toString())){
                   matchingKeys.add(entry.getKey());
               }
           }
           return matchingKeys;
       }finally {
           reentrantLock.readLock().unlock();
       }
    }

    public void put(String key,List<Pair<String ,String>> listofAttributes){
        reentrantLock.writeLock().lock();
       try{
           Map<String,Object> attributes=new HashMap<>();
           for(Pair<String,String> pair:listofAttributes){
               String attributeskey=pair.getK();
               String attributevalue=pair.getV();

               attributes.put(attributeskey,determineTypeOfAttributeValue(attributeskey,attributevalue));
           }
           store.put(key,new valueofObject(attributes));
       }finally {
            reentrantLock.writeLock().lock();
       }
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
        reentrantLock.writeLock().lock();
        try {
            store.remove(key);
        }finally {
            reentrantLock.writeLock().unlock();
        }


    }

    public List<String> keys(){
        reentrantLock.readLock().lock();
        try {
            return new ArrayList<>(store.keySet());
        }finally {
            reentrantLock.readLock().unlock();
        }

    }
}
