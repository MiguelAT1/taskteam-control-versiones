import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { TareaService } from '../../services/tarea';
import { Tarea } from '../../models/tarea';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.css'
})
export class Dashboard implements OnInit {

  tareas: Tarea[] = [];

  constructor(private tareaService: TareaService) {}

  ngOnInit(): void {
    this.tareas = this.tareaService.listarTareas();
  }
}
