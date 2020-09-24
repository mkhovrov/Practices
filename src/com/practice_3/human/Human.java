package com.practice_3.human;

public class Human {

    public com.practice_3.human.Head head;
    public com.practice_3.human.Leg leftLeg, rightLeg;
    public com.practice_3.human.Hand leftHand, rightHand;

    public Human(String headColor, String eyeColor, int speed, int strenght) {
        this.head = new com.practice_3.human.Head(headColor, eyeColor);
        this.leftLeg = new com.practice_3.human.Leg(false, speed);
        this.rightLeg = new com.practice_3.human.Leg(true, speed);
        this.leftHand = new com.practice_3.human.Hand(false, strenght);
        this.rightHand = new com.practice_3.human.Hand(true, strenght);
    }

    public void setHead(com.practice_3.human.Head head) {
        this.head = head;
    }
    public com.practice_3.human.Head getHead() {
        return head;
    }

    public void setLeftLeg(com.practice_3.human.Leg leftLeg) {
        this.leftLeg = leftLeg;
    }
    public com.practice_3.human.Leg getLeftLeg() {
        return leftLeg;
    }


    public void setRightLeg(com.practice_3.human.Leg rightLeg) {
        this.rightLeg = rightLeg;
    }
    public com.practice_3.human.Leg getRightLeg() {
        return rightLeg;
    }

    public void setLeftHand(com.practice_3.human.Hand leftHand) {
        this.leftHand = leftHand;
    }
    public com.practice_3.human.Hand getLeftHand() {
        return leftHand;
    }

    public void setRightHand(com.practice_3.human.Hand rightHand) {
        this.rightHand = rightHand;
    }
    public com.practice_3.human.Hand getRightHand() {
        return rightHand;
    }

    public String canDo() {
        return head.canDo() + "\n" +
                rightHand.canDo() + "\n" +
                leftHand.canDo() + "\n" +
                rightLeg.canDo() + "\n" +
                leftLeg.canDo();
    }
}
