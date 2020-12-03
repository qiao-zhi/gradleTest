import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        System.out.println("1234");

        List<String> result = Arrays.asList(new String[]{"1", "2"});
        String join = StringUtils.join(result, ";");
        System.out.println(join);
    }
}
