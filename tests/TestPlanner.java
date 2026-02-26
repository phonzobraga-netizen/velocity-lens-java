import com.velocitylens.velocity.Planner;
import com.velocitylens.velocity.Task;
import java.util.List;

public final class TestPlanner {
  public static void main(String[] args) {
    testRankOrder();
    testSprintBudget();
    System.out.println("Velocity Lens Java tests passed.");
  }

  private static void testRankOrder() {
    List<Task> tasks = List.of(
        new Task("low", 4.0d, 4.0d, 5.0d, 0.8d),
        new Task("high", 9.0d, 8.5d, 3.0d, 0.9d));

    List<Planner.RankedTask> ranked = Planner.rank(tasks);
    assert "high".equals(ranked.get(0).task.name) : "expected high to rank first";
  }

  private static void testSprintBudget() {
    List<Task> tasks = List.of(
        new Task("a", 8.0d, 8.0d, 4.0d, 0.8d),
        new Task("b", 7.0d, 7.0d, 4.0d, 0.85d),
        new Task("c", 6.0d, 6.0d, 3.0d, 0.9d));

    List<Planner.RankedTask> sprint = Planner.buildSprint(tasks, 7.0d);
    double used = 0.0d;
    for (Planner.RankedTask item : sprint) {
      used += item.task.effort;
    }
    assert used <= 7.0d : "sprint used more effort than budget";
  }
}


