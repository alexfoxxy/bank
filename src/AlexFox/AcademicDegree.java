package AlexFox;

public enum AcademicDegree {
    POSTGRADUATE(1),ASSISTANT(2), FULL_PROFESSOR(3);

    private int value;

    AcademicDegree(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
