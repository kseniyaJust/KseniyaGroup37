package HomeWork7.methodicks;

//Задача 1:
//Создать программу для имитации работы клиники. Пусть в клинике будет три врача:
//хирург, терапевт и дантист. Каждый врач имеет метод «лечить», но каждый врач лечит
//по-своему. Так же предусмотреть класс «Пациент» с полем «План лечения» и полем
//«Доктор». Создать объект класса «Пациент» и добавить пациенту план лечения. У
//терапевта создать метод, который будет назначать врача пациенту согласно плану
//лечения:
//Если план лечения имеет код 1 – назначить хирурга и выполнить метод лечить.
//Если план лечения имеет код 2 – назначить дантиста и выполнить метод лечить.
//Если план лечения имеет любой другой код – назначить терапевта и выполнить метод
//лечить.
interface Doctor{
    void heal();
}
class Surgeon implements Doctor{
    public void heal(){
        System.out.println("Surgeon heals");
    }

}
class Dentist implements Doctor{
    public void heal(){
        System.out.println("Dentist heals");
    }

}
class Therapist implements Doctor{
    public void heal(){
        System.out.println("Therapist heals");
    }
    public void appointDoctor(Patient patient){
        switch (patient.getHealingPlan()){
            case 1 -> patient.setDoctor(new Surgeon());
            case 2-> patient.setDoctor(new Dentist());
            default -> patient.setDoctor(new Therapist());
        }
        System.out.print("Patient " + patient.getPatientName() + " has been appointed: ");
        patient.getDoctor().heal();
    }

}

class Patient{
    private final String patientName;
    private int healingPlan;
    private Doctor doctor;

    Patient(String patientName,int healingPlan){
        this.patientName = patientName;
        this.healingPlan = healingPlan;
    }
    public int getHealingPlan() {
        return healingPlan;
    }

    public String getPatientName() {
        return patientName;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
}
