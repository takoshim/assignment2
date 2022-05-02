import java.util.ArrayList;
import java.util.Scanner;

public class GenomeInput {
    private static final Scanner scanner = new Scanner(System.in);

    public static HumanGenome input() {
        // Prompts user to enter genome name
        System.out.println("Please input genome name.");
        String genomeName = scanner.nextLine();

        // Prompts user to enter number of genes
        System.out.println("Please input number of genes.");
        int numGenes = scanner.nextInt();
        scanner.nextLine();

        // Prompts user to enter number of chromosomes
        System.out.println("Please input number of chromosomes.");
        int numChromosomes = scanner.nextInt();
        scanner.nextLine();

        // Prompts user to enter number of cells.
        System.out.println("Please input number of cells.");
        int numCells = scanner.nextInt();
        scanner.nextLine();

        // returns HumanGenome object
        return new HumanGenome(genomeName, numGenes, numChromosomes, numCells);
    }

    public static void main(String[] args) {
        ArrayList<HumanGenome> genomes = new ArrayList<>();

        for (int i=0; i<3; i++) {
            genomes.add(GenomeInput.input());
            genomes.get(i).print();
        }
    }
}
