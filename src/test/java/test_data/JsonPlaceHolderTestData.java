package test_data;

import java.util.HashMap;
import java.util.Map;

public class JsonPlaceHolderTestData {
    public Map<String,Object> expectedData(Integer userId, String title, Boolean completed){
        Map<String,Object> expectedData = new HashMap<>();
        if (userId != null) {// Ekelemek istemedigim degerleri null atiyorum
            expectedData.put("userId", userId);
        }
        if (title != null) {
            expectedData.put("title", title);
        }
        if (completed != null) {
            expectedData.put("completed", completed);
        }


        return expectedData;
    }
}
