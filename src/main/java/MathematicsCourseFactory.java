public class MathematicsCourseFactory implements LearningMaterialFactory {

    @Override
    public Quiz createQuiz() {
        System.out.println("Creating Quiz for Mathematics Course");
        return new BasicMathQuiz();
    }

    @Override
    public Video createVideo() {
        System.out.println("Creating Video for Mathematics Course");
        return new BasicMainVideo();
    }

    @Override
    public Article createArticle() {
        System.out.println("Creating Article for Mathematics Course");
        return new AlgebraArticle();
    }
}
