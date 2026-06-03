package com.taskteam.backend.service;

import com.taskteam.backend.model.Tarea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TareaServiceTest {

    @Test
    void debeGuardarTareaCorrectamente() {

        TareaService tareaService = new TareaService();

        Tarea tarea = new Tarea();
        tarea.setTitulo("Configurar GitHub Actions");
        tarea.setDescripcion("Crear pipeline CI");
        tarea.setPrioridad("ALTA");

        Tarea tareaGuardada = tareaService.guardarTarea(tarea);

        assertNotNull(tareaGuardada.getId());
        assertEquals("Configurar GitHub Actions", tareaGuardada.getTitulo());
        assertEquals("ALTA", tareaGuardada.getPrioridad());
        assertFalse(tareaGuardada.isCompletada());
    }

    @Test
    void debeAsignarPrioridadMediaPorDefecto() {

        TareaService tareaService = new TareaService();

        Tarea tarea = new Tarea();
        tarea.setTitulo("Tarea sin prioridad");

        Tarea tareaGuardada = tareaService.guardarTarea(tarea);

        assertEquals("MEDIA", tareaGuardada.getPrioridad());
    }

    @Test
    void debeLanzarExcepcionCuandoTituloEsVacio() {

        TareaService tareaService = new TareaService();

        Tarea tarea = new Tarea();
        tarea.setTitulo("");

        RuntimeException exception = assertThrows(
                RuntimeException.class,
                () -> tareaService.guardarTarea(tarea)
        );

        assertEquals("El título es obligatorio", exception.getMessage());
    }
}