package com.boundarytest;

public class ScoreUpdateAfterBoundaryTest {
    private final float X;
    private final  float Y;

    public ScoreUpdateAfterBoundaryTest(float x, float y) {
        X = x;
        Y = y;
    }

    public float getX() {
        return X;
    }

    public float getY() {
        return Y;
    }

    public boolean checkFinalExam(float X, float Y) {
        float finalExamScore = 0;
        finalExamScore = (float) ((0.4 * X) + (0.6 * Y));
        if(finalExamScore >= 4){
            return true;
        }
        else
            return false;
    }
    public boolean checkVstep(float Y){
        float VstepScore = Y;
        if(VstepScore >= 6){
            return true;
        }
        else
            return false;
    }
    public boolean show(){
        float X = this.getX();
        float Y = this.getY();
        if(checkFinalExam(X, Y) == true && (checkVstep(Y) == true)){
            return true;
        }
        else
            return false;
    }
}

