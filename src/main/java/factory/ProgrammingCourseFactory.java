package factory;

import products.interfaces.IArticle;
import products.interfaces.IQuiz;
import products.interfaces.IVideo;
import products.programming.AdvancedProgrammingVideo;
import products.programming.PatternsArticle;
import products.programming.ProgrammingQuiz;

public class ProgrammingCourseFactory implements ILearningMaterialFactory {

    @Override
    public IVideo createVideo() {
        System.out.println("Creating Video for Programming Course");
        return new AdvancedProgrammingVideo();
    }

    @Override
    public IQuiz createQuiz() {
        System.out.println("Creating Quiz for Programming Course");
        return new ProgrammingQuiz();
    }

    @Override
    public IArticle createArticle() {
        System.out.println("Creating Article for Programming Course");
        return new PatternsArticle();
    }
}
