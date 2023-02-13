package convertidor.controller;

import convertidor.enums.Tiempo;

public class ConversorTiempoController extends ConversorController{
    public ConversorTiempoController() {
        super("Conversor de Tiempo", Tiempo.values());
    }
}
