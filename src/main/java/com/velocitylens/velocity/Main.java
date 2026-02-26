package com.velocitylens.velocity;

import java.util.List;

public final class Main {
  public static void main(String[] args) {
    List<Task> tasks = List.of(
        new Task("Portfolio refresh", 9.2d, 8.0d, 4.0d, 0.9d),
        new Task("Telemetry cleanup", 8.0d, 6.8d, 3.0d, 0.85d),
        new Task("Minor UI copy pass", 5.0d, 4.5d, 2.0d, 0.95d));

    List<Planner.RankedTask> sprint = Planner.buildSprint(tasks, 6.5d);
    System.out.println("Velocity Lens sprint batch:");
    for (Planner.RankedTask item : sprint) {
      System.out.printf("- %s (score=%.3f)%n", item.task.name, item.score);
    }
  }
}


