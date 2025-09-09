import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Random;

public class SensorUDP {
    private static final String SERVIDOR = "localhost";
    private static final int PORTA = 12345;
    private static final Random random = new Random();

    public static void main(String[] args) {
        String nomeSensor = args.length > 0 ? args[0] : "Sensor Temperatura";

        try (DatagramSocket socket = new DatagramSocket()) {
            InetAddress enderecoServidor = InetAddress.getByName(SERVIDOR);

            while (true) {
                double temperatura = 20 + random.nextDouble() * 10;
                String leitura = String.format("%s: %.2fºC", nomeSensor, temperatura);

                byte[] buffer = leitura.getBytes();
                DatagramPacket pacote = new DatagramPacket(buffer, buffer.length, enderecoServidor, PORTA);
                socket.send(pacote);

                Thread.sleep(1000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
