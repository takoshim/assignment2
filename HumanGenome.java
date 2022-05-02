public class HumanGenome {

    private String genomeName;
    private Integer numGenes;
    private Integer numChromosomes;
    private Integer numCells;

    public HumanGenome(String genomeName, Integer numGenes, Integer numChromosomes, Integer numCells) {
        this.genomeName = genomeName;
        this.numGenes = numGenes;
        this.numChromosomes = numChromosomes;
        this.numCells = numCells;
    }

    public String getGenomeName() {
        return genomeName;
    }

    public Integer getNumGenes() {
        return numGenes;
    }

    public Integer getNumChromosomes() {
        return numChromosomes;
    }

    public Integer getNumCells() {
        return numCells;
    }

    public void setGenomeName(String genomeName) {
        this.genomeName = genomeName;
    }

    public void setNumGenes(Integer numGenes) {
        this.numGenes = numGenes;
    }

    public void setNumChromosomes(Integer numChromosomes) {
        this.numChromosomes = numChromosomes;
    }

    public void setNumCells(Integer numCells) {
        this.numCells = numCells;
    }

    public void print() {
        System.out.printf("%30s %20s\n","Genome Name:", genomeName);
        System.out.printf("%30s %,20d\n","Number of Genes in Genome:", numGenes);
        System.out.printf("%30s %,20d\n","Number of Chromosomes:", numChromosomes);
        System.out.printf("%30s %,20d\n","Number of Cells in Body:", numCells);
        System.out.println("\n");
    }


}
