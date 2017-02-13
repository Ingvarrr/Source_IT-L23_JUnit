import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.*;
/**
 * Created by vig on 1/16/17.
 */
//@RunWith(Parameterized.class)
public class MainTest {

   /* @Test
    public void testDiff() {
        Main m = new Main();
        int result = m.diff(1, 2);

//        assert result == 0;
//        assert result != null;
        assertEquals("Result should be 0", 0, result);
    }
    @Test
    public void TestDiffPoz(){
        Main p = new Main();
        int a = 0;
        int result = p.diff(2,1);
        if (result>0) a = 1;
        assertEquals("Result should be positive", 1, a);
    }
    @Test
    public void TestDiffNeg(){
        Main p = new Main();
        int a = 0;
        int result = p.diff(1,2);
        if (result<0) a = 0;
        assertEquals("Result should be negative",0,a);
    }*/

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEx() {
        List l = new ArrayList<>();
        l.remove(0);
    }

    @Test(timeout = 1000)
    public void testTime(){
        try{
            Thread.sleep(900);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After class");
    }

    @Before
    public void before() {
        System.out.println("Before");
    }


    @After
    public void after() {
        System.out.println("After");
    }

    /*@Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][] {
                        {1, 1, 0}, {1, 3, -2}
                }
        );
    }

    private int i1, i2, rs;
    //public MainTest() {}
    public MainTest(int i1, int i2, int i3) {
        this.i1 = i1;
        this.i2 = i2;
        this.rs = i3;
    }

    @Test
    public void dataDriven() {
        assertEquals(rs, new Main().diff(i1, i2));
    }*/

}
// mock - отсекает все внешние связи
// spy - не отсекает все связи
//
