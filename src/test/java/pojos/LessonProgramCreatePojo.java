package pojos;

public class LessonProgramCreatePojo {

    private lessonProgramPojo object;
    private String message;
    private String httpStatus;

    public lessonProgramPojo getObject() {
        return object;
    }

    public void setObject(lessonProgramPojo object) {
        this.object = object;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(String httpStatus) {
        this.httpStatus = httpStatus;
    }

    public LessonProgramCreatePojo() {
    }

    public LessonProgramCreatePojo(lessonProgramPojo object, String message, String httpStatus) {

        this.object = object;
        this.message = message;
        this.httpStatus = httpStatus;
    }

    @Override
    public String toString() {
        return "LessonProgramCreatePojo{" +
                "object=" + object +
                ", message='" + message + '\'' +
                ", httpStatus='" + httpStatus + '\'' +
                '}';
    }
}
//  ApiResponse apiResponse = new ApiResponse();
//        apiResponse.setObject(lessonProgram);
//        apiResponse.setMessage("Created Lesson Program");
//        apiResponse.setHttpStatus("CREATED");