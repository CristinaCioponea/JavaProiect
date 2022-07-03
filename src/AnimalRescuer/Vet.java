package AnimalRescuer;

public class Vet {
    private String nameVet;
    private String specializationVet;
    private int vaccinYear;
    private int periodicConsultationYear;
    private String treatmentVet;



    public void setNameVet (){
        this.nameVet = nameVet;

    }
    public String getSpecializationVet (){
        return specializationVet;
    }
    public void setVaccinYear(){
        this.vaccinYear = vaccinYear;
    }
    public  void setSpecializationVet(){
        this.specializationVet = specializationVet;
    }


    public void Vet() {
        System.out.println("Vet is very careful");

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







