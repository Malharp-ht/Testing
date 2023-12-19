import org.junit.Assert;
import org.junit.Test;

public class missingNumberTest {
    public static void main(String[] args) {
        
    }
    @Test
    public void testMissing(){
        missingNumber missing = new missingNumber();
        int[] arr ={1,2,4,5,7,8,3,9};
        int a = missing.getMissing(arr);
        Assert.assertEquals(6,a);
    }
}
