package aula11;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class EnergyUsageReport {
    private Map<Integer, List<Double>> mapa_clientes = new TreeMap<>();

    public void load (String filename) throws FileNotFoundException, IOException{
        String name = "src//aula11//" + filename;
        BufferedReader input = new BufferedReader(new FileReader(name));
        String linha = input.readLine();

        while (linha != null) {
            int id_cliente = Integer.parseInt(linha.split("\\|")[0]);
            Double leitura1  = Double.parseDouble(linha.split("\\|")[1]);
            Double leitura2  = Double.parseDouble(linha.split("\\|")[2]);
            Double leitura3  = Double.parseDouble(linha.split("\\|")[3]);
            Double leitura4  = Double.parseDouble(linha.split("\\|")[4]);


            ArrayList<Double> meter_readings = new ArrayList<>();
            meter_readings.add(leitura1);
            meter_readings.add(leitura2);
            meter_readings.add(leitura3);
            meter_readings.add(leitura4);

            mapa_clientes.put(id_cliente, meter_readings);

            linha = input.readLine();
        }
    input.close();
    }

    public void addCustomer(Customer customer){
        if (mapa_clientes.containsKey(customer.getCustomerId())){
            System.out.println("Client no longer exists");
        }
        else{
            mapa_clientes.put(customer.getCustomerId(), customer.getMeterReadings());
        }
    }

    public void removeCustomer(int id){
        if (mapa_clientes.containsKey(id)){
            mapa_clientes.remove(id);
        }
        else{
            System.out.println("Client doesnt exist");
        }
    }

    public Customer getCustomer(int id){
        if (mapa_clientes.containsKey(id)){
            return new Customer(id, mapa_clientes.get(id));
        }

        else{
            System.out.println("Client doesnt exist");
            return null;
        }

    }
    
    public double calculateTotalUsage(int id){
        if (mapa_clientes.containsKey(id)){
            double soma_energia = 0;
            for (int i = 0; i < mapa_clientes.get(id).size(); i++){
                soma_energia += mapa_clientes.get(id).get(i);
            }
            return soma_energia;
        }
        else{
            System.out.println("Client doesnt exist");
            return 0;
        }
    }

    public File generateReport(String name) throws IOException{
        File file = new File(name);
        FileWriter writer = new FileWriter(file);

        for (int i = 0; i < mapa_clientes.size(); i++){
            int id = mapa_clientes.keySet().toArray()[i].hashCode();
            writer.write("Customer ID: " + id+ " | ");
            writer.write("Total usage: " + calculateTotalUsage(id) + "\n");
        }

        writer.close();
        return file;
    }

    public void printAllCustomers(){
        mapa_clientes.forEach((k,v) -> System.out.println("Id " + k + " | Readings: " + v));
    }
}
