package org.example;

public enum PassStatus {
    PASSED("Passed"),
    FAILED("Failed");

    private final String label;

    private PassStatus(String label) {
        this.label = label;
    }

    public String getLabel() {
        return this.label;
    }
}
