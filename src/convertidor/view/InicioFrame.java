package convertidor.view;

import convertidor.controller.ConversorMasaController;
import convertidor.controller.ConversorMonedaController;
import convertidor.controller.ConversorTemperaturaController;
import convertidor.controller.ConversorTiempoController;

import javax.swing.*;
public class InicioFrame extends JFrame{
    private JPanel jpInicial;
    private JButton btnMoneda;
    private JButton btnTemperatura;
    private JButton btnTiempo;
    private JButton btnMasa;
    private JButton btnSalir;

    public InicioFrame() {
        crearFrame();
        configurarAcciones();
    }

    public void crearFrame() {
        setSize(700, 375);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        add(jpInicial);
        setVisible(true);
    }
    public void configurarAcciones(){
        btnMoneda.addActionListener(e ->  {
            dispose();
            new ConversorFrame(new ConversorMonedaController());
        });

        btnTemperatura.addActionListener(e ->  {
            dispose();
            new ConversorFrame(new ConversorTemperaturaController());
        });
        btnTiempo.addActionListener(e ->  {
            dispose();
            new ConversorFrame(new ConversorTiempoController());
        });
        btnMasa.addActionListener(e ->  {
            dispose();
            new ConversorFrame(new ConversorMasaController());
        });
        btnSalir.addActionListener(e -> {
            dispose();
        });
    }
}
