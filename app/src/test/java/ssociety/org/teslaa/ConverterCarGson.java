package ssociety.org.teslaa;

import com.google.gson.Gson;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import retrofit2.Response;
import ssociety.org.teslaa.model.Car;

/**
 * Created by seb on 2/12/17.
 */

@RunWith(RobolectricTestRunner.class)
public class ConverterCarGson {

    private JSONObject cars_json;
    @Before
    public void setUp() throws Exception {
//        InputStream is =  getClass().getResourceAsStream("cars.json");
//        int size = is.available();
//
//        byte[] buffer = new byte[size];
//
//        is.read(buffer);
//
//        is.close();
//
//        String json = new String(buffer, "UTF-8");
//        Gson gson = new Gson();
//        Reader reader = new InputStreamReader(getClass().getResourceAsStream("cars.json"));
//        Car response = gson.fromJson(reader, Car.class);
//        List<Car> results = response.results;
//        cars_json= new JSONObject(json);

    }

    @Test
    public void ConverterStructure() throws Exception {

        System.out.println();
    }
}
