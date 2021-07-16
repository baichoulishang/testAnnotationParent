package baichoulishang.demo;

import java.util.stream.Stream;

/**
 * @date 2021/07/16 0016 22:46:17
 */
public class 基本测试 {
    public static void main(String[] args) {
        Stream.iterate(0, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);
    }
}
