public class Question {

        private String text;
        private String answer;
        private int difficulty;

//constructor
        Question(){
            text = "none";
            answer = "none";
            difficulty = 0;
        }

//overloaded constructor
        Question(String text, String answer, int difficulty){
            this.text = text;
            this.answer = answer;
            this.difficulty = difficulty;
        }


        //getters
        public String getText () {
            return this.text;
        }

        public  String getAnswer () {
            return this.answer;
        }

        public int getDifficulty () {
            return this.difficulty;
        }


        //setters
        public void setText (String text){
            this.text = text;
        }
        public void setAnswer (String answer){
            this.answer = answer;
        }

        public void setDifficulty ( int difficulty){
            this.difficulty = difficulty;
        }

}
