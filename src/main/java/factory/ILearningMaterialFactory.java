package factory;

import products.interfaces.IArticle;
import products.interfaces.IQuiz;
import products.interfaces.IVideo;

public interface ILearningMaterialFactory {

    IVideo createVideo();

    IArticle createArticle();

    IQuiz createQuiz();

}
