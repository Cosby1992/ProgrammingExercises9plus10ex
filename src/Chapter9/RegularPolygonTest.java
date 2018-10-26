package Chapter9;

import org.junit.Test;

import static org.junit.Assert.*;

public class RegularPolygonTest {

    RegularPolygon regPol1 = new RegularPolygon();
    RegularPolygon regPol2 = new RegularPolygon(6, 4);
    RegularPolygon regPol3 = new RegularPolygon(10, 4, 5.6, 7.8);


    @Test
    public void getArea() {
        assertEquals(0.43301270189221946,regPol1.getArea(),0.00000000000001);
        assertEquals(41.569219381653056,regPol2.getArea(),0.00000000000001);
        assertEquals(123.10734148701015,regPol3.getArea(),0.00000000000001);
    }

    @Test
    public void getPerimeter() {
        assertEquals(3.0, regPol1.getPerimeter(),0.000000000001);
        assertEquals(24.0, regPol2.getPerimeter(),0.000000000001);
        assertEquals(40.0, regPol3.getPerimeter(),0.000000000001);
    }
}