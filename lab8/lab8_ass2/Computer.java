package com.company;

public class Computer {
    private int wordSize,memorySize,storageSize,speed;

    Computer (){
        wordSize = 8;
        memorySize = 1024;
        storageSize = 1024;
        speed = 1024;
    }
    Computer(int wordSize,int memorySize,int storageSize,int speed){
        this.speed = speed;
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
    }

    public int getWordSize() { return wordSize; }

    public void setWordSize(int wordSize) { this.wordSize = wordSize; }

    public int getMemorySize() { return memorySize; }

    public void setMemorySize(int memorySize) { this.memorySize = memorySize; }

    public int getStorageSize() { return storageSize; }

    public void setStorageSize(int storageSize) { this.storageSize = storageSize; }

    public int getSpeed() { return speed; }

    public void setSpeed(int speed) { this.speed = speed; }

    @Override
    public String toString() {
        return
                "wordSize=" + wordSize +
                ", memorySize=" + memorySize +
                ", storageSize=" + storageSize +
                ", speed=" + speed ;
    }
}
