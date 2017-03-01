import org.testng.annotations.Test;
import utils.StringUtils;

/**
 * Created by xiyeqing on 2017-二月-27.
 */
public class StringUtilsTest {
    @Test
    public void isEmpty()
    {
        assert StringUtils.isBlank(null);
        assert StringUtils.isBlank("");
    }

}
