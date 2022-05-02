import java.util.Scanner;

public class GenomeInput {
    Scanner scanner = new Scanner(System.in);

    public HumanGenome input() {
        System.out.print("Please input genome name.\r");
        String genomeName = scanner.nextLine();
        System.out.print("Please input number of genes.\r");
        int numGenes = scanner.nextInt();
        System.out.print("Please input number of chromosomes.\r");
        int numChromosomes = scanner.nextInt();
        System.out.print("Please input number of cells.\r");
        int numCells = scanner.nextInt();
        return new HumanGenome(genomeName, numGenes, numChromosomes, numCells);
    }
}
