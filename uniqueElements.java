import java.util.HashMap;

public class uniqueElements{
    
    public static void main(String[] args) {
        String s ="My name is malhar I am from baramati i am";
        uniqueElements uni = new uniqueElements();
        uni.uniqueElementCount(s);   
    }
    public HashMap uniqueElementCount(String s){
            HashMap<String,Integer> map = new HashMap<>();
        String [] arr = s.split(" ");
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i].toLowerCase())){
                int count = map.get(arr[i]);  
                map.put(arr[i], ++count);  
            }
            else{
                map.put(arr[i].toLowerCase(), 1);
            }
        }
        System.out.println(map);
        return map;
        }
}