package com.company;


public class CarParams {

    public static void main(String... args) {
        Cars firstCar = new Cars(110, 120, 2000);
        Cars secondCar  = new Cars(110, 140, 2400);


        System.out.println(firstCar.equals(secondCar));
    }



    static class Cars {
        int engine;
        int maxSpeed;
        int weight;

        public boolean equals(Cars cars) {
            return this.maxSpeed == cars.maxSpeed;
        }

        public Cars(int engine, int weight, int maxSpeed) {
            this.engine = engine;
            this.weight = weight;
            this.maxSpeed = maxSpeed;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Cars cars = (Cars) o;
//            return engine == cars.engine && maxSpeed == cars.maxSpeed && weight == cars.weight;
//        }

//        @Override
//        public int hashCode() {
//            return Objects.hash(engine, maxSpeed, weight);
//        }
    }
}
