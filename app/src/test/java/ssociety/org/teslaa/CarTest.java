package ssociety.org.teslaa;

import android.content.Context;

import org.greenrobot.greendao.database.Database;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;

import java.util.List;

import ssociety.org.teslaa.model.Car;
import ssociety.org.teslaa.model.CarDao;
import ssociety.org.teslaa.model.DaoMaster;
import ssociety.org.teslaa.model.DaoSession;

/**
 * Created by seb on 2/12/17.
 */


@RunWith(RobolectricTestRunner.class)
public class CarTest {
    private DaoSession daoSession;

    @Before
    public void setUp() throws Exception {
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(RuntimeEnvironment.application, "test-db");
        Database db = helper.getWritableDb();
        daoSession = new DaoMaster(db).newSession();

    }

    @Test
    public void firstInsertionTest() throws Exception {

        CarDao carDao = daoSession.getCarDao();
        List<Car> cars = carDao.loadAll();
        Assert.assertEquals(cars.size(), 0);
        Car car_1 = new Car(null, "category", "model", 100, 200, 1.0, 1000);
        carDao.insert(car_1);
        cars = carDao.loadAll();
        Assert.assertEquals(cars.size(), 1);
        Assert.assertEquals(carDao.loadAll().get(0).getCategory(), "category");
    }


}
