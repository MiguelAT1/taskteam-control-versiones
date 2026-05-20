package com.taskteam.backend.controller;

import com.taskteam.backend.model.Tarea;
import com.taskteam.backend.service.TareaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tareas")
@CrossOrigin(origins = "*")
public class TareaController {

    private final TareaService tareaService;

    public TareaController(TareaService tareaService) {
        this.tareaService = tareaService;
    }

    @GetMapping
    public List<Tarea> listarTareas() {
        return tareaService.listarTareas();
    }

    @PostMapping
    public ResponseEntity<?> guardarTarea(@RequestBody Tarea tarea) {
        try {
            return ResponseEntity.ok(tareaService.guardarTarea(tarea));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }

    @PatchMapping("/{id}/completar")
    public ResponseEntity<Tarea> completarTarea(@PathVariable Long id) {
        Tarea tarea = tareaService.completarTarea(id);

        if (tarea != null) {
            return ResponseEntity.ok(tarea);
        }

        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarTarea(@PathVariable Long id) {
        boolean eliminada = tareaService.eliminarTarea(id);

        if (eliminada) {
            return ResponseEntity.ok("Tarea eliminada correctamente");
        }

        return ResponseEntity.notFound().build();
    }
}
