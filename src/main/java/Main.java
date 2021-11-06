import GuitarModels.AcousticGuitarImpl;
import GuitarModels.Guitar;
import GuitarModels.GuitarModelsService;
import PersonalComputerOs.PersonalComputerService;
import PersonalComputerOs.PersonalComputerWindowsOsImpl;

public class Main {
    public static void main(String[] args) {

        //PersonalComputerOs pcOs=new PersonalComputerOs.PersonalComputerOs.PersonalComputerWindowsOsImpl();
        //PersonalComputerService pcService = new PersonalComputerOs.PersonalComputerOs.PersonalComputerService(pcOs);
        PersonalComputerService pcService = new PersonalComputerService(new PersonalComputerWindowsOsImpl());
        pcService.Create();

        //Guitar guitarModel=new AcousticGuitarImpl();
        //GuitarModelsService guitarModelService = new GuitarModelsService(guitarModel);
        GuitarModelsService guitarModelService=new GuitarModelsService(new AcousticGuitarImpl());
        guitarModelService.Create();
    }
}
