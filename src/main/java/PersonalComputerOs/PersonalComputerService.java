package PersonalComputerOs;

public class PersonalComputerService {

    private final PersonalComputerOs pcOs;

    public PersonalComputerService(PersonalComputerOs pcOs) {
        this.pcOs = pcOs;
    }

    public void Create(){
        pcOs.Create();
    }
}
