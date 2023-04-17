public class DNA {
    public static void main(String[] args) {

        String dna = dna1; // Mude aqui para saber se o DNA contem proteina ou não.

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";
        
        int startCodon = dna.indexOf("ATG");
        int stopCodon = dna.indexOf("TGA", startCodon + 3);
        
        if (startCodon != -1 && stopCodon != -1 && (stopCodon - startCodon) % 3 == 0) {
            String protein = dna.substring(startCodon, stopCodon + 3);
            System.out.println("Contem uma proteina.");
        } else {
            System.out.println("Sem proteina.");
        }
    }
}