package FlowerOrderProjectUI;

import javax.swing.JFrame;

import FlowerOrderProgramProject.FlowerLoginView;

// 로그인 화면 실행을 위한 코드

public class flowerMainProgram{
   public FlowerLoginView flowerloginView;
   flowerFrm flowerFrm;
  
   public static void main(String[] args) {
      
       // 메인클래스 실행
       flowerMainProgram main = new flowerMainProgram();
       main.flowerloginView = new FlowerLoginView(); // 로그인창 보이기
       main.flowerloginView.setMain(main); // 로그인창에게 메인 클래스보내기
   }
  
   // 테스트프레임창
   public void showFrameTest(){
       flowerloginView.dispose(); // 로그인창닫기
       this.flowerFrm = new flowerFrm(); // 테스트프레임 오픈
   }

}
