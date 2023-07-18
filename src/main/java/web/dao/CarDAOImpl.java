package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {
    private static int idCounter = 0;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++idCounter, "DeLorean", "Over 99999$"));
        cars.add(new Car(++idCounter, "CheapPorshe", "1500$"));
        cars.add(new Car(++idCounter, "Toyota", "2 x 100000$"));
        cars.add(new Car(++idCounter, "UAZ", "100000 Soviet Rubles"));
        cars.add(new Car(++idCounter, "BYD", "3742 Social Rating"));
    }

    public List<Car> getCars(int count) {
        if (count < 5){
            return cars.stream().limit(count).collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
