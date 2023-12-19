import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;

public class testUnique {
    public static void main(String[] args) {
        testUnique u = new testUnique();
    }
    @Test
    public void testCount(){
        uniqueElements uni = new uniqueElements();
        String s ="My name is malhar I am from baramati i am";
        HashMap<String,Integer> map = new HashMap<>();
        map.put("my",1);
        map.put("baramati",1);
        map.put("name",1);
        map.put("malhar",1);
        map.put("i",2);
        map.put("is",1);
        map.put("from",1);
        map.put("am",2);

        Assert.assertEquals(map, uni.uniqueElementCount(s));

    }
}
