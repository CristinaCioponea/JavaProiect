package AnimalRescuer;

public class Vet {
    private String nameVet;
    private String specializationVet;
    private int vaccinYear;
    private int periodicConsultationYear;
    private String treatmentVet;


    public String getSpecializationVet() {
        return specializationVet;
    }

    public void setNameVet (String nameVet){
        this.nameVet = nameVet;

    }
    public String getNameVet(){
        return nameVet;

    }
    public String getSpecializationVet (String specializationVet){
        return specializationVet;
    }

    public void setVaccinYear(int vaccinYear){
        this.vaccinYear = vaccinYear;
    }
    public int getVaccinYear(){
        return vaccinYear;
    }
    public  void setSpecializationVet(String specializationVet){
        this.specializationVet = specializationVet;
    }

        public void setNameVetnameVet(){
            System.out.println("Name vet is "+ getNameVet());
        }
        public void setVaccinYear(){
            System.out.println("Necesarry vaccin per year is " + getVaccinYear());
        }

    }







