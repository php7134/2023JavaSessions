package OOP_Interface;

public class TestHospital {

	public static void main(String[] args) {

		FortisHospital fh= new FortisHospital();
		fh.cardioService();
		fh.denatalService();
        fh.emergencyServices();
        fh.pediaServices();
        fh.neurosServices();
        fh.medicalClaim();
        fh.medicalTraining();
        fh.medicalRD();
        fh.medicalTest();
        
        //top casting --
        USMedical us=new FortisHospital();
        us.physioService();
        us.cardioService();
        us.denatalService();
        us.emergencyServices();
        
        WHO wh=new FortisHospital();
        wh.covidVaccinations();
        
        
        //down casting : NA
        
        //calling static method
        
        USMedical.billing();
        FortisHospital.billing();
        
        
	}

}
