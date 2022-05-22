package ru.gb.musaev.leasson6;

abstract public  class Animal {
    private String name;
   private int runLimit;
    private int swimLimit;
    private static int count;

    public Animal(String name, int runLimit, int swimLimit){
        this.name = name;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        count++;
    }

    public String getName() {
        return name;
    }

    public void run(int lengt) {
        if (lengt <= runLimit){
            System.out.println(this + " бежить " + lengt + " метров ");
        }else {
            System.out.println(this  + " не способен пробежать " + lengt + " метров ");
        }

    }


    public void swim(int lengt) {
        if (lengt <= swimLimit){
            System.out.println(this  + " плывет " + lengt + " метров ");
        }else {
            System.out.println(this  + " не способен проплыть " + lengt + " метров ");
        }


    }
    public static int getCount(){
    return count;
    }




    }

