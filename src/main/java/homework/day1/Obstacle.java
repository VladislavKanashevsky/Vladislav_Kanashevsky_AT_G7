package homework.day1;

public class Obstacle {
    String severity;
    String description = "преграждающее наш проезд";

    public Obstacle() {
        description = "очень сильное";
        severity = "преграждающее наш проезд";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void printObstacleDetails() {
        System.out.println("Возникло" + getDescription() + " препятствие " + getSeverity());
    }
}
