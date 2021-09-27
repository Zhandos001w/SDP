package com.company;

public class Main {

    public static void main(String[] args) {
	AnimeWebPage yummyanime = new AnimeWebPage();
	yummyanime.addTitle("New 25th episode of Tokyo Revengers");
	yummyanime.addTitle("First OVA of Mob Psycho");
	yummyanime.addTitle("New full-length movie Kimetsu no Yaiba: Mugen Ressha-hen");

    User user = new User("Goku");

    yummyanime.register(user);

    yummyanime.addTitle("New season of Beastard had started");
    yummyanime.removeTitle("First OVA of Mob Psycho");

    }
}
