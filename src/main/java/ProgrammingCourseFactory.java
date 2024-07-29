public class ProgrammingCourseFactory implements LearningMaterialFactory{

    @Override
    public Video createVideo() {
        System.out.println("Creating Video for Programming Course");
        return new AdvancedProgrammingVideo();
    }

    @Override
    public Quiz createQuiz() {
        System.out.println("Creating Quiz for Programming Course");
        return new ProgrammingQuiz();
    }

    @Override
    public Article createArticle() {
        System.out.println("Creating Article for Programming Course");
        return new PatternsArticle();
    }
}
