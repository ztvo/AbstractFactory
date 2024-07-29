import factory.ILearningMaterialFactory;
import products.interfaces.IArticle;
import products.interfaces.IQuiz;
import products.interfaces.IVideo;

public class OnlineCourse {
    private final IArticle articleOnlineCourse;
    private final IVideo videoOnlineCourse;
    private final IQuiz quizOnlineCourse;

    public OnlineCourse(ILearningMaterialFactory factory) {
        System.out.println("Creating online course");
        articleOnlineCourse = factory.createArticle();
        videoOnlineCourse = factory.createVideo();
        quizOnlineCourse = factory.createQuiz();
    }

}
