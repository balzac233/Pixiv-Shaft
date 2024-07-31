package ceui.lisa;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import ceui.lisa.utils.Emoji;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void emojiWithCharDic() {
        Map<String, String> map = new HashMap<>(Emoji.map);
        for (int i = 0; i < 100; i++) {
            map.put("(" + randomWord((int) (5 + Math.random() * 2)) + ")", Emoji.HEAD + randomWord((int) (10 + Math.random() * 4)) + Emoji.OFF);
        }
        Emoji.CharDicWithArr.main(null);
    }

    private String randomWord(int len) {
        char[] resArr = new char[len];
        while (--len >= 0) {
            resArr[len] = (char) (Math.random() * 26 + 'a');
        }
        return new String(resArr);
    }


}