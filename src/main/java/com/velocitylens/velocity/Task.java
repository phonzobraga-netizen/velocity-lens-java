package com.velocitylens.velocity;

public final class Task {
  public final String name;
  public final double impact;
  public final double urgency;
  public final double effort;
  public final double confidence;

  public Task(String name, double impact, double urgency, double effort, double confidence) {
    this.name = name;
    this.impact = impact;
    this.urgency = urgency;
    this.effort = effort;
    this.confidence = confidence;
  }
}


