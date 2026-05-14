import { Injectable } from '@angular/core';
import { Tarea } from '../models/tarea';

@Injectable({
  providedIn: 'root'
})
export class TareaService {

  private tareas: Tarea[] = [
    {
      id: 1,
      titulo: 'Configurar repositorio GitHub',
      descripcion: 'Crear ramas main, develop y feature.',
      prioridad: 'ALTA',
      completada: false
    },
    {
      id: 2,
      titulo: 'Configurar GitHub Actions',
      descripcion: 'Crear pipeline CI para ejecutar pruebas.',
      prioridad: 'MEDIA',
      completada: false
    },
    {
      id: 3,
      titulo: 'Documentar flujo GitFlow',
      descripcion: 'Explicar ramas, PR, merges y conflictos.',
      prioridad: 'ALTA',
      completada: true
    }
  ];

  listarTareas(): Tarea[] {
    return this.tareas;
  }
}
