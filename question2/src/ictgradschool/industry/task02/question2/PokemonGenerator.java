package ictgradschool.industry.task02.question2;

import java.util.Random;

public class PokemonGenerator {

    private Pokemon[] pokemons;


    public static void main(String[] args) {
        PokemonGenerator pokemonGenerator = new PokemonGenerator();
        pokemonGenerator.start();
    }

    // TODO Step i. Create the generateRandomLevel() method.
    static int generateRandomLevel() {
        int RandomLevel = (int) (Math.random() * 5 + 1);
        return RandomLevel;
    }


    // TODO Step iii a. Create the printPokemonGreetings() method.
    public void printPokemonGreeting() {
        for (int i = 0; i <= pokemons.length - 1; i++) {
            System.out.println("I am " + pokemons[i].getName() + "," + " " + "my current level is " + pokemons[i].getLevel());

        }
    }

    // TODO Step iv a. Create the printWaterPokemon() method.
    public void printWaterPokemon() {
        for (int i = 0; i <= pokemons.length - 1; i++) {
            if (pokemons[i].type.getType().equals("Water")) {
                System.out.println("I say " + "" + ((INoise) pokemons[i]).makeNoise() + "" + " when I attack!");
            }
        }
    }

    public void start() {
        // TODO Step ii. Create 4 different types of Pokemon and add them to the pokemons array. Each one should have a random level.

        pokemons = new Pokemon[4];
        pokemons[0] = new Squirtle("Squirtle", generateRandomLevel());
        pokemons[1] = new Charmander("Charmander", generateRandomLevel());
        pokemons[2] = new Pikachu("Pikachu", generateRandomLevel());
        pokemons[3] = new Psyduck("Psyduck", generateRandomLevel());

        System.out.println("Greetings from Pokemon");
        System.out.println("====================");


        // TODO Step iii b. Appropriately call the printPokemonGreetings() method.
        printPokemonGreeting();
        System.out.println("====================");
        System.out.println();

        System.out.println("Water Pokemon show-off time");
        System.out.println("-------------------------------");

        // TODO Step iv b. Appropriately call the printWaterPokemon() method.
        printWaterPokemon();
        System.out.println("-------------------------------");
        System.out.println();

        System.out.println("Random attack time!");
        System.out.println("-------------------");

        // TODO Step v. Randomly generate an display three attacks.

        for (int i = 0; i < pokemons.length; i++) {
            for (int j = 0; j < pokemons.length; j++) {
                if (i == (j = 0)) {
                    System.out.println(pokemons[i + 1].attack(pokemons[j]));

                } else if (i == (j = 3)) {
                    System.out.println(pokemons[i - 1].attack((pokemons[j])));
                } else if (i == (j = 1)) {
                    System.out.println(pokemons[i + 1].attack(pokemons[j]));
                } else if (i == (j = 2)) {
                    System.out.println(pokemons[i + 1].attack(pokemons[j + 1]));
                } else if (i!=j)
                    {
                    System.out.println(pokemons[i].attack(pokemons[j]));
                }


                System.out.println("-------------------");
                System.out.println();

                System.out.println("Pokemons' status after the attacks");
                System.out.println("==================================");
                // TODO Step iii b. Appropriately call the printPokemonGreetings() method.
                printPokemonGreeting();
                System.out.println("==================================");

            }

        }
    }
}
