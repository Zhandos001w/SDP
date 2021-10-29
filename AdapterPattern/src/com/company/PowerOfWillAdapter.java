package com.company;

public class PowerOfWillAdapter implements IeBook{

    private PowerOfWillBook powerOfWillBook;

    public PowerOfWillAdapter(PowerOfWillBook powerOfWillBook) {
        this.powerOfWillBook = powerOfWillBook;
    }

    @Override
    public void readEpub() {
        System.out.println("Epub format is converted in pdf format!");
        powerOfWillBook.readPDF();
    }
}
