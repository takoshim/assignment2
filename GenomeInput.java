/*
*********************************
 * Your Name: Takeo Shimazu
 * Class and Section: Sp22 CIS D036A 01Y, 64Z Java Programming
 * Assignment Number: 2 Part 1
 * Due Date: May 4, 2022
 * Date Submitted: May 2, 2022
 *******************************
 *
Variables
    (String) nameGenome
    (long)  numGenes, numChromosome, numCells

Input
    For input, I used Scanner.

Processing

Printing
    For printing, I used Humangenome.print() methods 3 times.
*/

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GenomeInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static HumanGenome input() {
        try {
            System.out.println("Please input genome name.");
            String genomeName = scanner.nextLine();

            long numGenes;
            do {
                System.out.println("Please input number of genes.");
                numGenes = scanner.nextLong();
                scanner.nextLine();
                if (numGenes <0) {
                    System.out.println("Input positive number, please.");
                }
            } while (numGenes <0);

            long numChromosomes;
            do {
                System.out.println("Please input number of chromosomes.");
                numChromosomes = scanner.nextLong();
                scanner.nextLine();
                if (numChromosomes <0) {
                    System.out.println("Input positive number, please.");
                }
            } while (numChromosomes <0);

            long numCells;
            do {
                System.out.println("Please input number of cells.");
                numCells = scanner.nextLong();
                scanner.nextLine();
                if (numCells <0) {
                    System.out.println("Input positive number, please.");
                }
            } while (numCells <0);

            return new HumanGenome(genomeName, numGenes, numChromosomes, numCells);
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Please input appropriate characters.");
        }
    }

    public static void main(String[] args) {
        try {
            ArrayList<HumanGenome> genomes = new ArrayList<>();
            for (int i=0; i<3; i++) {
                genomes.add(GenomeInput.input());
                genomes.get(i).print();
            }

        } catch (InputMismatchException e) {
            System.out.println(e.toString());
            System.out.println("Please start over from the 1st genome. Bye.");
        }
    }
}
