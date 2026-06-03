package com.taskteam.backend.service;

import com.taskteam.backend.model.Tarea;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TareaService {

    private final List<Tarea> tareas = new ArrayList<>();
    private Long contadorId = 1L;

    public List<Tarea> listarTareas() {
        return tareas;
    }

    public Tarea guardarTarea(Tarea tarea) {
        if (tarea.getTitulo() == null || tarea.getTitulo().isBlank()) {
            throw new RuntimeException("El título es obligatorio");
        }

        if (tarea.getPrioridad() == null || tarea.getPrioridad().isBlank()) {
            tarea.setPrioridad("BAJA");
        }

        tarea.setId(contadorId++);
        tarea.setCompletada(false);

        tareas.add(tarea);
        return tarea;
    }

    public Tarea completarTarea(Long id) {
        for (Tarea tarea : tareas) {
            if (tarea.getId().equals(id)) {
                tarea.setCompletada(true);
                return tarea;
            }
        }
        return null;
    }

    public boolean eliminarTarea(Long id) {
        return tareas.removeIf(t -> t.getId().equals(id));
    }
}