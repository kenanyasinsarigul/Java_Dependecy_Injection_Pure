package GuitarModels;

public class GuitarModelsService {
    private final Guitar guitar;

    public GuitarModelsService(Guitar guitar) {
        this.guitar = guitar;
    }

    public void Create(){
        guitar.Create();
    }
}
