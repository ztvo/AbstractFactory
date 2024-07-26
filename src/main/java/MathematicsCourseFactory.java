public class MathematicsCourseFactory implements LearningMaterialFactory {

    @Override
    public Quiz createQuiz() {
        return new BasicMathQuiz();
    }

    @Override
    public Video createVideo() {
        return new BasicMainVideo();
    }

    @Override
    public Article createArticle() {
        return new AlgebraArticle();
    }
}
