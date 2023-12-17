enum SortingType {
    SELECTION(new SelectionSort()),
    MERGE(new MergeSort()),
    INSERTION(new InsertionSort());

    private final SortingAlgorithm algorithm;

    SortingType(SortingAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public SortingAlgorithm getAlgorithm() {
        return algorithm;
    }
}
