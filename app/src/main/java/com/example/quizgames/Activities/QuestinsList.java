package com.example.quizgames.Activities;

public class QuestinsList {
    private String question, option1, option2, option3,option4,answer;
    private String userselectedanswer;

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOption1(String option1) {
        this.option1 = option1;
    }

    public void setOption2(String option2) {
        this.option2 = option2;
    }

    public void setOption3(String option3) {
        this.option3 = option3;
    }

    public void setOption4(String option4) {
        this.option4 = option4;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public void setUserselectedanswer(String userselectedanswer) {
        this.userselectedanswer = userselectedanswer;
    }

    public QuestinsList(String question, String option1, String option2, String option3, String option4, String answer, String userselectedanswer) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.answer = answer;
        this.userselectedanswer = userselectedanswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getOption1() {
        return option1;
    }

    public String getOption2() {
        return option2;
    }

    public String getOption3() {
        return option3;
    }

    public String getOption4() {
        return option4;
    }

    public String getAnswer() {
        return answer;
    }

    public String getUserselectedanswer() {
        return userselectedanswer;
    }
}
