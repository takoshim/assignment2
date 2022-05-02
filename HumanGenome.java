/*
*********************************
 * Your Name: Takeo Shimazu
 * Class and Section: Sp22 CIS D036A 01Y, 64Z Java Programming
 * Assignment Number: 2 Part 1
 * Due Date: May 4,2022
 * Date Submitted: May 2, 2022
 *******************************
 */

public class HumanGenome {

    private String genomeName;
    private long numGenes;
    private long numChromosomes;
    private long numCells;

    public HumanGenome(String genomeName, long numGenes, long numChromosomes, long numCells) {
        this.genomeName = genomeName;
        this.numGenes = numGenes;
        this.numChromosomes = numChromosomes;
        this.numCells = numCells;
    }

    public String getGenomeName() {
        return genomeName;
    }

    public long getNumGenes() {
        return numGenes;
    }

    public long getNumChromosomes() {
        return numChromosomes;
    }

    public long getNumCells() {
        return numCells;
    }

    public void setGenomeName(String genomeName) {
        this.genomeName = genomeName;
    }

    public void setNumGenes(long numGenes) {
        this.numGenes = numGenes;
    }

    public void setNumChromosomes(long numChromosomes) {
        this.numChromosomes = numChromosomes;
    }

    public void setNumCells(long numCells) {
        this.numCells = numCells;
    }

    public void print() {
        System.out.printf("%40s %25s\n","Genome Name:", genomeName);
        System.out.printf("%40s %,25d\n","Number of Genes in Genome:", numGenes);
        System.out.printf("%40s %,25d\n","Number of Chromosomes:", numChromosomes);
        System.out.printf("%40s %,25d\n","Number of Cells in Body: (Trillions)", numCells);
        System.out.println("\n");
    }


}
