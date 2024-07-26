public class ProgrammingCourseFactory implements LearningMaterialFactory{

    @Override
    public Video createVideo() {
        return new AdvancedProgrammingVideo();
    }

    @Override
    public Quiz createQuiz() {
        return new ProgrammingQuiz();
    }

    @Override
    public Article createArticle() {
        return new PatternsArticle();
    }
}
