package AnimalRescuer;

public class Vet {
    private String nameVet;
    private String specializationVet;
    private int vaccinYear;
    private int periodicConsultationYear;
    private String treatmentVet;



    public void setNameVet (String nameVet){
        this.nameVet = nameVet;

    }
    public String getSpecializationVet (String specializationVet){
        return specializationVet;
    }
    public void setVaccinYear(int vaccinYear){
        this.vaccinYear = vaccinYear;
    }
    public  void setSpecializationVet(String specializationVet){
        this.specializationVet = specializationVet;
    }

        public void setNameVetnameVet(){
            System.out.println("Name vet is "+ setNameVet());
        }
        public void setVaccinYear(){
            System.out.println("Necesarry vaccin per year is " + setVaccinYear());
        }
        public void setSpecializationVet(){
            System.out.println("Veterinary specialization are " + setSpecializationVet());
        }
    }







