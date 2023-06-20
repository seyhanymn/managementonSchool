package pojos;

import java.util.List;

public class lessonProgramPojo {
    //ikinci
    private int lessonProgramId;
    private String startTime;
    private String stopTime;
    private List<LessonNamePojo> lessonName;
    private String day;

    public int getLessonProgramId() {
        return lessonProgramId;
    }

    public void setLessonProgramId(int lessonProgramId) {
        this.lessonProgramId = lessonProgramId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public List<LessonNamePojo> getLessonName() {
        return lessonName;
    }

    public void setLessonName(List<LessonNamePojo> lessonName) {
        this.lessonName = lessonName;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public lessonProgramPojo() {
    }

    public lessonProgramPojo(int lessonProgramId, String startTime, String stopTime, List<LessonNamePojo> lessonName, String day) {

        this.lessonProgramId = lessonProgramId;
        this.startTime = startTime;
        this.stopTime = stopTime;
        this.lessonName = lessonName;
        this.day = day;
    }

    @Override
    public String  toString() {
        return "lessonProgramPojo{" +
                "lessonProgramId=" + lessonProgramId +
                ", startTime='" + startTime + '\'' +
                ", stopTime='" + stopTime + '\'' +
                ", lessonName=" + lessonName +
                ", day='" + day + '\'' +
                '}';
    }
    //lesson1 = new ArrayList<>();
    //        lesson1.add(lesson);
    //
    //
    //        LessonProgram1 lessonProgram = new LessonProgram1();
    //        lessonProgram.setLessonProgramId(43);
    //        lessonProgram.setStartTime("11:11:00");
    //        lessonProgram.setStopTime("15:15:00");
    //        lessonProgram.setLessonName(lesson1);
    //        lessonProgram.setDay("SUNDAY");

}
