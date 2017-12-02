package ssociety.org.teslaa.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import ssociety.org.teslaa.R;
import ssociety.org.teslaa.model.Car;
import ssociety.org.teslaa.network.Api;
import ssociety.org.teslaa.network.interfaces.CarService;

public class MainActivity extends AppCompatActivity {

    private CarService mcarService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcarService = Api.getCarsService();
        loadAnswers();
    }


    public void loadAnswers() {
        mcarService.getCarsService().enqueue(new Callback<List<Car>>() {
            @Override
            public void onResponse(Call<List<Car>> call, Response<List<Car>> response) {
                if(response.isSuccessful()) {
                    List<Car> cars = response.body();
                    System.out.println();
                }else {
                    System.out.println();
                    int statusCode  = response.code();
                    // handle request errors depending on status code
                }
            }

            @Override
            public void onFailure(Call<List<Car>> call, Throwable t) {
                System.out.println();
            }
        });
    }
}
