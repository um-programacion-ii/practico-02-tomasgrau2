package entity;

import excepciones.StockInsuficiente;
import excepciones.VidaUtilInsuficiente;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Receta {
    protected int tiempoCoccion;
    protected String preparacion;
    protected List<Ingrediente> ingredientes; // Cambio de arreglo a lista
    protected List<Utensilio> utensilios;

    public Receta() {
        ingredientes = new ArrayList<>(); // Inicializamos la lista
        utensilios = new ArrayList<>();
    }

    public Receta(int tiempoCoccion, String preparacion, List<Ingrediente> ingredientes, List<Utensilio> utensilios) {
        this.tiempoCoccion = tiempoCoccion;
        this.preparacion = preparacion;
        this.ingredientes = ingredientes;
        this.utensilios = utensilios;
    }

    public int getTiempoCoccion() {
        return tiempoCoccion;
    }

    public void setTiempoCoccion(int tiempoCoccion) {
        this.tiempoCoccion = tiempoCoccion;
    }

    public String getPreparacion() {
        return preparacion;
    }

    public void setPreparacion(String preparacion) {
        this.preparacion = preparacion;
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Utensilio> getUtensilios() {
        return utensilios;
    }

    public void setUtensilios(List<Utensilio> utensilios) {
        this.utensilios = utensilios;
    }

    @Override
    public String toString() {
        return "Receta: [Tiempo de coccion: " + tiempoCoccion + ", Ingredientes: " + Arrays.toString(new List[]{ingredientes}) + ", Preparacion: " + preparacion + "]";
    }

    public void ingredientes_faltantes(Despensa despensa)
    {
        for (Ingrediente ingrediente_necsario : this.getIngredientes())
        {
            // El if es necesario para no sacar ningun ingrediente que sí esté disponible
            if (!despensa.dispIngrediente(ingrediente_necsario.getNombre(), ingrediente_necsario.getCantidad()))
            {
                System.out.println(despensa.getIngrediente(ingrediente_necsario.getNombre(),ingrediente_necsario.getCantidad()));
            }
        }
    }




}
