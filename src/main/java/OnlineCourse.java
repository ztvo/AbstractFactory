public class OnlineCourse {
    private final Article articleOnlineCourse;
    private final Video videoOnlineCourse;
    private final Quiz quizOnlineCourse;

    public OnlineCourse(LearningMaterialFactory factory) {
        System.out.println("Creating online course");
        articleOnlineCourse = factory.createArticle();
        videoOnlineCourse = factory.createVideo();
        quizOnlineCourse = factory.createQuiz();
    }

}
