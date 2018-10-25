package enumeration;

public class Week {
    Day day;

    public Week() {
    }

    public Week(Day day) {
        this.day = day;
    }

    public void whatToDo(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("Start working on codeLab");
                break;
            case TUESDAY:
                System.out.println("Start working on Homework");
                break;
            case WEDNESDAY:
                System.out.println("Join Mentoring Session");
                break;
            case THURSDAY:
                System.out.println("Join Group Discussion");
                break;
            case FRIDAY:
                System.out.println("Submit Homework, Then play soccer");
                break;
            case SATURDAY:
                System.out.println("Start working on codeLab");
                break;
            case SUNDAY:
                System.out.println("Start working on codeLab");
                break;
            default:
                System.out.println("Is this guy out of his mind?");
                break;

        }

    }
}
