package OOP_Interface;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical {

	// US
	@Override
	public void physioService() {

		System.out.println("FH---physioService");

	}

	@Override
	public void cardioService() {

		System.out.println("FH---cardioService");

	}

	@Override
	public void denatalService() {
		System.out.println("FH---dentalService");
	}

	// UK
	@Override
	public void neurosServices() {
		System.out.println("FH---neurosServices");

	}

	@Override
	public void pediaServices() {
		System.out.println("FH---pediaServices");
	}

	// IN
	@Override
	public void oncologyServices() {

		System.out.println("FH---oncologyServices");

	}

	@Override
	public void orthoServices() {
		System.out.println("FH---orthoServices");
	}

	// common services
	@Override
	public void emergencyServices() {
		System.out.println("FH---emergencyServices");

	}

	// individual
	public void medicalTraining() {
		System.out.println("FH---medicalTraining");
	}

	public void medicalClaim() {
		System.out.println("FH---medicalClaim");
	}

	@Override
	public void covidVaccinations() {

		System.out.println("FH---covidVaccinations");
	}

	// Method hiding

	public static void billing() {

		System.out.println("US Medical --- billing");
	}
    @Override
	public void medicalTest() {
		System.out.println("FH medical test");
	}

}
