package convertidor.controller;

import convertidor.enums.Masa;
public class ConversorMasaController extends ConversorController{
    public ConversorMasaController() {
        super("Conversor De Masa", Masa.values());
    }
}
