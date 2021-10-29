package com.company;

public class Client {

    public void ReadEpubFormatBook(IeBook eBook){
        System.out.println("Client reads ebook in epub format.");
        eBook.readEpub();
    }
}
