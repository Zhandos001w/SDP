package com.company;

public class Main {

    public static void main(String[] args) {

        Client client = new Client();
        IeBook epub = new MiracleMorningBook();
        PowerOfWillBook pdf = new PowerOfWillBook();
        PowerOfWillAdapter adapter = new PowerOfWillAdapter(pdf);

        client.ReadEpubFormatBook(epub);
        System.out.println("----------------------------------");
        client.ReadEpubFormatBook(adapter);
    }
}
