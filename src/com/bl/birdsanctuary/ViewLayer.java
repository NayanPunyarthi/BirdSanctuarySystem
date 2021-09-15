package com.bl.birdsanctuary;

public class ViewLayer {

    public void print() {
        BirdSanctuaryRepository birdSantuaryRepository = BirdSanctuaryRepository.getInstance();
        for (Object items : birdSantuaryRepository.getAllBird()) {
            System.out.println(items);
        }
    }

    public void printFlyable() {
        BirdSanctuaryRepository birdSantuaryRepository = BirdSanctuaryRepository.getInstance();
        for (Bird item : birdSantuaryRepository.getAllBird()) {
            if (item.canFly) {
                item.fly();
            }
        }
    }

    public void printSwimmable() {
        BirdSanctuaryRepository birdSantuaryRepository = BirdSanctuaryRepository.getInstance();
        for (Bird item : birdSantuaryRepository.getAllBird()) {
            if (item.canSwim) {
                item.swim();
            }

        }
    }

    public void printEatable() {
        BirdSanctuaryRepository birdSantuaryRepository = BirdSanctuaryRepository.getInstance();
        for (Bird item : birdSantuaryRepository.getAllBird()) {
            item.eat();
        }
    }

    public void countTotalBirds() {
        BirdSanctuaryRepository birdSanctuaryRepository = BirdSanctuaryRepository.getInstance();
        int count = 0;
        for (Bird items : birdSanctuaryRepository.getAllBird()) {
            count += 1;

        }
        System.out.println("Total no. of Bird:" + count);
        System.out.println("____________________________");
    }
}
