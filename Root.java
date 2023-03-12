//S221
import java.util.*;
public class Root
{
    private Doctors doctors = new Doctors();
    private Patients patients = new Patients();
    private Services services = new Services();
    private LinkedList<Appointment> appointments = new LinkedList<Appointment>();
    private int AppointmentId = 1;

    public Root()
    {
        menu(); 
    }

    private void menu()
    {
        char action = readAction();
        switch (action)
        {
            case 'D': doctors(); break;
            case 'P': patients(); break;
            case 'S': services(); break;
            case 'A': appointments(); break;
            case 'R': report(); break;
            case 'X': exit(); break;
        }
    }

    private char readAction()
    {
        System.out.print("Please enter your choice (D, P, S, A, R, X): ");
        return In.nextUpperChar();
    }
    
    private void doctors()
    {
        //calls Doctors class's add() method
        doctors.add();
        //calls menu() method
        menu();
    }
    
    private void patients()
    {
        //calls Patients class's add() method
        patients.add();
        //calls menu() method
        menu();
    }
    
    private void services()
    {
        //calls Services class's add() method
        services.add();
        //calls menu() method
        menu();
    }
    
    private void appointments()
    {
        //calls readID() method and prompts user for doctor ID
        int docId = readId("Doctor ID");
        //calls the findDoc() method and assigns to the doc object
        Doctor doc = findDoc(docId);
        //calls readID() method and prompts user for patient ID
        int patientId = readId("Patient ID");
        //calls the findPatient() method and assigns to the patient object
        Patient patient = findPatient(patientId);
        //calls readID() method and prompts user for service ID
        int serviceId = readId("Service ID");
        //calls the findService() method and assigns to the service object
        Service service = findService(serviceId);
        //creates an appointment object
        Appointment appointment = new Appointment(AppointmentId++, doc, patient, service);
        //adds the appointment object to the appointments list
        appointments.add(appointment);
        //calls menu() method
        menu();
    }
    
    private void report()
    {
        System.out.println("Doctors");
        //calls the show() method in the Records class because it is a parent of Doctors
        doctors.show();
        System.out.println("Patients");
        //calls the show() method in the Records class because it is a parent of Patients
        patients.show();
        System.out.println("Services");
        //calls the show() method in the Records class because it is a parent of Services
        services.show();
        System.out.println("Appointments");
        //calls the show() method in this class
        show();
        //calls menu() method
        menu();
    }
    
    private void exit()
    {
        System.out.println("Goodbye");
    }
    
    private Doctor findDoc(int id)
    {
        //calls the Doctors class's find() method. 
        //if returned value is not null then displays doctor's name by calling the getName() method in Doctor class
        //else displays a error message and goes back to menu()
        if (doctors.find(id) != null)
        {
            System.out.println("\tDoctor's Name: " + doctors.find(id).getName());
        }
        /*else
        {
            System.out.println("\tDoctor ID is invalid, appointment aborted");
            menu();
        }*/
        return doctors.find(id);
    }
    
    private Patient findPatient(int id)
    {
        //calls the Patients class's find() method. 
        //if returned value is not null then displays patient's name by calling the getName() method in Patient class
        //else displays a error message and goes back to menu()
        if (patients.find(id) != null)
        {
            System.out.println("\tPatient's Name: " + patients.find(id).getName());
        }
        /*else
        {
            System.out.println("\tPatient ID is invalid, appointment aborted");
            menu();
        }*/
        return patients.find(id);
    }
    
    private Service findService(int id)
    {
        //calls the Services class's find() method. 
        //if returned value is not null then displays service's cost by calling the getCost() method in Service class
        //else displays a error message and goes back to menu()
        if (services.find(id) != null)
        {
            System.out.println("\tCost of Service: " + services.find(id).getCost());
        }
        /*else
        {
            System.out.println("\tService ID is invalid, appointment aborted");
            menu();
        }*/
        return services.find(id);
    }
    
    private int readId(String message)
    {   
        //Outputs the passed message and prompts the user
        System.out.print("\t" + message + ": ");
        return In.nextInt();    
    }
    
    private void show()
    {
        //iterates through the appointments list and calls and displays the toString() method in the Appointment class for each element
        for (Appointment appointment : appointments)
        {
            System.out.println("\t" + appointment.toString());
        }
    }
}

class main{
    public static void main(String[] args) {
        Root root1 = new Root();
    }
}
