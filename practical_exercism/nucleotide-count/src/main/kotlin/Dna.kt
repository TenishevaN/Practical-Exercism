class Dna(dnaSequence: String) {
    val nucleotideCounts: Map<Char, Int>

    init {
        // Check if the DNA sequence contains only valid nucleotides
        if (dnaSequence.any { it !in "ACGT" }) {
            throw IllegalArgumentException("Invalid DNA sequence")
        }

        // Initialize the map with all nucleotides set to zero count
        val counts = mutableMapOf('A' to 0, 'C' to 0, 'G' to 0, 'T' to 0)

        // Count each nucleotide in the sequence
        dnaSequence.forEach { nucleotide ->
            counts[nucleotide] = counts.getOrDefault(nucleotide, 0) + 1
        }

        nucleotideCounts = counts.toMap()
    }
}
