package ssociety.org.teslaa.network;

import ssociety.org.teslaa.network.interfaces.CarService;

/**
 * Created by seb on 2/12/17.
 */

public class Api {

    public static final String BASE_URL = "http://10.0.2.2";

    public static CarService getCarsService() {
        return RetrofitClient.getClient(BASE_URL).create(CarService.class);
    }
}
