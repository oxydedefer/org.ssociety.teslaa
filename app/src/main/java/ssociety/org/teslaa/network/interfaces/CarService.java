package ssociety.org.teslaa.network.interfaces;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import ssociety.org.teslaa.model.Car;

/**
 * Created by seb on 2/12/17.
 */

public interface CarService {

    @GET("/cars")
    Call<List<Car>> getCarsService();


}
