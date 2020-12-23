package com.Quiz;

public class Game {
    Question[] questions=new Question[3];
    Player player=new Player();

    String[] questionsdata={"Current P.M of india","What is the closest planet to sun?","What is the capital of australia?"};
    String[] options1={"arun jatli","Earth","Sydney"};
    String[] options2={"nandra modi","Venus","Perth"};
    String[] options3={"Hulk","Mercury","Melbourne"};
    String[] options4={"Rahul ghandi","Jupiter","Canberra"};
    int[] answers={2,2,4};
    public void initGame()
    {
        for(int i=0;i<3;i++){
            questions[i]=new Question();
        }
        for(int i=0;i<3;i++)
        {

            questions[i].question=questionsdata[i];
            questions[i].option1=options1[i];
            questions[i].option2=options2[i];
            questions[i].option3=options3[i];
            questions[i].option4=options4[i];
            questions[i].correctAnswer=answers[i];
        }


    }
    public void play()
    {

        player.getDetails();
        for(int i=0;i<3;i++)
        {
            boolean status=questions[i].askQuestion();
            if(status==true)
            {
                System.out.println("Bahot hi unda khele hai aap!!");
                player.score=player.score+5;
            }
            else{
                System.out.println("Maaf karna mai aapki sahyata nahi kar sakta");
                player.score=player.score-5;
            }
        }

        System.out.println(player.name+" your score is "+player.score);

    }
}
