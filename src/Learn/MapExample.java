package Learn;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> courses=new HashMap<>();
        courses.put("core java",4000);
        courses.put("python",8000);

        System.out.println(courses);
    }
}
