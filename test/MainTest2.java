import org.junit.Test;
import org.mockito.Mockito;

/**
 * Created by vig on 1/16/17.
 */
public class MainTest2 {

    @Test
    public void testDiff(){
        Main m = new Main();
//        OtherObject mock = Mockito.mock(OtherObject.class); //обрезает все методы
        OtherObject mock = Mockito.spy(OtherObject.class); //оставляет все методы


        Mockito.when(mock.do1()).thenReturn("Our string"); //заменяет возвращаемое значение метода
        m.setOther(mock);

        m.diff(1,1);
        m.diff(1,1);
        Mockito.verify(mock,Mockito.times(2)).do1(); // проверяет количество вызовов метода
        assert (true);
    }
}
