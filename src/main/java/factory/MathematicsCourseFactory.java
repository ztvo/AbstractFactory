package factory;

import products.interfaces.IArticle;
import products.interfaces.IQuiz;
import products.interfaces.IVideo;
import products.math.AlgebraArticle;
import products.math.BasicMainVideo;
import products.math.BasicMathQuiz;

public class MathematicsCourseFactory implements ILearningMaterialFactory {

    @Override
    public IQuiz createQuiz() {
        System.out.println("Creating Quiz for Mathematics Course");
        return new BasicMathQuiz();
    }

    @Override
    public IVideo createVideo() {
        System.out.println("Creating Video for Mathematics Course");
        return new BasicMainVideo();
    }

    @Override
    public IArticle createArticle() {
        System.out.println("Creating Article for Mathematics Course");
        return new AlgebraArticle();
    }
}
