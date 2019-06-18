import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        WeatherWS weatherWS=new WeatherWS();
        WeatherWSSoap weatherWSSoap=weatherWS.getWeatherWSSoap();
        ArrayOfString list=weatherWSSoap.getWeather("∏”÷›","");
        List<String> arrt=list.getString();
        for(String a:arrt){
            System.out.println(a);
        }
    }
}
